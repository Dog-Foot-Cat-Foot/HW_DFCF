
-- 1번
① 987.67

② 저장 오류(행 자체가 들어갈 수 없음). 정수 자릿수 부족으로 오류

③ 987

④ 9877

⑤ 저장 오류(행 자체가 들어갈 수 없음). 정수 자릿수 부족으로 오류

-- 2번
④ 


-- 3번

select *
from
  (
    select rownum RNUM, e.*
    from
      (select * from employee
        order by
          case substr(jumin_num, 7,1)
          when '1' then '19'
          when '2' then '19'
          else '20'
          end || substr(jumin_num,1,6) desc
      ) e
    where rownum<=20
  )
where RNUM>=11;


-- 4번
select
	m.month||'월' "생일월"
	, count(e.emp_no) "입사인원수"
	, nvl(floor(avg(to_number(to_char(sysdate,'YYYY'))
		- to_number(case substr(e.jumin_num,7,1)
			when '1' then '19'
			when '2' then '19'
			when '3' then '20'
            when '4' then '20'
            else to_char(to_number(to_char(sysdate,'YYYY'))+1)
			end ||substr(e.jumin_num,1,2)) +1)), 0)
		"평균 나이"
	, nvl(round(avg(e.salary),1), 0) "평균연봉"
from
	(select '01' "MONTH" from dual union
		select '02' from dual union
		select '03' from dual union
		select '04' from dual union
		select '05' from dual union
		select '06' from dual union
		select '07' from dual union
		select '08' from dual union
		select '09' from dual union
		select '10' from dual union
		select '11' from dual union
		select '12' from dual 
	)m, employee e
where
	substr(e.jumin_num(+), 3,2) = m.month
group by
	m.month||'월'
order by 1;
