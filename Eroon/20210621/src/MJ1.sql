select
    *
from
    employee
where
    emp_name like '이%'
    and
    to_number(to_char(sysdate, 'YYYY'))
    -
    to_number(
    case substr(jumin_num, 7,1)
    when '1' then '19'
    when '2' then '19'
    else '20'
    end || substr(jumin_num, 1,2)
    )+1 between 60 and 69;
