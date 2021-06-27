이현 Q1
```sql
select
    s.sal_grade_no    "연봉등급"
    ,e1.jikup         "직급"
    ,count(e1.emp_no) "직원수"
    ,round(avg(e1.salary),1) "평균연봉"
    ,round(avg(to_number(to_char(sysdate,'yyyy'))
	     -to_number(decode(substr(e1.jumin_num,7,1),'1','19','2','19','20')
                                   ||substr(e1.jumin_num,1,2))),1)            "평균나이"
from                              
    employee e1,employee e2, salary_grade s
where
    e1.salary between s.min_salary and s.max_salary
    and
    e1.jikup = e2.jikup
group by
    s.sal_grade_no
    ,e1.jikup
order by
    s.sal_grade_no 
```  
이현 Q2
```sql
    decode(substr(e1.jumin_num,7,1),'1','19','2','19','20')
        ||substr(e1.jumin_num,1,1)||'0년대' "출생년대"
    ,substr(e1.jumin_num,3,2)   "출생월"
    ,count(e1.emp_no)            "직원수"
    ,round(avg(to_number(to_char(sysdate,'yyyy'))
	     -to_number(decode(substr(e1.jumin_num,7,1),'1','19','2','19','20')
                                   ||substr(e1.jumin_num,1,2))),1)            "평균나이"
    ,max(to_number(to_char(sysdate,'yyyy'))
	     -to_number(decode(substr(e1.jumin_num,7,1),'1','19','2','19','20')
                                   ||substr(e1.jumin_num,1,2)))"나이가가장많은사람"
    ,min(to_number(to_char(sysdate,'yyyy'))
	     -to_number(decode(substr(e1.jumin_num,7,1),'1','19','2','19','20')
                                   ||substr(e1.jumin_num,1,2)))"나이가가장적은사람"    
from                              
    employee 
group by
    decode(substr(e1.jumin_num,7,1),'1','19','2','19','20')
        ||substr(e1.jumin_num,1,1)||'0년대'
    ,substr(e1.jumin_num,3,2)
order by
    decode(substr(e1.jumin_num,7,1),'1','19','2','19','20')
        ||substr(e1.jumin_num,1,1)||'0년대'
    ,substr(e1.jumin_num,3,2)
```
이현 Q3
```sql
select
    substr(phone,1,3)||'-'||substr(phone,4,1)||'xxx-xxxx'"핸드폰번호앞자리"
    ,count(emp_no) "직원들의수"
    ,round(avg(salary),1) "평균연봉"
from
    employee
group by
    substr(phone,1,3)||'-'||substr(phone,4,1)||'xxx-xxxx'
having
    count(emp_no)>=2
```

소희 Q1
```sql
select
    s.sal_grade_no           "연봉등급"
    ,count(distinct(e1.emp_no))        "인원수"
    ,to_char(sum(e1.salary),'999,999')||'만원'         "급여합"
    ,to_char(trunc(avg(e1.salary),0),'999,999')||'만원'"평균연봉"
from
    employee e1 , customer c, salary_grade s
where
    e1.emp_no = c.emp_no
    and
    e1.salary between s.min_salary and s.max_salary
group by
    s.sal_grade_no
order by
    1 desc
```

