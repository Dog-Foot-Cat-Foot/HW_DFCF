-- 1번 문제 

한 페이지에 너무 많은 데이터를 한꺼번에 보여주지 않기 위해 페이지를 끊어서 보여주도록 하는 것

-- 2번 문제

검색 결과 없음
만약 부등호가 반대로 되어 있으면 3행부터 15행까지 출력!

-- 3번 문제
select *
from
	(select rownum RNUM, zxcvb.*
	from
		(select
			c.cus_no "고객번호", c.cus_name "고객명"
			, to_number(to_char(sysdate, 'YYYY'))
				- to_number(decode(substr(c.jumin_num,7,1)
							,'1','19'
							,'2','19'
							,'20')||substr(c.jumin_num,1,2))+1 "고객나이"
			, e.emp_no "담당직원번호", e.emp_name"담당직원명", e.jikup "직급"
			, d.dep_name "담당직원부서명", d.loc "부서위치"
		from
			customer c, employee e, dept d
		where
			c.emp_no = e.emp_no(+)
			and e.dep_no = d.dep_no(+)
        order by
            3 desc) zxcvb
	where
		rownum <=8)
where
	RNUM >=3;
  
 -- 4번 문제
 select
	e.emp_no "직원번호", e.emp_name "직원명"
	, e.dep_no "부서번호"
	, d.dep_name  "부서명"
	, e.jikup "직급"
	, e.salary "연봉"
	, s.sal_grade_no "연봉등급"
	, to_char(e.hire_date, 'YYYY-MM-DD (DY) Q"/4분기"', 'nls_date_language =korean') "입사일"
from
	(select rownum RNUM, zxcvb.*
	from
		(select *
		from employee
		where mgr_emp_no is not null
		order by hire_date) zxcvb
	where
		rownum <=8)e
	, dept d
	, salary_grade s
where
	RNUM>=3
	and e.dep_no = d.dep_no
	and e.salary between s.min_salary and s.max_salary
order by
    "입사일";
