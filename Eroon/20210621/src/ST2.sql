select
	*
from
	employee
where
	dep_no not in(10)
	and
	hire_date>to_date('1987-01-01', 'YYYY-MM-DD');
	
