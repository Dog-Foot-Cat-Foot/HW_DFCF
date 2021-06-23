select
  c1.cus_no "고객번호"
  ,c1.cus_name "고객명"
  ,c1.jumin_num "주민번호"
  ,(select count(*)+1 from customer c2
      where
      to_date(
      case substr(c2.jumin_num,7,1)
      when '1' then '19'
      when '2' then '19'
      else '20'
      end||substr(c2.jumin_num,1,6),'YYYYMMDD')
      < to_date(
      case substr(c1.jumin_num,7,1)
      when '1' then '19'
      when '2' then '19'
      else '20'
      end||substr(c1.jumin_num,1,6),'YYYYMMDD')
      )"생일순위"
from customer c1
order by 4 desc;
