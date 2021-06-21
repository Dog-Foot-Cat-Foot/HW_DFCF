select
	e.emp_no "직원번호"
	,e.emp_name "직원명"
	,d.dep_no "소속부서 번호"
	,d.dep_name "소속부서명"
from
	employee e, dept d
where
	e.dep_no = d.dep_no;
