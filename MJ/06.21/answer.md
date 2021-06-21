### 이현 Q1
```sql
select
    cus_no
    ,cus_name
    ,to_number(to_char(sysdate,'yyyy')) 
        -to_number(
            decode(substr(cus_jumin,7,1),'1','19','2','19','20')||substr(cus_jumin,1,2)
        )+1 "나이"
from
    customer
where
    to_number(to_char(sysdate,'yyyy')) 
        -to_number(
            decode(substr(cus_jumin,7,1),'1','19','2','19','20')||substr(cus_jumin,1,2)
        )+1 >=50
    and
    to_number(to_char(sysdate,'yyyy')) 
        -to_number(
            decode(substr(cus_jumin,7,1),'1','19','2','19','20')||substr(cus_jumin,1,2)
        )+1 <60
order by 3;
```
### 이현 Q2
```sql
select *

from
    customer
where
    cus_name like '%이' and substr(cus_jumin,1,1) = '7'
order by
    case
        when substr(cus_jumin,7,1)='1' then '19'
        when substr(cus_jumin,7,1)='2' then '19'
        else '20'
    end||substr(cus_jumin,1,6) desc
```
### 이현 Q3
```sql
select *

from
    customer
where
    tel_num like '%1___' and cus_name like '이%'
```
### 은지 Q1
```sql
select *
from
    employee
where
    emp_name like '이%' or emp_name like '임%'
```
### 은지 Q2
```sql
select 
    e.emp_no
    ,e.emp_name
    ,e.dep_no
    ,d.dep_name
from
    employee e, dept d
where
    e.dep_no = d.dep_no
```
### 은지 Q3
```sql
select 
    *
from
    employee
where
    (select avg(salary) from employee) > salary
```
### 소희 Q1
```sql
select
    count(distinct(name))
from
    animal_ins
```
### 소희 Q2
```sql
select
    animal_id
    ,name
    ,to_char(datetime,'yyyy-mm-dd') "날짜"
from
    animal_ins
order by
    animal_id
```
### 소희 Q3
```sql
select
    animal_type
    ,nvl(name,'No name') "name"
    ,sex_upon_intake
from
    animal_ins
order by
    animal_id
```
### 승태 Q1
```sql
select 
    round(months_between(sysdate,hire_date),1)||'개월' "개월수"
from
    employee
where
    dep_no = 10 
```
### 승태 Q2
```sql
select 
    *
from
    employee
where
    dep_no not in 10 
    and hire_date >= to_date('1987-01-01','yyyy-mm-dd') 
```
### 승태 Q3
```sql
select 
    e.emp_name
    ,e.salary
    ,d.dep_name
    ,e.dep_no
from
    employee e, dept d
where
    e.dep_no = d.dep_no
    and e.dep_no = 30 
    and e.salary between '1500' and '3300' 
```
### 명진 Q1
```sql
select 
    *
from
    employee
where
    emp_name like '이%' 
    and floor(
        (to_number(to_char(sysdate,'yyyy')) 
        -to_number(
            case
                    when substr(jumin_num,7,1)='1' then '19'
                    when substr(jumin_num,7,1)='2' then '19'
                    else '20'
            end||substr(jumin_num,1,2)
        )+1)*0.1) = 6
```
### 명진 Q2
```sql
select 
    *
from
    employee
where
    emp_name like '%라%'
    and emp_name like '%라' 
    and substr(jumin_num,7,1) = '2'
```
### 명진 Q3
```sql
select 
    cus_name
    ,tel_num
    ,emp_no
from
    customer
order by
    cus_name
```
