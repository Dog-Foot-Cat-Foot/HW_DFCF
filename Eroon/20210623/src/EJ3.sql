-- oracle
select
	e.jikup "직급명"
	, count(e.emp_no) "직급직원수"
    , count(c.cus_no)
from
	employee e, customer c
where
    e.emp_no = c.emp_no(+)
group by
	e.jikup;

--ANSI
select
	e.jikup "직급명"
	, count(e.emp_no) "직급직원수"
    , count(c.cus_no)
from
	employee e left outer join customer c
on
    e.emp_no = c.emp_no
group by
	e.jikup;
