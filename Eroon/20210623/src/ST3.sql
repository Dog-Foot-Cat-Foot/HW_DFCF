select
	e.emp_name "직원명"
	, e.salary "연봉"
	, d.dep_name "부서명"
from
	employee e, dept d
where
	e.dep_no = d.dep_no
	and
	e.jikup in (select e2.jikup from employee e2 where e2.emp_name='이순신')
	and emp_name <> '이순신';
