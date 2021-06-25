select
	e1.emp_no "직원번호"
	, e1.emp_name "직원명"
	, ceil((sysdate-e1.hire_date)/365) as "근무년차"
	, to_number(decode(substr(e1.jumin_num,7,1)
		, '1', '19'
		, '2', '19'
		,'20')||substr(e1.jumin_num,1,2))
		- to_number(extract(year from sysdate))
		+64
		"퇴직일까지 남은 년도"
	, d.dep_name "소속부서명"
	, e2.emp_name "직속상관명"
	, (select count(*) from customer c where c.emp_no = e2.emp_no)
	"직속상관담당고객수"
from employee e1, employee e2, dept d
where
	e1.mgr_emp_no = e2.emp_no(+)
	and e1.dep_no = d.dep_no(+)
order  by
	decode(e1.jikup
		, '사장', 1
		, '부장', 2
		, '과장', 3
		, '대리', 4
		,5) asc
	, decode(substr(e1.jumin_num,7,1)
		, '1', '19'
		, '2', '19'
		,'20')||substr(e1.jumin_num,1,2) asc;
