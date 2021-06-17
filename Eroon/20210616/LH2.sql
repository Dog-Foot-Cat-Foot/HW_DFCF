select
    cus_no      as "고객번호"
    , cus_name  as "고객명"
    , tel_num   as "전화번호"
    , nvl2(emp_no, 'O', 'X')
from
    customer
order by
    tel_num
    asc;
