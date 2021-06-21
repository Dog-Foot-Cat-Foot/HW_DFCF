select
	*
from
	employee
where
	salary<(select avg(salary) from employee);
