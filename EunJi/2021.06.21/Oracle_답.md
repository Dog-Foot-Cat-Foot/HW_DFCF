--이현1
select
   cus_no            as "고객번호"
   ,cus_name         as "고객이름"
   ,to_number(to_char(sysdate, 'YYYY'))
          - to_number(case when substr(jumin_num,7,1) = '1' then '19'
                           when substr(jumin_num,7,1) = '2' then '19'
                           else '20'
                      end || substr(jumin_num,1,2))+1 ||'세'    as "고객나이"
from customer
where to_number(to_char(sysdate, 'YYYY'))
          - to_number(case when substr(jumin_num,7,1) = '1' then '19'
                           when substr(jumin_num,7,1) = '2' then '19'
                           else '20'
                       end || substr(jumin_num,1,2))+1 between 50 and 59
order by "고객나이" asc;

--이현2
select * from customer
    where cus_name like '%이'
        and substr(jumin_num,1,1) = '7'
    order by jumin_num asc;

--이현3
 select * from customer
    where tel_num like '%-1%'
        and cus_name like '이%';

--은지1
select * from employee
    where emp_name like '이%'
        or emp_name like '임%';

--은지2
select
    e.emp_no
    ,e.emp_name
    ,d.dep_no
    ,d.dep_name
from employee e, dept d
    where e.dep_no = d.dep_no;
--------------------------------
select
    e.emp_no
    ,e.emp_name
    ,d.dep_no
    ,d.dep_name
from employee e inner join dept d
    on e.dep_no = d.dep_no;

--은지3
select * from employee
where salary < (select avg(salary) from employee);

--승태1
select
    floor(sysdate - hire_date)
from employee
where dep_no = 10;

--승태2
select * from employee
where dep_no not in(10)
     and hire_date>=to_date('1987-01-01','YYYY-MM-DD');

--승태3
 select
    e.emp_name
    ,e.salary
    ,d.dep_name
    ,e.dep_no
 from employee e, dept d
 where
    e.dep_no = d.dep_no
    and e.dep_no = 30
    and e.salary between 1500 and 3300;

--명진1
 select * from employee
 where emp_name like '이%'
     and to_number(to_char(sysdate, 'YYYY'))
          - to_number(case when substr(jumin_num,7,1) = '1' then '19'
                           when substr(jumin_num,7,1) = '2' then '19'
                           else '20'
                      end || substr(jumin_num,1,2))+1 between 60 and 69;

--명진2
select * from employee
where emp_name like '%라%'
    and substr(jumin_num,7,1) in ('2','4');

--명진3
select
    c.cus_name
    ,c.tel_num
    ,e.emp_no
from customer c, employee e
where c.emp_no = e.emp_no
order by  c.cus_name desc;

--소희1
SELECT
    COUNT(DISTINCT NAME)
FROM ANIMAL_INS;

--소희2
SELECT
    ANIMAL_ID
    ,NAME
    ,TO_CHAR(DATETIME,'YYYY-MM-DD')
FROM ANIMAL_INS
ORDER BY ANIMAL_ID ASC;

--소희3
SELECT
    ANIMAL_TYPE
    ,NVL(NAME,'No name')
    ,SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID ASC;
