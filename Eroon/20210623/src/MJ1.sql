select
	c.cus_no "고객번호"
	, c.cus_name "고객명"
	, e.emp_no "담당직원번호"
	, d.dep_name "담당직원부서명"
from
	customer c, employee e, dept d, employee e2
where
	c.emp_no = e.emp_no
	and e.dep_no = d.dep_no
	and e.mgr_emp_no = e2.emp_no
	and e2.emp_name = '이성계';  
