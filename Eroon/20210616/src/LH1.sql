select
   cus_no     as "고객번호"
   , cus_name  as "고객명"
   , '19'||substr(jumin_num,1,2)
       ||'.'||substr(jumin_num,3,2)
       ||'.'||substr(jumin_num,5,2)
       as "생년월일"
   , case substr(jumin_num, 7,1)
       when '2' then '여'
       when '4' then '여'
       else '남'
       end
   as "성별"
from
   customer;
