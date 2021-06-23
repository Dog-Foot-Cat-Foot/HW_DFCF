select
	c.cus_no "고객번호"
	, c.cus_name "고객명"
	, nvl2(e.mgr_emp_no, 'O','X') "담당직원유무"
	, nvl(e.emp_name,'X') "담당직원명"
	, nvl(s.sal_grade_no||'', 'X') "담당직원연봉등급"
from
	customer c, employee e, salary_grade s
where
	c.emp_no = e.emp_no(+)
	and e.salary between s.min_salary(+) and s.max_salary(+);
