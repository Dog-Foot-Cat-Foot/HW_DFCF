select
	d.dep_name "부서이름"
	, d.loc "부서위치"
	, substr(to_char(e.hire_date, 'YYYY'),1,3)||'0년대'
from
	dept d, employee e
group by
		d.dep_name, d.loc,  substr(to_char(e.hire_date, 'YYYY'),1,3)||'0년대' 
order by
    1;
