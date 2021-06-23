select
  e1.emp_no "직원번호"
  , e1.emp_name "직원명"
  , extract(year from sysdate)
  	- extract(year from
      to_date(
  	case substr(e1.jumin_num, 7,1)
  	when '1' then '19'
  	when '2' then '19'
  	else '20'
  	end ||substr(e1.jumin_num,1,2),'YYYY'))
  "나이"
  , e1.hire_date "입사일"
  , (select count(*)+1 from employee e2
      where e2.hire_date<e1.hire_date)
  "입사일 순위"
from employee e1
order by
  4 asc;
