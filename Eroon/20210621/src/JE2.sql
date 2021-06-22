select
	e.emp_name "직원명"
	, e.jikup "직원직급"
	, d.dep_name "소속부서명"
	, s.sal_grade_no "연봉등급"
from
	employee e, dept d, salary_grade s
where
	e.dep_no = d.dep_no
	and e.salary between s.min_salary and s.max_salary
order by
	case substr(jumin_num, 7,1)
	where '1' then '19'
	where '2' then '19'
	else '20'
	end ||substr(jumin_num, 1,6)
	asc;
