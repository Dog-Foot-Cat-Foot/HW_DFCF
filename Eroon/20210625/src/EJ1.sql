select
    c.cus_no
    , c.cus_name
    , to_number(extract(year from sysdate))
        - to_number(case substr(c.jumin_num, 7,1)
            when '1' then '19'
            when '2' then '19'
            else '20'
            end||substr(c.jumin_num,1,2))+1 ||'세' "고객나이"
    , nvl(e.emp_no||'','없음') "담당직원번호"
from customer c, employee e
where e.emp_no = c.emp_no
order by 
    to_number(extract(year from sysdate))
        - to_number(case substr(c.jumin_num, 7,1)
            when '1' then '19'
            when '2' then '19'
            else '20'
            end||substr(c.jumin_num,1,2))+1;
