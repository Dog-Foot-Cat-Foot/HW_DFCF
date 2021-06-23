select
	emp_name "직원명"
	, jikup "직급"
from
	employee
where
	dep_no 
	in (select dep_no from dept where dep_name = '영업부');
