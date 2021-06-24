select
	emp_name "직원명"
	, dep_no "부서번호"
	, round((salary/12)/21.5, 1) "하루급여"
	, round(((salary/12)/21.5)/8, 3) "시급"
from
	employee;
