select 
	emp_no "직원 번호"
	, emp_name "직원 이름"
	, dep_no "부서 번호"
	, round(months_between(sysdate, hire_date),1)
	"현재까지 근무 월 수"
from
	employee
where
	dep_no = 10;
