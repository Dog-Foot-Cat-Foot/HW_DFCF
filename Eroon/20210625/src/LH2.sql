select
  case substr(jumin_num,7,1)
  when '1' then '19'
  when '2' then '19'
  else '20'
  end||substr(jumin_num,1,1)||'0년대'
  "출생년대"
  , substr(jumin_num,3,2)||'월'
  "출생월"
  , count(*) "직원수"
  , round(avg(
      to_number(extract(year from sysdate))
      - to_number(case substr(jumin_num,7,1)
          when '1' then '19'
          when '2' then '19'
          else '20'
          end || substr(jumin_num, 1,2))+1),1)
      "평균나이"
  , min(case substr(jumin_num,7,1)
          when '1' then '19'
          when '2' then '19'
          else '20'
          end || substr(jumin_num, 1,2))
      "나이가가장많은사람"
  , max(case substr(jumin_num,7,1)
          when '1' then '19'
          when '2' then '19'
          else '20'
          end || substr(jumin_num, 1,2))
      "나이가가장적은사람"
from
   employee
group by
  case substr(jumin_num,7,1)
  when '1' then '19'
  when '2' then '19'
  else '20'
  end||substr(jumin_num,1,1)||'0년대'
  , substr(jumin_num,3,2)||'월'
order by
  1, 2;
