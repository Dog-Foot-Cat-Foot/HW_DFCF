select
	e1.emp_no
	, e1.emp_name
	, d.dep_name
	, e1.jikup
	, to_char(e1.hire_date, 'YYYY')||'년' "입사년도"
	, to_number(extract(year from sysdate))
        - to_number(case substr(e1.jumin_num, 7,1)
            when '1' then '19'
            when '2' then '19'
            else '20'
            end||substr(e1.jumin_num,1,2))+1 ||'세' "나이"
	, e1.salary "연봉"
	, e1.mgr_emp_no "직속상관번호"
	, e2.emp_name "직속상관이름"
from
	employee e1, employee e2, dept d
where
	e1.mgr_emp_no = e2.emp_no
    and d.dep_no = e1.dep_no
order by
	to_number(extract(year from sysdate))
        - to_number(case substr(e1.jumin_num, 7,1)
            when '1' then '19'
            when '2' then '19'
            else '20'
            end||substr(e1.jumin_num,1,2))+1;
