select
	emp_name "직원명"
	, dep_no "부서명"
	, to_char(next_day(add_months(hire_date, 3), 2),'YYYY-MM-DD')"정직원이되는날짜"
	, nvl2(mgr_emp_no, 'Y', 'N') "직속상관유무"
from
	employee;
