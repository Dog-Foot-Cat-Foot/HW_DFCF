-- 이현
--1. 연봉등급별, 직급별로 [연봉등급], [직급], [직원수], [평균연봉], [평균 나이]를 출력하면?
--(단, 평균연봉과 평균 나이는 소수점 둘째자리에서 반올림하고 연봉등급 순으로 나열하기)
SELECT s.sal_grade_no 연봉등급, e.jikup 직급, COUNT(*) 직원수, ROUND(AVG(salary), 1) 평균연봉
        , ROUND(AVG(EXTRACT(YEAR FROM SYSDATE) - TO_NUMBER(CASE WHEN SUBSTR(jumin_num, 7, 1) IN ('1', '2') THEN '19' ELSE '20' END
                    ||SUBSTR(jumin_num, 1, 2)) + 1), 1) 평균나이
FROM salary_grade s, employee e
WHERE e.salary BETWEEN s.min_salary AND s.max_salary
GROUP BY s.sal_grade_no, e.jikup
ORDER BY 1
;

SELECT * FROM employee e, salary_grade s WHERE e.salary BETWEEN s.min_salary AND s.max_salary

--
--2. 출생년대와 출생월별로 [출생년대], [출생월], [직원수], [평균나이], [나이가 가장 많은 사람], [나이가 가장 적은 사람]을 출력하면?
--(단, 평균 나이는 소수점 첫째자리까지 나타내고 출생년대와 출생월별 순으로 정렬하기)
SELECT CASE WHEN SUBSTR(jumin_num, 7, 1) IN('1', '2') THEN '19' ELSE '20' END||SUBSTR(jumin_num, 1, 1)||'0년대' 출생년대
        , SUBSTR(jumin_num, 3, 2) 출생월, COUNT(*) 직원수
        , ROUND(AVG(EXTRACT(YEAR FROM SYSDATE) - TO_NUMBER(CASE WHEN SUBSTR(jumin_num, 7, 1) IN ('1', '2') THEN '19' ELSE '20' END
                ||SUBSTR(jumin_num, 1, 2)) + 1), 1) 평균나이
        , MAX(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19' , '20')||SUBSTR(jumin_num, 1, 2)) "나이가 가장 많은 사람"
        , MIN(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19' , '20')||SUBSTR(jumin_num, 1, 2)) "나이가 가장 적은 사람"
FROM employee
GROUP BY CASE WHEN SUBSTR(jumin_num, 7, 1) IN('1', '2') THEN '19' ELSE '20' END||SUBSTR(jumin_num, 1, 1)||'0년대'
        , SUBSTR(jumin_num, 3, 2)
ORDER BY 출생년대, 출생월
;

--
--3. 핸드폰번호 앞자리 첫번째 숫자별로 [직원들의 수]와 [평균 연봉]을 구하되 인원수가 2명 이상을 출력하면?
--(단, 핸드폰 번호 앞자리는 '010-nXXX-XXXX'형태로 출력하고 평균 연봉은 소수점을 버리고 나타내기)
SELECT SUBSTR(phone, 1, 3)||'-'||SUBSTR(phone, 4, 1)||'XXX-XXXX'  핸드폰번호
        , COUNT(*)             "직원들의 수"
        , FLOOR(AVG(salary))   "평균 연봉"
FROM employee
GROUP BY SUBSTR(phone, 1, 3)||'-'||SUBSTR(phone, 4, 1)||'XXX-XXXX'
HAVING COUNT(*) >= 2
;

--
-- 지언
--1. 직원명, 부서번호, 하루급여, 시급을 출력한다
--직원들은 월 평균 21.5일을 일을하고 8시간 근무한다.
--일 급여는 소수점 첫번째까지 출력하게 하고 시급은 소수점 3번째까지 반올림하여 출력한다.
SELECT emp_name 직원명, dep_no 부서번호, ROUND((salary/12)/21.5, 1) 하루급여, ROUND(((salary/12)/12.5)/8, 3) 시급
FROM employee
;

--2.직원명, 부서번호, 정직원되는날을 출력한다.
-- employee 테이블에서 입사일 기준으로 3개월이 지난 후 첫 월요일에 정직원이 된다.
-- 정직원이 되는 날짜를 YYYY-MM-DD 형식으로 출력한다.
-- 또한 현재 시점에서 직속상관이 있는 사원들은 전부 Y로 표기하고 없는 직원들은 N으로 표기한다.
SELECT emp_name 직원명, dep_no 부서번호
        , TO_CHAR(NEXT_DAY(ADD_MONTHS(hire_date, 3), 2), 'YYYY-MM-DD') 정직원되는날
        , NVL2(mgr_emp_no, 'Y', 'N') 직속상관여부
FROM employee
;

--3. 직원명, 직원번호, 직속상관번호를 출력한다
--사원들의 직속상관의 번호가 1번부터 5번까지는 표기할 때 A로 표시해주고 6번10번까지는 B, 11~ 15 C, 16~20 D로 표기한다
--또한 직속상관이 없는 직원은 0000으로 표기한다
-- A~D 까지 순서대로 출력한다
SELECT emp_name 직원명, emp_no 직원번호
        , CASE
           WHEN mgr_emp_no IN(1, 2, 3, 4, 5) THEN 'A'
           WHEN mgr_emp_no IN(6, 7, 8, 9, 10) THEN 'B'
           WHEN mgr_emp_no IN(11, 12, 13, 14, 15) THEN 'C'
           WHEN mgr_emp_no IN(16, 17, 18, 19, 20) THEN 'D'
           ELSE '0000'
          END  직속상관번호
FROM employee
;

-- 은지
--Q1. customer 테이블에서 고객번호, 고객이름, 고객나이, 담당직원번호(null일 때 '없음'으로 표시)를 검색!
--(단! 나이가 많은 사람이 먼저!)
SELECT cus_no 고객번호, cus_name 고객이름
        , TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2)) + 1 고객나이
        , NVL(emp_no||'', '없음') 담당직원번호
