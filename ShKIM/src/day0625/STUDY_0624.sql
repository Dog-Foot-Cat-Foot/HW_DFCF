-- 소희
-- 1. 담당고객이 있는 직원 중 연봉등급별로 연봉등급, 인원수, 급여합, 평균연봉을 출력해주세요.
-- 평균연봉은 소수 첫째 자리에서 버림해주세요.
-- 연봉등급이 낮은순으로 보여주세요.
-- 급여합과 평균연봉은 (xxx,xxx만원) 형식으로 보여주세요.
SELECT
        s.sal_grade_no                                      연봉등급
        , COUNT(DISTINCT e.emp_no)||'명'                    인원수
        , TO_CHAR(SUM(salary), '999,999')||'만원'           급여합
        , TO_CHAR(TRUNC(AVG(salary), 0), '999,999')||'만원' 평균연봉
FROM employee e, salary_grade s, customer c
WHERE e.salary BETWEEN s.min_salary AND s.max_salary  AND c.emp_no = e.emp_no
GROUP BY
        s.sal_grade_no
ORDER BY
        1 DESC;

-- 2. 10번 부서 직원의 부하직원 중 먼저 입사한 순으로 순위를 주세요.
-- 입사일 순위, 직원번호, 직원이름, 입사일, 상사의 직원번호, 상사이름을 보여 주세요.
-- 입사일은 (년-월-일 요일)로 보여주세요.
-- 가장 최근에 입사한 직원 순으로 보여주세요.
-- 서브쿼리로 풀어주세요.
SELECT
        (SELECT COUNT(*)+1 FROM employee e2, employee e3 WHERE e1.hire_date > e2.hire_date
                AND e2.mgr_emp_no = e3.emp_no AND e3.dep_no = 10) 입사순위
        , e1.emp_no            직원번호
        , e1.emp_name          직원명
        , TO_CHAR(hire_date, 'YYYY-MM-DD DAY', 'NLS_DATE_LANGUAGE = KOREAN')   입사일
        , (SELECT e2.emp_no FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no) 상사번호
        , (SELECT e2.emp_name FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no) 상사이름
FROM employee e1
WHERE (SELECT e2.emp_no FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no AND e2.dep_no = 10) = e1.mgr_emp_no
ORDER BY 입사순위 DESC;


-- 3. 직속상관보다 연봉이 높은 부하직원이 있을 경우 얼마나 더 받는지 궁금해요.
-- 부하직원명, 직급, 연봉, 직속상관명, 직속상관연봉, 연봉차이를 보여주세요.
-- 서브쿼리로 풀어주세요
SELECT
       e1.emp_name   부하직원명
       , e1.jikup    직급
       , e1.salary   연봉
       , (SELECT e2.emp_name FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no)   직속상관명
       , (SELECT e2.salary FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no)     직속상관연봉
       , (SELECT e1.salary - e2.salary FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no)  연봉차이
FROM
        employee e1
WHERE
        (SELECT e2.salary FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no) < e1.salary
