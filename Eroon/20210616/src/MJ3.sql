select
    cus_no
    , cus_name
    , to_char(
    to_date(
        substr(jumin_num, 3, 4)
        , 'MMDD')
    ,'MM"월 "DD"일"')
from
    customer;
