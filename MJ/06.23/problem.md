### 1.고객번호, 고객명, 담당직원번호, 담당직원부서명을 출력하라. 
### 단, 담당직원중 직속상관이 이성계인 경우만 출력

```sql
select
    c.cus_no "고객번호"
    ,c.cus_name "고객명"
    ,c.emp_no "담당직원번호"
    ,d.dep_name "담당직원부서명"
from
    customer c, employee e, dept d
where
    c.emp_no = e.emp_no
    and
    e.dep_no = d.dep_no
    and
    e.mgr_emp_no = 17
```

### 2.고객번호, 고객명, 담당직원유무, 담당직원명, 담당직원 연봉등급을 출력하라. 
### 단, null 은 X로 표시, 담당직원유무는 담당직원번호를 이용하여 값이 있으면 O로 표시 정렬은 고객번호 내림차순

```sql
select
    c.cus_no "고객번호"
    ,c.cus_name "고객명"
    ,nvl2(c.emp_no,'O','X') "담당직원유무"
    ,nvl(e.emp_name,'X') "담당직원명"
    ,nvl(s.sal_grade_no||'','X') "연봉등급"
from
    customer c, employee e, salary_grade s
where
    c.emp_no = e.emp_no(+)
    and
    (e.salary between s.min_salary(+) and s.max_salary(+))
order by
    c.cus_no      
```

### 3.연봉 3000이상인 직원의 부하직원들의 직원번호, 직원명, 연봉, 연봉등급을 출력하라.(서브쿼리)

```sql
select
    e1.emp_no "직원번호"
    ,e1.emp_name "직원명"
    ,e1.salary "연봉"
    ,s.sal_grade_no "연봉등급"
from
    employee e1 , salary_grade s
where
    e1.mgr_emp_no in (select e2.emp_no from employee e2 where e2.salary>=3000)
    and
    (e1.salary between s.min_salary and s.max_salary)
-------------------------------------------------------------------------------
select
    e1.emp_no "직원번호"
    ,e1.emp_name "직원명"
    ,e1.salary "연봉"
    ,(select sal_grade_no 
    from salary_grade s 
    where e1.salary between s.min_salary and s.max_salary) "연봉등급"
from
    employee e1
where
    e1.mgr_emp_no in (select e2.emp_no from employee e2 where e2.salary>=3000)
```
