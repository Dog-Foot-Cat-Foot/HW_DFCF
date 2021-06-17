select
    cus_no
    , cus_name
    , substr(jumin_num, 1,6)
    ||'-'||substr(jumin_num,7,1)||'******'
from
    customer
order by
    to_number(
    case
        substr(jumin_num, 7, 1)
        when '1' then '19'
        when '2' then '19'
        else '20'
        end || substr(jumin_num,1,2)
    )
    asc;