FROM customer
ORDER BY 3
;
--Q2. 부서번호, 직원번호, 직원이름, 직급, 연봉, '-'를 포함은 주민번호, '-'를 포함한 핸드폰번호 검색!!
--(직급이 높은 사람이 먼저!)
SELECT dep_no 부서번호, emp_no 직원번호, emp_name 직원이름, jikup 직급, salary 연봉
        , SUBSTR(jumin_num, 1, 6)||'-'||SUBSTR(jumin_num, 7, 7) 주민번호
        , SUBSTR(phone, 1, 3)||'-'||SUBSTR(phone, 4, 4)||'-'||SUBSTR(phone, 8, 4) 핸드폰번호
FROM employee
ORDER BY DECODE(jikup, '사장', 1, '부장', 2, '과장', 3, '대리', 4, 5)
;
--Q3. 직원번호, 직원이름, 부서이름, 직급, 입사년도, 나이, 연봉, 직속상관번호, 직속상관이름 검색!
--(나이가 높은 사람이 먼저!)
SELECT e.emp_no 직원번호, e.emp_name 직원이름
        , (SELECT dep_name FROM dept d WHERE d.dep_no = e.dep_no) 부서이름
        , EXTRACT(YEAR FROM SYSDATE)
            - TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2)) + 1  나이
        , salary  연봉
        , (SELECT e2.emp_no FROM employee e2 WHERE e.mgr_emp_no = e2.emp_no)  직속상관번호
        , (SELECT e2.emp_name FROM employee e2 WHERE e.mgr_emp_no = e2.emp_no) 직속상관이름
FROM employee e
ORDER BY 나이 DESC
;

--명진
--1. 퇴직일이 65세 라는 기준 하에 아래 처럼 출력하면?
--[직원번호], [직원명], [근무년차], [퇴직일까지 남은 년도], [소속부서명], [직속상관명],[직속상관 담당고객 인원수]
--단, 모든 직원 다 나오고, 직급 높은 먼저 나오고 직급이 같으면 나이가 많은 사람이 나와야함.
SELECT emp_no 직원번호, emp_name 직원명, CEIL((SYSDATE - hire_date)/365) 근무년차
        , 65 - (EXTRACT(YEAR FROM SYSDATE)
                - TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2) )
                + 1
                )   "퇴직일까지 남은 년도"
        , (SELECT dep_name FROM dept d WHERE d.dep_no = e.dep_no)  소속부서명
        , (SELECT e2.emp_name FROM employee e2 WHERE e.mgr_emp_no = e2.emp_no) 직속상관명
        , (SELECT COUNT(*) FROM customer c, employee e2 WHERE e2.emp_no = e.mgr_emp_no AND e2.emp_no = c.emp_no)
        "상관 고객 인원수"
FROM employee e
ORDER BY DECODE(jikup, '사장', 1, '부장', 2, '과장', 3, '대리', 4, 5)
        , (EXTRACT(YEAR FROM SYSDATE)
            - DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2)
            + 1
            )
;

--
--2. 부서별 직원들의 입사년대 출력하시오
--[부서이름], [부서위치], [입사년대]
SELECT dep_name 부서이름, loc 부서위치, SUBSTR(EXTRACT(YEAR FROM e.hire_date), 1, 3)||'0' 입사년대
FROM dept d, employee e
WHERE d.dep_no = e.dep_no
GROUP BY dep_name, loc, SUBSTR(EXTRACT(YEAR FROM e.hire_date), 1, 3)||'0'
;

--
--3. 직급별 담당고객수를 출력하시오.
--[직급], [직원수], [담당고객수]
--단, 낮은 직급이 먼저 나오게 하시오.
SELECT jikup 직급, COUNT(DISTINCT e.emp_no) 직원수, COUNT(c.emp_no) 담당고객수
FROM employee e, customer c
WHERE e.emp_no = c.emp_no(+)
GROUP BY jikup
ORDER BY DECODE(jikup, '사장', 1, '부장', 2, '과장', 3, '대리', 4, 5) DESC
;