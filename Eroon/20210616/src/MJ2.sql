select
    cus_no
    , cus_name
    ,floor((to_number(to_char(sysdate,'YYYY'))
        - to_number(
            case
                substr(jumin_num, 7,1)
                when '1' then '19'
                when '2' then '19'
                else '20'
                end
                ||substr(jumin_num,1,2)
                )+1)*0.1
                )||'0대'      
from
    customer;
