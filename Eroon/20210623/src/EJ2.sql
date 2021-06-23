select
	e.emp_no "직원번호"
	, e.emp_name "직원이름"
	, e.jikup "직급"
	, e.salary "연봉"
from
	employee e
where
	(select count(*) from customer c 
			where c.emp_no = e.emp_no) = 1;
