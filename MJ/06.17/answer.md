이현 Q1
```sql
select
    cus_no        "고객번호"
    ,cus_name     "고객명"
    ,to_char(to_date(case
                    when substr(cus_jumin,7,1)='1' then '19'
                    when substr(cus_jumin,7,1)='2' then '19'
                    else '20'
            end||substr(cus_jumin,1,6),'yyyymmdd'),'yyyy.mm.dd') "생년월일"
    ,decode(substr(cus_jumin,7,1),'1','남','3','남','여')   "성별"
from
    customer;
```
이현 Q2
```sql
select
    cus_no        "고객번호"
    ,cus_name     "고객명"
    ,tel_num      "전화번호"
    ,nvl2(emp_no,'O','X') "담당직원"
from
    customer
order by
    tel_num;
```
이현 Q3
```sql
select
    cus_no        "고객번호"
    ,cus_name     "고객명"
    ,substr(cus_jumin,1,6)||'-'||substr(cus_jumin,7,1)||'******' "주민번호"
from
    customer
order by
    sysdate-to_date(case
                        when substr(cus_jumin,7,1)='1' then '19'
                        when substr(cus_jumin,7,1)='2' then '19'
                        else '20'
                    end||substr(cus_jumin,1,6),'yyyymmdd')
    desc;
 ```
명진 Q1
```sql
select
    count(distinct(mgr_emp_no))
from
    employee;
```
명진 Q2
```sql
select
    trunc(to_number(to_char(sysdate,'yyyy'))
    -to_number(case
                        when substr(cus_jumin,7,1)='1' then '19'
                        when substr(cus_jumin,7,1)='2' then '19'
                        else '20'
                    end||substr(cus_jumin,1,2)),-1)||'대'  "연령대"
from
    customer
```
명진 Q3
```
select
    substr(cus_jumin,3,2)||'월'||substr(cus_jumin,5,2)||'일'  "생일"
from
    customer
```
은지 Q1
```sql
select
    emp_no
    ,emp_name
    ,jikup
    ,salary
    ,nvl(mgr_emp_no||'','없음') "직속상관번호"
from
    employee
```
은지 Q2
```sql
select
    emp_no
    ,emp_name
    ,jikup
    ,salary
    ,substr(phone,1,3)||'-'||substr(phone,4,4)||'-'||substr(phone,8,4) "핸드폰번호"
from
    employee
```
소희 Q1
```sql
select
    animal_id
from
    animal_ins
where
    name is null
```
소희 Q2
```sql
select
    max(datetime)
from
    animal_ins
```
