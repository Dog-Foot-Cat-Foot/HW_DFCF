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
