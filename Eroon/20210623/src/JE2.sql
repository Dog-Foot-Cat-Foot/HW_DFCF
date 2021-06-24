select * from employee
where
	mgr_emp_no is not null
	and (jikup = '사원' or jikup = '과장')
	and (emp_name like '%라%' or emp_name like '%만%');
