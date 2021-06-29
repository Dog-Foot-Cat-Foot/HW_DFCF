-- 1번
완료, 취소
입력, 수정, 삭제
rollback commit

-- 2번
from절에

-- 3번
select 
	count(*) "금요일의 개수"
from
	(
		select
			to_date(to_char(sysdate,'YYYY-MM')||'-01', 'YYYY-MM-DD')+RNUM-1 "XDAY"
		from
			(
				select rownum RNUM from employee 
				union select rownum+20 from employee)
				where RNUM<=to_number(to_char(last_day(sysdate), 'dd')
			)
	)d
where
	to_char(d.xday, 'dy', 'nls_date_language=korean')= '금'
	and XDAY <= last_day(sysdate);
  
 -- 4번
    
select *
from
	(select rownum RNUM, zxcvb.*
	from
		(select 
			c.cus_no "고객 번호"
			, c.cus_name "고객명"
			, e1.emp_no "담당직원번호"
			, e1.emp_name "담당직원명"
			, d.dep_name "담당직원소속부서명"
			, s1.sal_grade_no "담당직원연봉등급"
			, e2.emp_name "담당직원직속상관명"
			, e2.jikup "담당직원직속상관직급"
			, s2.sal_grade_no "직속상관연봉등급"
		from
			customer c, employee e1, employee e2, dept d,salary_grade s1, salary_grade s2
		where
			c.emp_no = e1.emp_no(+)
			and e1.dep_no = d.dep_no(+)
			and e1.salary between s1.min_salary(+) and s1.max_salary(+)
			and e1.mgr_emp_no = e2.emp_no(+)
			and e2.salary between s2.min_salary(+) and s2.max_salary(+)
		order by
			e1.salary desc) zxcvb
	where
		rownum<=10)
where
	RNUM>=6;
