-- oracle
select
	e.jikup "직급명"
	, count(distinct e.emp_no) "직급직원수"
    	, count(c.cus_no) "직급담당고객수"
from
	employee e, customer c
where
    	e.emp_no = c.emp_no(+)
group by
	e.jikup;

--ANSI
select
	e.jikup "직급명"
	, count(distinct e.emp_no) "직급직원수"
    	, count(c.cus_no) "직급담당고객수"
from
	employee e left outer join customer c
on
    	e.emp_no = c.emp_no
group by
	e.jikup;
	
-- subquery
select
	distinct e1.jikup "직급명"
	, (select count(*) from employee e2 where e1.jikup = e2.jikup) "직급직원수"
    	, (select count(*) from customer c, employee e2 where e1.jikup = e2.jikup and c.emp_no = e2.emp_no) "직급담당고객수"
from
   	 employee e1;
