select
    e1.emp_no "부하직원명"
    , e1.jikup "직급"
    , e1.salary||'만원' "연봉"
    , (select e2.emp_name from employee e2 
        where e1.mgr_emp_no = e2.emp_no) "직속상관명"
    , (select e2.salary from employee e2 
        where e1.mgr_emp_no = e2.emp_no)||'만원'   "직속상관연봉"
    , (select (e1.salary-e2.salary) from employee e2 
        where e1.mgr_emp_no=e2.emp_no and e1.salary>e2.salary) "연봉차이"   
from
    employee e1
where
    e1.salary>(select e2.salary from employee e2 where e1.mgr_emp_no=e2.emp_no);
