### 1. 퇴직일이 65세 라는 기준 하에 아래 처럼 출력하면?
### [직원번호], [직원명], [근무년차], [퇴직일까지 남은 년도], [소속부서명], [직속상관명],[직속상관 담당고객 인원수]
### 단, 모든 직원 다 나오고, 직급 높은 먼저 나오고 직급이 같으면 나이가 많은 사람이 나와야함.
```Sql
select
    e1.emp_no                    "직원번호"
    ,e1.emp_name                 "직원명"
    ,round(((sysdate-e1.hire_date)/365),1) "근무년차"
    ,65-(to_number(to_char(sysdate,'yyyy'))
        -to_number(
            case
                    when substr(e1.jumin_num,7,1)='1' then '19'
                    when substr(e1.jumin_num,7,1)='2' then '19'
                    else '20'
            end||substr(e1.jumin_num,1,2)
        )+1)||'년' "퇴직일까지 남은년도"
    ,d.dep_name "소속부서명"
    ,(select e2.emp_name from employee e2 where e2.emp_no = e1.mgr_emp_no)"직속상관명"
    ,(select count(*)
     from employee e2,customer c 
      where e2.emp_no = c.emp_no and e1.emp_no = e2.mgr_emp_no)"담당고객인원수"
from
    employee e1,dept d
where
    d.dep_no = e1.dep_no 
order by 
   decode(e1.jikup,'사장',6,'부장',5,'과장',4,'대리',3,'주임',2,1) desc
   ,decode(e1.jumin_num,'1','19','2','19','20')||substr(e1.jumin_num,1,6);
```
### 2. 부서별 직원들의 입사년대 출력하시오
### [부서이름], [부서위치], [입사년대]
```sql
select
    d.dep_name
    ,d.loc
    ,trunc(to_number(to_char(e.hire_date,'yyyy')),-1)"입사연대"
from
    dept d, employee e 
where
    d.dep_no = e.dep_no
group by
    dep_name,loc,trunc(to_number(to_char(e.hire_date,'yyyy')),-1)
order by
    1
```
### 3. 직급별 담당고객수를 출력하시오.
### [직급], [직원수], [담당고객수]
### 단, 낮은 직급이 먼저 나오게 하시오.
```sql
select
    e1.jikup
    ,(select count(*) from employee e2 where e1.jikup = e2.jikup ) "직원수"
    ,(select count(*) from employee e2,customer c where e2.emp_no = c.emp_no
                                                        and e2.jikup = e1.jikup) "담당고객수"
from
    employee e1
group by
    e1.jikup 
order by
    decode(e1.jikup,'사장',1,'부장',2,'과장',3,'대리',4,5 ) desc;   
```
