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

소희 Q2

검색결과가 없음.

소희 Q3
```sql
select
	c.cus_no "고객번호"
	,c.cus_name "고객명"
	,to_number(to_char(sysdate,'yyyy'))
	-to_number(decode(substr(c.cus_jumin,7,1),'1','19','2','19','20')
	||substr(c.cus_jumin,1,2))+1 "고객나이"
	,(select e.emp_no 
	from employee e
	where e.emp_no = c.emp_no) "담당직원번호"
	,(select e.emp_name 
	from employee e
	where e.emp_no = c.emp_no) "담당직원명"
	,(select e.jikup 
	from employee e
	where e.emp_no = c.emp_no) "직급"
	,(select d.dep_name 
	from employee e, dept d
	where e.emp_no = c.emp_no and d.dep_no = e.dep_no) "담당직원부서명"
	,(select d.loc
	from employee e, dept d
	where e.emp_no = c.emp_no and d.dep_no = e.dep_no) "부서위치"
from
	(select
        		*
    	from
        		(select
            			rownum RNUM, zxc.*
        		from
            			(select * 
            			from customer 
            			order by to_number(to_char(sysdate,'yyyy'))
                			-to_number(decode(substr(cus_jumin,7,1),'1','19','2','19','20')
               			||substr(cus_jumin,1,2))+1 desc) zxc
        		where 
           			rownum <= 8)
    	where RNUM>=3) c
```			
소희 Q4
```sql
select
	e.emp_no "직원번호"
	,e.emp_name "직원명"
	,e.dep_no "부서번호"
	,(select dep_name from dept d where d.dep_no = e.dep_no) "부서명"
	,e.jikup "직급"
	,e.salary "연봉"
	,(select s.sal_grade_no 
	from salary_grade s
	where e.salary between min_salary and max_salary) "연봉등급"
	,to_char(e.hire_date,'yyyy-mm-dd "("dy")" q"/4분기"','nls_date_language = korean') "입사일"
from
	(select
		*
	from
        		(select
          			rownum RNUM, zxc.*
        		from
            			(select e1.*
            			from employee e1, employee e2
            			where e1.mgr_emp_no = e2.emp_no
            			order by e1.hire_date) zxc
        		where  rownum <= 8)
    	where RNUM>=3) e
```
은지 Q1

inner join, outer join, self join, cross join

은지 Q2

A. from, B. subquery, C. inline view

은지 Q3
```sql
select
	c.cus_no "고객번호"
	,c.cus_name "고객명"
	,substr(c.cus_jumin,1,6)||'-'||substr(c.cus_jumin,7,7) "고객주민번호"
	,substr(c.tel_num,1,3)||'-'||substr(c.tel_num,4,4)||'-'||substr(c.tel_num,8,4) "고객전화번호"
	,nvl((select e.emp_name 
    	      from employee e 
    	      where e.emp_no = c.emp_no),'없음')"담당직원이름"
	,nvl((select d.dep_name 
    	      from employee e, dept d 
    	      where e.emp_no = c.emp_no 
          		  and d.dep_no = e.dep_no),'없음')"담당직원부서명"
	,nvl((select s.sal_grade_no 
    	      from employee e, salary_grade s 
    	      where e.emp_no = c.emp_no 
          		  and e.salary between s.min_salary and s.max_salary)||'','없음')"담당직원연봉등급"
	,nvl((select e2.emp_name 
    	      from employee e1,employee e2 
    	      where e1.emp_no = c.emp_no 
          		  and e1.mgr_emp_no = e2.emp_no),'없음')"직속상관명"
	,nvl((select e2.jikup 
    	      from employee e1,employee e2 
    	      where e1.emp_no = c.emp_no 
          	  	  and e1.mgr_emp_no = e2.emp_no),'없음')"직속상관직급"
	,nvl((select s.sal_grade_no 
    	      from employee e1,employee e2, salary_grade s 
    	      where e1.emp_no = c.emp_no 
          	 	  and e1.mgr_emp_no = e2.emp_no 
          		  and e2.salary between s.min_salary and s.max_salary)||'','없음')"직속상관연봉등급"
from
	customer c
```
