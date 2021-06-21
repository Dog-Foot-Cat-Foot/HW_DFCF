select
*
from
    customer
where
    substr(jumin_num,1,1) = '7'
    and
    cus_name like '%이'
order by
    to_number(
    case
        substr(jumin_num,7,1)
    when '1' then '19'
    when '2' then '19'
    else '20'
    end || substr(jumin_num,1,2))
    desc;
