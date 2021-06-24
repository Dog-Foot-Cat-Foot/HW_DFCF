-- 소희
-- 1
SELECT o.animal_id, o.name
FROM animal_ins i RIGHT OUTER JOIN animal_outs o
ON o.animal_id = i.animal_id WHERE i.animal_id IS NULL
ORDER BY 1;

-- 2
SELECT i.animal_id, i.name
FROM animal_ins i, animal_outs o
WHERE i.animal_id = o.animal_id AND i.datetime > o.datetime
ORDER BY i.datetime;

-- 3
SELECT i.name, i.datetime
FROM animal_ins i LEFT OUTER JOIN animal_outs o
ON i.animal_id = o.animal_id
WHERE o.animal_id IS NULL
ORDER BY i.datetime
FETCH FIRST 3 ROWS ONLY;

-- 이현
-- 1. '이순라'와 직급이 동일한 사람들 중 '전산부'인 사람들을 검색하여 입사순으로 정렬하기
SELECT *
FROM employee e
WHERE jikup = (SELECT jikup FROM employee WHERE emp_name = '이순라')
    AND
      dep_no = (SELECT dep_no FROM dept d WHERE dep_name = '전산부')
ORDER BY hire_date;

-- 2. 직원번호, 직원명, 나이, 입사일, 입사일 순위를 출력하기 (단, 입사일 순위를 오름차순으로 정렬)
SELECT emp_no  직원번호
        , emp_name 직원명
        , TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY'))
            - TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')
                    ||SUBSTR(jumin_num, 1, 2)) 나이
        , TO_CHAR(hire_date, 'YYYY-MM-DD') 입사일
        , (SELECT COUNT(*) + 1 FROM employee e2 WHERE
             e1.hire_date > e2.hire_date
        )  입사일순위
FROM employee e1
ORDER BY 5;

-- 3. 고객번호, 고객명, 주민번호, 생일 순위를 출력하기 (단, 생일 순위를 내림차순으로 정렬)
SELECT cus_no, cus_name, jumin_num
        , (SELECT COUNT(*)+1 FROM customer c2
            WHERE DECODE(SUBSTR(c1.jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(c1.jumin_num, 1, 6)
                > DECODE(SUBSTR(c2.jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(c2.jumin_num, 1, 6) )  생일순위
FROM customer c1
ORDER BY 4 DESC;

-- 명진
-- 1. 고객번호, 고객명, 담당직원번호, 담당직원부서명을 출력하라.
-- 단, 담당직원중 직속상관이 이성계인 경우만 출력
SELECT c.cus_no, c.cus_name, c.emp_no, d.dep_name
FROM customer c, employee e1, dept d, employee e2
WHERE c.emp_no = e1.emp_no AND e1.dep_no = d.dep_no AND e1.mgr_emp_no = e2.emp_no
        AND e2.emp_name = '이성계'

-- 2. 고객번호, 고객명, 담당직원유무, 담당직원명, 담당직원 연봉등급을 출력하라.
-- 단, null 은 X로 표시, 담당직원유무는 담당직원번호를 이용하여 값이 있으면 O로 표시 정렬은 고객번호 내림차순
SELECT c.cus_no, c.cus_name, NVL2(c.emp_no, 'O', 'X'), e.emp_name, s.sal_grade_no
FROM customer c, employee e, salary_grade s
WHERE c.emp_no = e.emp_no(+) AND e.salary BETWEEN s.min_salary(+) AND s.max_salary(+)
ORDER BY cus_no DESC;

-- 3. 연봉 3000이상인 직원의 부하직원들의 직원번호, 직원명, 연봉, 연봉등급을 출력하라.(서브쿼리)
-- ORACLE JOIN
SELECT e2.emp_no, e2.emp_name, e2.salary, s.sal_grade_no
FROM employee e1, employee e2, salary_grade s
WHERE e1.emp_no = e2.mgr_emp_no AND e1.salary >= 3000
        AND e2.salary BETWEEN s.min_salary AND s.max_salary
ORDER BY 1 ;

-- SUBQUERY
SELECT
        emp_no       직원번호
        , emp_name   직원명
        , salary     연봉
        , (SELECT s.sal_grade_no FROM salary_grade s WHERE
                    e1.salary BETWEEN s.min_salary AND s.max_salary ) 연봉등급
FROM employee e1
WHERE (SELECT e2.salary FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no) >= 3000

-- 승태
-- 1. '임꺽정'보다 늦게 입사한 직원의 이름,입사일을 검색하시오.
SELECT emp_name, TO_CHAR(hire_date, 'YYYY-MM-DD')
FROM employee
WHERE (SELECT hire_date FROM employee WHERE emp_name = '임꺽정') < hire_date;

-- 2. 영업부에서 일하는 사원들의 이름 , 직급을 출력하라.
SELECT emp_name, jikup
FROM employee
WHERE (SELECT dep_no FROM dept WHERE dep_name = '영업부') = dep_no;

-- 3. 전체 직원 중 '이순신'과 같은 직책인 사원들의 이름,연봉,부서명을 출력하시오
SELECT emp_name, salary, (SELECT dep_name FROM dept d WHERE d.dep_no = e.dep_no)
FROM employee e
WHERE (SELECT jikup FROM employee WHERE emp_name = '이순신') = jikup;

-- 은지
-- Q1. 부서명, 직원번호, 직원이름, 직급, 담당고객수를 검색.
SELECT (SELECT dep_name FROM dept d WHERE d.dep_no = e.dep_no)
        , phone
        , emp_name
        , jikup
        , (SELECT COUNT(*) FROM customer c WHERE c.emp_no = e.emp_no)
FROM employee e

-- Q2. 담당고객이 1명인 직원번호, 직원이름, 직급, 연봉을 검색.
SELECT emp_no, emp_name, jikup, salary
FROM employee e
WHERE (SELECT COUNT(*) FROM customer c WHERE c.emp_no = e.emp_no) = 1

-- Q3. 직급명, 직급직원수, 직급담당고객수 검색.
-- ORACLE JOIN
SELECT
        jikup                       직급명
        , COUNT(DISTINCT e.emp_no)  직급직원수
        , COUNT(c.emp_no)           직급담당고객수
FROM employee e, customer c
WHERE e.emp_no = c.emp_no(+)
GROUP BY jikup
ORDER BY DECODE(jikup, '사장', 1, '부장', 2, '과장', 3, '대리', 4, 5);

-- ANSI JOIN
SELECT
        jikup                       직급명
        , COUNT(DISTINCT e.emp_no)  직급직원수
        , COUNT(c.emp_no)           직급담당고객수
FROM employee e LEFT OUTER JOIN customer c ON e.emp_no = c.emp_no
GROUP BY jikup
ORDER BY DECODE(jikup, '사장', 1, '부장', 2, '과장', 3, '대리', 4, 5);

-- SUBQUERY
SELECT
        DISTINCT jikup   직급명
        , (SELECT COUNT(*) FROM employee e2 WHERE e.jikup = e2.jikup) 직급직원수
        , (SELECT COUNT(*) FROM employee e2, customer c WHERE e2.emp_no = c.emp_no
                                    AND e2.jikup = e.jikup ) 직급담당고객수
FROM employee e
ORDER BY DECODE(jikup, '사장', 1, '부장', 2, '과장', 3, '대리', 4, 5);

