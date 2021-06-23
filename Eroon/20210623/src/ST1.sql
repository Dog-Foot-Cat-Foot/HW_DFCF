select
	e1.emp_name "직원명"
	, e1.hire_date "입사일"
from
	employee e1
where
	e1.hire_date
	> (select e2.hire_date from employee e2 
				where e2.emp_name ='임꺽정');