소희 Q2
```sql
select
    (select count(*)+1 
    from employee e2, employee e3
    where e3.dep_no = 10 and  e2.mgr_emp_no = e3.emp_no  and e1.hire_date > e2.hire_date)                  "입사일 순위"
    ,e1.emp_no                                         "직원번호"
    ,e1.emp_name                                       "직원명"
    ,to_char(hire_date
            ,'yyyy-mm-dd dy'
            ,'nls_date_language=korean')               "입사일"
    ,e1.mgr_emp_no                                     "직속상관번호"
    ,(select emp_name 
    from employee e2 
    where e1.mgr_emp_no = e2.emp_no)                   "직속상관이름"
from
    employee e1
where
    e1.mgr_emp_no in (select e2.emp_no from employee e2 where e2.dep_no = 10 )
order by
    4 desc;
```    
소희 Q3
```sql
select
    e1.emp_name "부하직원명"
    ,e1.jikup  "직급"
    ,e1.salary "연봉"
    ,(select e2.emp_name 
    from employee e2 
    where e1.mgr_emp_no = e2.emp_no) "직속상관명"
    ,(select e2.salary 
    from employee e2 
    where e1.mgr_emp_no = e2.emp_no)  "직속상관연봉"
    ,e1.salary-(select e2.salary 
                from employee e2 
                where e1.mgr_emp_no = e2.emp_no)"연봉차이"
from
    employee e1
where
    e1.salary > (select e2.salary 
                from employee e2 
                where e1.mgr_emp_no = e2.emp_no)
```
지언 Q1
```sql
select
    emp_name
    ,dep_no
    ,trunc((salary/12)/21.5,1)"하루급여"
    ,round((salary/12)/21.5/8,3)"시급" 
from
    employee
```

지언 Q2
```sql
select
    emp_name
    ,dep_no
    ,to_char(next_day(add_months(hire_date,3),2),'yyyy-mm-dd')"정직원되는날"
    ,nvl2(mgr_emp_no, 'Y','N')
from
    employee 
```    

지언 Q3
```sql
select
    emp_name
    ,emp_no
    ,nvl(case 
        when mgr_emp_no < 6 then 'A'
        when mgr_emp_no < 11 then 'B'
        when mgr_emp_no < 16 then 'C'
        when mgr_emp_no < 21 then 'D'
    end,'0000')
from
    employee
```
은지 Q1
```sql
select
    cus_no                  "고객번호"
    ,cus_name               "고객이름"
    ,to_number(to_char(sysdate,'yyyy'))
        -to_number(
            case
                    when substr(cus_jumin,7,1)='1' then '19'
                    when substr(cus_jumin,7,1)='2' then '19'
                    else '20'
            end||substr(cus_jumin,1,2)
        )+1||'세'          "고객나이"
    ,nvl(emp_no||'','없음')"담당직원번호"                 
from
    customer
order by
    to_number(to_char(sysdate,'yyyy'))
        -to_number(
            case
                    when substr(cus_jumin,7,1)='1' then '19'
                    when substr(cus_jumin,7,1)='2' then '19'
                    else '20'
            end||substr(cus_jumin,1,2)
        )+1 desc
```
은지 Q2
```sql
select
    dep_no                                                             "부서번호"
    ,emp_no                                                            "직원번호"
    ,emp_name                                                          "직원이름"
    ,jikup                                                             "직급"
    ,salary                                                            "연봉"
    ,substr(jumin_num,1,6)||'-'||substr(jumin_num,7,7)                 "주민번호"
    ,substr(phone,1,3)||'-'||substr(phone,4,4)||'-'||substr(phone,8,4) "핸드폰번호"
from
    employee
order by
    decode(jikup,'사장',1,'부장',2,'과장',3,'대리',4,5)
```
은지 Q3
```sql
select
    e1.emp_no       "직원번호"
    ,e1.emp_name    "직원이름"
    ,d.dep_name     "부서이름"
    ,to_char(e1.hire_date,'yyyy')   "입사년도"
    ,to_number(to_char(sysdate,'yyyy'))
        -to_number(
            case
                    when substr(e1.jumin_num,7,1)='1' then '19'
                    when substr(e1.jumin_num,7,1)='2' then '19'
                    else '20'
            end||substr(e1.jumin_num,1,2)
        )+1||'세' "나이"
    ,e1.salary    "연봉"
    ,e1.mgr_emp_no "직속상관"
    ,e2.emp_name   "직속상관이름"
from
    employee e1, employee e2, dept d
where
    e1.dep_no = d.dep_no(+)
    and
    e1.mgr_emp_no = e2.emp_no(+)
order by
    to_number(to_char(sysdate,'yyyy'))
        -to_number(
            case
                    when substr(e1.jumin_num,7,1)='1' then '19'
                    when substr(e1.jumin_num,7,1)='2' then '19'
                    else '20'
            end||substr(e1.jumin_num,1,2)
        )+1  desc
```
