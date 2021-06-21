-- 이현
-- 1. customer 테이블에서 50대인 사람들의 고객번호, 고객명, 나이를 검색하고 나이순으로 정렬하기
SELECT cus_no
        , cus_name
        , TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY'))
            - TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2))
            + 1  나이
FROM customer
WHERE FLOOR((TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY'))
            - TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2))
            + 1)* 0.1) = 5
ORDER BY 3;

-- 2. customer 테이블에서 이름의 마지막에 '이'가 들어가는 사람들 중
-- 70년대 생들만 검색하여 나이가 어린 순으로 정렬하기
SELECT *
FROM customer
WHERE cus_name LIKE '%이' AND SUBSTR(jumin_num, 1, 1) = '7'
ORDER BY 4;

-- 3. customer 테이블에서 핸드폰 뒤 네자리가 1로 시작하는 사람들 중
-- '이'씨 성을 가진 사람들만 검색하기
SELECT *
FROM customer
WHERE SUBSTR(tel_num, 5, 1) = '1' AND cus_name LIKE '이%';

-- 은지
-- 1. EMPLOYEE 테이블에서 이씨와 임씨를 검색하면?
SELECT *
FROM employee
WHERE emp_name LIKE '이%' OR emp_name LIKE '임%';

-- 2. 직원번호, 직원명, 소속부서번호, 소속부서명 검색하면?
SELECT emp_no, emp_name, e.dep_no, dep_name
FROM employee e, dept d
WHERE e.dep_no = d.dep_no;

-- 3. 평균 연봉보다 적게 받는 직원은?
SELECT *
FROM employee
WHERE ( SELECT avg(salary)
        FROM employee ) > salary;

-- 승태
-- 1. employee 테이블에서 10번 부서 직원들의 현재까지의 근무 월수를 계산하시오
-- (소수첫째자리까지 보여지게하시오)
SELECT ROUND(MONTHS_BETWEEN(SYSDATE, hire_date), 1) 근무월수
FROM employee
WHERE dep_no = 10;

-- 2. employee 테이블에서 부서번호가 10번이 아니고 ,
-- 입사일짜가 1987년 1월 1일 이후인 사원의 정보를 검색하시오 ( 조건 not in 함수 사용 )
SELECT *
FROM employee
WHERE dep_no NOT IN(10) AND hire_date > TO_DATE('1987-01-01', 'YYYY-MM-DD');

-- 3. 부서가 30이고 급여가 1500이상 3300이하인 이름,급여,부서명,부서번호를 출력하시오.
SELECT emp_name, salary, dep_name, d.dep_no
FROM employee e, dept d
WHERE e.dep_no = d.dep_no
    AND e.dep_no = 30 AND salary BETWEEN 1500 AND 33000;

-- 명진
-- 1. employee 테이블에서 성이 이씨이고 나이가 60대인 직원을 검색하면?
SELECT *
FROM employee
WHERE emp_name LIKE '이%'
        AND FLOOR((TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY'))
            - TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2))
            + 1)* 0.1) = 6;

-- 2. employee 테이블에서 이름에 라가 들어가고 여자인 직원을 검색하면?
SELECT *
FROM employee
WHERE emp_name LIKE '%라%' AND SUBSTR(jumin_num, 7, 1) IN('2', '4');

-- 3. customer 테이블에서 고객이름과 전화번호 담당직원 을 검색하면? 단, 고객이름 내림차순
SELECT c.cus_name, e.phone
FROM customer c, employee e
WHERE c.emp_no = e.emp_no
ORDER BY 1 DESC;