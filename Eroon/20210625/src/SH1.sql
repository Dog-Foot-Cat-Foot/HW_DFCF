select
	s.sal_grade_no "연봉등급"
	, count(*)||'명' "인원수"
	, to_char(sum(e.salary),'999,999,999')||'만원' "급여합"
	, to_char(floor(avg(e.salary)),'999,999,999')||'만원' "평균연봉"
from
	employee e, salary_grade s
where
	e.emp_no 
	in(select c.emp_no from customer c where c.emp_no = e.emp_no)
	and e.salary between s.min_salary and s.max_salary
group by
	s.sal_grade_no
order by
	1 desc;
