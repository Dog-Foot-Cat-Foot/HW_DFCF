select
	dep_no "부서번호"
    ,emp_no "직원명"
    , hire_date "입사일"
	, to_char(sysdate, 'YYYY-MM-DD') "현재날짜"
from employee
where
    (extract(year from sysdate)-extract(year from hire_date))>=30;
    --add_months(hire_date,30*12)<sysdate;
