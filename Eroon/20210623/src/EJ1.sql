select
	d.dep_name "부서명"
	, e.emp_no "직원번호"
	, e.emp_name "직원이름"
	, e.jikup "직급"
	, (select count(*) from customer c 
			where c.emp_no = e.emp_no)
		"담당고객수"
from
	dept d, employee e
