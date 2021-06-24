select
  s.sal_grade_no "연봉등급"
  , e.jikup "직급"
  , count(*) "직원수"
  , round(avg(e.salary),1) "평균 연봉"
  , round(avg(
      to_number(to_char(sysdate, 'YYYY'))
      -
      to_number(decode(substr(e.jumin_num,7,1)
      , '1', '19'
      , '2', '19'
      , '20')||substr(e.jumin_num,1,2))+1
  ),1) "평균 나이"
from 
  salary_grade s, employee e
group by
   s.sal_grade_no, e.jikup
order by
  1;
