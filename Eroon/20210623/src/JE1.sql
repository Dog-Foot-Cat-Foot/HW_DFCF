select 
	e.emp_name "직원명"
	, e.emp_no "직원번호"
	, d.dep_name "부서명"
from
	employee e inner join dept d
on
	e.dep_no = d.dep_no
where
   e.emp_name like '%김%'
	and (e.dep_no = 10 or e.dep_no = 30)
	and e.salary not between 1000 and 2000;
