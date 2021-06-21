select
    e.emp_name "이름"
    , e.salary "급여"
    , d.dep_name "부서명"
    , d.dep_no "부서번호"
from
    employee e, dept d
where
    d.dep_no = 30
    and salary>=1500;
