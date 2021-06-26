select
    dep_no
    , emp_no
    , emp_name
    , jikup
    , salary
    , substr(jumin_num,1,6)||'-'||substr(jumin_num, 7) "주민번호"
    , substr(phone,1,3)||'-'||substr(phone, 4,4)||'-'||substr(phone,8) "핸드폰번호"
from
    employee
order by
    decode(jikup
    , '사장',1
    , '부장',2
    , '과장',3
    , '대리',4
    ,5) asc;
