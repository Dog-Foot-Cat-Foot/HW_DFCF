-------------이현1
select * from employee e
where jikup = (select jikup from employee where emp_name = '이순라')
    and (select d.dep_name from dept d where e.dep_no = d.dep_no) = '전산부'
order by e.hire_date asc;

---------------이현2
select
    e1.emp_no
    ,e1.emp_name
    ,to_number(to_char(sysdate, 'YYYY'))
    - to_number( case substr(e1.jumin_num,7,1) when '1' then '19'
	                                        when '2' then '19'
                                            else '20'
                                            end || substr(e1.jumin_num,1,2)) + 1 || '세' as "현재나이"
    ,to_char(e1.hire_date,'YYYY-MM-DD')
    ,(select count(*)+1 from employee e2
        where to_char(e2.hire_date,'YYYY-MM-DD')<to_char(e1.hire_date,'YYYY-MM-DD'))  "입사순위"
from employee e1
order by "입사순위" asc;

----------------이현3
select
    c1.cus_no
    ,c1.cus_name
    ,c1.jumin_num
    ,(select count(*)+1 from customer c2
        where substr(c2.jumin_num,1,6)<substr(c1.jumin_num,1,6)
from customer c1;


---------------명진1
select
    c.cus_no
    ,c.cus_name
    ,e.emp_no
    ,d.dep_name
from customer c, employee e, dept d
where c.emp_no = e.emp_no
    and e.dep_no = d.dep_no
    and e.emp_name = (select e.emp_name from employee e where e.emp_name = '이순라');

-----------------명진2
select
    c.cus_no                        "고객번호"
    ,c.cus_name                     "고객이름"
    ,nvl2(c.emp_no,'O','X')         "담당고객여부"
    ,nvl(e.emp_name,'X')            "담당고객이름"
    ,nvl(s.sal_grade_no||'','X')    "담당직원연봉등급"
from customer c, employee e, salary_grade s
where c.emp_no = e.emp_no(+)
    and (e.salary between s.min_salary(+) and s.max_salary(+))
order by c.cus_no asc;


-----------------------명진3
select
    e1.emp_no
    ,e1.emp_name
    ,e1.salary
    ,s.sal_grade_no
from employee e1, salary_grade s
where e1.mgr_emp_no in(select e2.emp_no from employee e2 where e2.salary>=3000)
    and (e1.salary between s.min_salary and s.max_salary);


--------------승태1
select
    emp_name
    ,to_char(hire_date,'YYYY-MM-DD')
from employee
where to_char(hire_date,'YYYY-MM-DD')
    >(select to_char(hire_date,'YYYY-MM-DD') from employee where emp_name = '임꺽정');

----------------승태2
select
    d.dep_name
    ,e.emp_name
    ,e.jikup
from dept d, employee e
where d.dep_no = e.dep_no
    and d.dep_name = '영업부';

--------------승태3
select
    d.dep_name
    ,e.emp_name
    ,e.salary
from dept d, employee e
where d.dep_no = e.dep_no
    and jikup in(select e.jikup from employee e where e.emp_name = '이순신');

------------------소희1
SELECT
    O.ANIMAL_ID
    ,O.NAME
FROM ANIMAL_OUTS O LEFT JOIN ANIMAL_INS I
ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE I.ANIMAL_ID IS NULL
ORDER BY 1;

-------------------소희2
SELECT
    I.ANIMAL_ID
    ,I.NAME
FROM ANIMAL_OUTS O RIGHT JOIN ANIMAL_INS I
ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE I.DATETIME>O.DATETIME
ORDER BY I.DATETIME ASC;

---------------------소희3
SELECT
    I.NAME
    ,I.DATETIME
FROM ANIMAL_INS I LEFT JOIN ANIMAL_OUTS O
ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE O.ANIMAL_ID IS NULL
ORDER BY DATETIME ASC
FETCH FIRST 3 ROWS ONLY;


-------은지1
select
    e.emp_no
    ,e.emp_name
    ,e.jikup
    ,(select d.dep_name from dept d where d.dep_no = e.dep_no)
    ,(select count(*) from customer c where c.emp_no = e.emp_no)
from  employee e;


-------은지2
select
    e.emp_no
    ,e.emp_name
    ,e.jikup
    ,e.salary
    ,(select count(*) from customer c where c.emp_no = e.emp_no)
from employee e
where (select count(*) from customer c where c.emp_no = e.emp_no) =1;


----------------------은지3
select
    e.jikup           "직급"
    ,count(distinct e.emp_no)   "직급직원수"
    ,count(c.emp_no)   "직급담당고객수"
from employee e left outer join customer c
on e.emp_no = c.emp_no
group by e.jikup
order by  decode(jikup, '사장' , 1, '부장' , 2, '과장' , 3, '대리', 4,  5 ) asc;
-------------------------------------------------
 select
    e.jikup           "직급"
    ,count(distinct e.emp_no)   "직급직원수"
    ,count(c.emp_no)   "직급담당고객수"
from employee e , customer c
where e.emp_no = c.emp_no(+)
group by e.jikup
order by  decode(jikup, '사장' , 1, '부장' , 2, '과장' , 3, '대리', 4,  5 ) asc;
-----------------------------------------------------------------------------------
