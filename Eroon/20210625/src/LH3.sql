select
  '010-'||substr(phone,4,1)||'XXX-XXXX' "핸드폰앞자리첫번째수"
  , count(*)||'명' "직원수"
  , floor(avg(salary))||'만원' "평균연봉"
from
  employee
group by 
  substr(phone,4,1)
having
  count(*) >=2;
