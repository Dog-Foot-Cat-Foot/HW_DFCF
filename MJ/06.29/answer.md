이현 Q1

1. 987.67
2. 저장 오류(정수 자릿수 부족)
3. 987
4. 9877
5. 저장 오류(정수 자릿수 부족)

이현 Q2

3!!

이현 Q3
```sql
select 
	*
from
	(select
		rownum RNUM
		,e.*
	from
		(select
			*
		from
			employee
		order by
			decode(substr(jumin_num,7,1),'1','19','2','19','20')||substr(jumin_num,1,6) desc) e
	where rownum<=20)
where RNUM >=11
```
이현 Q4
```sql
select
	m.month||'월' "생일월"
	,(select count(*)
		from
			employee e
		where
			to_char(to_date(decode(substr(jumin_num,7,1),'1','19','2','19','20')
            			||substr(jumin_num,1,6),'yyyy-mm-dd'),'mm') = m.month) "입사인원수"
	,(select 
		nvl(round(avg(to_number(to_char(sysdate,'yyyy'))
		-to_number(decode(substr(jumin_num,7,1),'1','19','2','19','20')
		||substr(jumin_num,1,2))),1)||'','없음')
	from
		employee
    	where 
        		to_char(to_date(decode(substr(jumin_num,7,1),'1','19','2','19','20')
            		||substr(jumin_num,1,6),'yyyy-mm-dd'),'mm') = m.month) "평균나이"
	,(select 
		nvl(round(avg(salary),1)||'','없음')
	 from 
		employee
       	 where
           		 to_char(to_date(decode(substr(jumin_num,7,1),'1','19','2','19','20')
            		||substr(jumin_num,1,6),'yyyy-mm-dd'),'mm') = m.month) "평균연봉"
from
	  (select '01' "MONTH" from dual union
		select '02' from dual union select '03' from dual union select '04' from dual union
		select '05' from dual union select '06' from dual union select '07' from dual union
		select '08' from dual union select '09' from dual union select '10' from dual union
		select '11' from dual union select '12' from dual
	  ) m
group by
   	m.month
order by
    	m.month
```
소희 Q1

페이징 처리란?
	행의 개수를 지정하여 보이게 하는것
