select
    (select count(*)+1 from employee e3, employee e4 
        where e3.mgr_emp_no = e4.emp_no 
            and e1.hire_date>e3.hire_date
            and e4.dep_no = 10) 
        "입사일 순위"
    , e1.emp_no "직원번호"
    , e1.emp_name "직원이름"
    , to_char(e1.hire_date, 'YYYY-MM-DD DAY', 'NLS_DATE_LANGUAGE = Korean') "입사일"
    , e2.emp_no"상사직원번호"
    , e2.emp_name"상사이름"
from
    employee e1, employee e2        
where 
    e1.mgr_emp_no = e2.emp_no 
    and e2.dep_no =10
order by "입사일" desc;
