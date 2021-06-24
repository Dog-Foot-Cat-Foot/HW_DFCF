### 이현 Q1
```sql
select
    *
from
    employee e, dept d
where
    d.dep_no = e.dep_no
    and
    d.dep_name = '전산부'
    and
    e.jikup = (select jikup from employee where emp_name = '이순라')
order by
    e.hire_date;
```
### 이현 Q2
 ```sql
 select
    e1.emp_no      "직원번호"
    ,e1.emp_name   "직원명"
    ,to_number(to_char(sysdate,'yyyy'))
    -to_number(decode(substr(e1.jumin_num,7,1),'1','19','2','19','20')
    ||substr(e1.jumin_num,1,2))+1||'세' "나이"
    ,e1.hire_date "입사일"
    ,(select 
            count(*)+1 
      from 
            employee e2 
      where 
            e1.hire_date>e2.hire_date)  "입사일 순위"
from
    employee e1
order by
    5;
```
### 이현 Q3
```sql
select
    cus_no "고객번호"
    ,cus_name "고객명"
    ,cus_jumin "주민번호"
    ,(select count(*)+1 from customer c2 where to_number(decode(substr(c1.cus_jumin,7,1),'1','19','2','19','20')
          ||substr(c1.cus_jumin,1,6))
    >
    to_number(decode(substr(c2.cus_jumin,7,1),'1','19','2','19','20')
          ||substr(c2.cus_jumin,1,6)))       "생일순위" 
from
    customer c1
order by
    4 desc;
```
### 승태 Q1
```sql
select
    emp_name
    ,hire_date
from
    employee
where
   hire_date > any (select hire_date from employee where emp_name = '임꺽정')    
```
### 승태 Q2
```sql
select
    emp_name
    ,jikup
from
    employee e, dept d
where
    d.dep_no = e.dep_no
    and                
    d.dep_name = '영업부'

승태 Q3
select
    e.emp_name
    ,e.salary
    ,d.dep_name
from
    employee e, dept d
where
    e.dep_no = d.dep_no
    and
    e.jikup in (select e.jikup from employee e where e.emp_name = '이순신')        
```    
### 소희 Q1
```sql
select
    o.animal_id
    ,o.name
from
    animal_outs o left join animal_ins i
on
    i.animal_id = o.animal_id
where i.animal_id is null
order by 1;
```
### 소희 Q2
```sql
select
    i.animal_id
    ,i.name
from
    animal_ins i, animal_outs o
where
    i.animal_id = o.animal_id
    and i.datetime>o.datetime
order by
    i.datetime
```
### 소희 Q3
```sql
select
    i.name
    ,i.datetime
from
    animal_ins i, animal_outs o
where
    i.animal_id = o.animal_id(+)
    and
    o.animal_id is null
order by
    2
FETCH FIRST 3 ROWS ONLY
```
### 은지 Q1
```sql
select
    dep_name
    ,emp_no
    ,emp_name
    ,jikup
    , (select count(*) from customer c where c.emp_no = e.emp_no) "담당고객수" 
from
    dept d, employee e
where
    d.dep_no = e.dep_no
```
### 은지 Q2
```sql
select
   emp_no
   ,emp_name
   ,jikup
   ,salary
from
    employee e
where
   1 = (select count(*) from customer c where e.emp_no = c.emp_no)
```
### 은지 Q3
```sql
select
    e.jikup
    ,count(*)
    ,count(c.emp_no)
from
    employee e, customer c
where
    e.emp_no = c.emp_no(+)
group by
    e.jikup
```
