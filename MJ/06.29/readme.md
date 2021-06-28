### 1. 트랜잭션 이란?
	모두 ____되거나 모두 ____되는 2가지 결과로만 진행되는 작업단위를 말한다.
	트랜잭션은 주로 ____ 또는 ____ 또는 ____ sql 구문 실행 시 설정한다.
	트랜잭션이 걸린 작업은 가상 작업이 되고 ________ 를 실행하면 모두 취소되고 ______를 실행하면
	가상작업이 모두 실제로 작업으로 인정된다.
	<주의> 트랜잭션은 의도를 가지고 설정하는 것이다.
	<주의> 트랜잭션이 없는 작업은 N가지 이상의 다양한 결과로 진행 될 수 있다.

<details>
<summary>정답</summary>
<div markdown="1">    
  
  ###  정답 : 취소, 완료, 입력, 수정, 삭제, rollback, commit
  
</div>
</details>

### 2. 인라인뷰는 ____ 나오는 select를 말한다.
 
<details>
<summary>정답</summary>
<div markdown="1">    
  
 ### 정답 : from
  
</div>
</details>

### 3. 이번달 중에 금요일의 개수를 구하면?

<details>
<summary>정답</summary>
<div markdown="1">    

  ![KakaoTalk_20210628_211512358](https://user-images.githubusercontent.com/84062280/123634896-f5a54180-d855-11eb-9f1f-3c23cd76ec72.png)
  <details>
<summary>쿼리 정답</summary>
<div markdown="1">    
  
  ```sql
select
	count(*) "금요일의 개수"
from
    (select
        to_date(to_char(sysdate,'yyyy-mm')||'-01','yyyy-mm-dd')+RNUM-1 "XDAY"
    from
        (select 
            rownum RNUM 
        from 
            employee 
            union 
            (select rownum+20 from employee)
        )
    where 
        RNUM <= to_number(to_char(last_day(sysdate),'dd'))) d
where
	to_char( d.xday, 'dy', 'nls_date_language = korean')='금'
	and XDAY<=last_day(sysdate)
```
  </div>
</details>
  
</div>
</details>

### 4. 고객번호, 고객명, 담당직원번호, 담당직원명, 담당직원소속부서명, 담당직원연봉등급, 담당직원직속상관명, 담당직원직속상관직급, 직속상관연봉등급 출력하라. 
### <조건>담당직원 연봉 높은순으로 정렬하고, 6행부터 10행까지 출력하시오. 
### <조건>null 값이 있으면 포함되어 나와야한다.
<details>
<summary>정답</summary>
<div markdown="1">    

  ![KakaoTalk_20210628_215207902](https://user-images.githubusercontent.com/84062280/123639983-ac57f080-d85b-11eb-8e1b-517ea68e0e35.png)

  <details>
<summary>쿼리 정답</summary>
<div markdown="1">    
  
  ```sql
select
		c.cus_no       "고객번호"
		,c.cus_name      "고객명"
		,(select e.emp_no from employee e where e.emp_no = c.emp_no)      "담당직원번호"
		,(select e.emp_name from employee e where e.emp_no = c.emp_no)      "담당직원명"
		,(select d.dep_name from employee e, dept d where e.emp_no = c.emp_no and d.dep_no = e.dep_no)         "담당직원소속부서명"
		,(select s.sal_grade_no from employee e, salary_grade s where e.emp_no = c.emp_no and e.salary between s.min_salary and s.max_salary)   "담당직원연봉등급"
		,(select e1.emp_name from employee e, employee e1 where e.emp_no = c.emp_no and e.mgr_emp_no = e1.emp_no)     "담당직원직속상관명"
		,(select d.dep_name from employee e, employee e1, dept d where e.emp_no = c.emp_no and e.mgr_emp_no = e1.emp_no and e1.dep_no = d.dep_no)      "담당직원직속상관직급"
		,(select s.sal_grade_no from employee e, employee e1, salary_grade s where e.emp_no = c.emp_no and e.mgr_emp_no = e1.emp_no and e1.salary between 			s.min_salary and s.max_salary)   "직속상관연봉등급"
from
		(select rownum RNUM, c1.* from customer c1, employee e where e.emp_no(+) = c1.emp_no order by e.salary) c
where
    RNUM between 6 and 10

```
  </div>
</details>
  
</div>
</details>
