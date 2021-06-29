-- 1번 문제

  - inner join
  - outer join
  - self join
  - cross join
  
-- 2번 문제
  
  - A : from
  - B : select
  - C : 테이블

-- 3번 문제
 
 select
	c.cus_no "고객번호"
	, c.cus_name "고객명"
	, substr(c.jumin_num,1,6)||'-'||substr(c.jumin_num,7) "주민번호"
	, nvl(e1.emp_name,'없음') "담당직원명"
	, nvl(d.dep_name, '없음') "담당직원소속부서명"
	, nvl(s1.sal_grade_no||'', '없음') "담당직원연봉등급"
	, nvl(e2.emp_name,'없음') "담당직원직속상관명"
	, nvl(e2.jikup,'없음') "담당직원직속상관직급"
	, nvl(s2.sal_grade_no||'', '없음') "직속상관연봉등급"
from
	customer c, employee e1, employee e2, dept d, salary_grade s1, salary_grade s2
where
	c.emp_no = e1.emp_no(+)
	and e1.dep_no = d.dep_no(+)
	and e1.salary between s1.min_salary(+) and s1.max_salary(+)
	and e1.mgr_emp_no = e2.emp_no(+)
	and e2.salary between s2.min_salary(+) and s2.max_salary(+);
  
  
-- 4번 문제

select rownum, e.*
from
	(select * from employee
	order by salary desc) e
where
	rownum<=15;
