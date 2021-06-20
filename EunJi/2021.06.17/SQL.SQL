--은지 1
select
    emp_no
    ,emp_name
    ,jikup
    ,salary
    ,nvl(mgr_emp_no||'','없음')
from
    employee;

--은지2
select
    emp_no
    ,emp_name
    ,jikup
    ,salary
    ,substr(phone,1,3)||'-'||substr(phone,4,4)||'-'||substr(phone,8,4)
from
    employee;

--이현1
select
    cus_no
    ,cus_name
    ,case when substr(jumin_num,7,1) = '1' then '19'
          when substr(jumin_num,7,1) = '2' then '19'
          else '20' end
          ||substr(jumin_num,1,2)||'.'||substr(jumin_num,3,2)||'.'||substr(jumin_num,5,2)
    ,case when substr(jumin_num,7,1) = '1' then '남'
          when substr(jumin_num,7,1) = '3' then '남'
          else '여' end
from
    customer;

--이현2
select
    cus_no        as "고객번호"
    ,cus_name     as "고객명"
    ,tel_num        as "전화번호"
    ,nvl2(emp_no,'o','x')
from
    customer
    order by "전화번호" asc;

--이현3
 select
    cus_no
    ,cus_name
    ,substr(jumin_num,1,6)||'-'||substr(jumin_num,7,1)||'******'  as "주민번호"

from customer
    order by
        case when substr(jumin_num,7,1) = '1' then '19'
            when substr(jumin_num,7,1) = '2' then '19'
            else '20' end  || substr(jumin_num,1,6)
            asc;

--명진1
select count(distinct mgr_emp_no) from employee;

--명진2
select
    to_date(sysdate,'YYYY')
    -to_date(case when substr(jumin_num,7,1) = '1' then '19'
                  when substr(jumin_num,7,1) = '2' then '19'
                  else '20'
                  end  || substr(jumin_num,1,2))*0.1||'대'

from customer;

--명진3
select
    cus_name
    ,substr(jumin_num,3,2)||'월'||substr(jumin_num,5,2)||'일'
from customer;

--소희1
SELECT
    ANIMAL_ID
FROM
    ANIMAL_INS
    WHERE NAME IS NULL
    ORDER BY ANIMAL_ID ASC;

--소희2
SELECT
    MAX(DATETIME)
FROM ANIMAL_INS;
