-- join
select
	e.jikup "직급"
	, count(distinct e.emp_no) "직원수"
	, count(c.cus_no) "담당고객수"
from
	employee e, customer c 
where 
    e.emp_no = c.emp_no(+)
group by
    e.jikup
order by
	decode(e.jikup
		, '사장', 1
		, '부장', 2
		, '과장', 3
		, '대리', 4
		,5) desc;
    
-- subquery
select
	e1.jikup "직급명"
	, (select count(*) from employee e2 where e1.jikup = e2.jikup) "직급직원수"
    , (select count(*) from customer c, employee e2 where e1.jikup = e2.jikup and e2.emp_no = c.emp_no) "직급담당고객수"
from
	employee e1
group by
	e1.jikup
order by
	decode(e1.jikup
		, '사장', 1
		, '부장', 2
		, '과장', 3
		, '대리', 4
		,5) desc;
