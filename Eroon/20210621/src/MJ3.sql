select
    c.cus_name "고객이름"
    , c.tel_num "전화번호"
    , e.emp_name "담당직원 이름"
from
    customer c, employee e
where
    c.emp_no = e.emp_no
order by
    "고객이름" desc;
