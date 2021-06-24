select
    emp_name "직원명"
    , hire_date "입사일"
    , floor(months_between(sysdate, hire_date)) "근무개월"
from employee;
