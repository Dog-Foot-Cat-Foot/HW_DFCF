-- nvl
select
	emp_name "직원명"
	, emp_no "직원번호"
    , nvl(
        case 
        when mgr_emp_no between 1 and 5 then 'A'
        when mgr_emp_no between 6 and 10 then 'B'
        when mgr_emp_no between 11 and 15 then 'C'
        when mgr_emp_no between 16 and 20 then 'D'
        end
        , '0000')  "직속상관번호"
from employee
order by 3;

--nvl2
select
	emp_name "직원명"
	, emp_no "직원번호"
    , nvl2(
        mgr_emp_no,
        case 
        when mgr_emp_no between 1 and 5 then 'A'
        when mgr_emp_no between 6 and 10 then 'B'
        when mgr_emp_no between 11 and 15 then 'C'
        else 'D'
        end
        , '0000')  "직속상관번호"
from employee
order by 3;
