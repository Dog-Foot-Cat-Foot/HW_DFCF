-- 1번 문제 쿼리 실행 순서

SELECT
    JOB_ID
    , AVG(SALARY) SAL_AVG
FROM
    EMPLOYEES
WHERE
    SALARY >13000
GROUP BY
    JOB_ID
HAVING
    COUNT(*)>1
ORDER BY SAL_AVG DESC;

--> from -> where -> group by -> having -> select -> order by

-- 2번 문제 

2번

-- 3번 문제

select emp_name "직원명", dep_no "부서번호"
from employee
where
	dep_no in (select dep_no from	employee
	where	emp_name = '류명한')
    and emp_name != '류명한';
    
-- 4번 문제

select
	emp_no "직원번호"
	, emp_name "직원명"
	, salary "급여"
from employee
where
	dep_no != 10
	and salary in (select salary from employee where dep_no=10);
