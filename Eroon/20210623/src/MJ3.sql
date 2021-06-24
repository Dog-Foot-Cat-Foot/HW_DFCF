-- JOIN
select
	e.emp_no "직원번호"
	, e.emp_name "직원명"
	, e.salary "연봉"
	, s.sal_grade_no "연봉등급"
from
	employee e, salary_grade s
where
	e.mgr_emp_no in (select e2.emp_no from employee e2 where e2.salary>=3000)
    and e.salary between s.min_salary and s.max_salary;

-- SUBQUERY
select
	e.emp_no "직원번호"
	, e.emp_name "직원명"
	, e.salary "연봉"
	,(select s.sal_grade_no from salary_grade s
		where e.salary between s.min_salary and s.max_salary) "연봉등급"
from
	employee e
where
		e.mgr_emp_no in (select e2.emp_no from employee e2 where e2.salary>=3000);
