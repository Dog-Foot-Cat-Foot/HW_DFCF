select
    emp_no          as "직원 번호"
    , emp_name      as "직원 명"
    , jikup         as "직급"
    , salary        as "연봉"
    , nvl(mgr_emp_no||'', '없음')    
        as "직속 상관 번호"
from
    employee;
