-- 승태
-- 3. 직원테이블에서 이름이 류명한인 데이터와 같은 부서에서 근무하는 사원의 이름과
-- 부서번호를 출력하는 SQL 문을 작성하시오
SELECT emp_name, dep_no
FROM employee
WHERE dep_no = ANY(SELECT dep_no FROM employee WHERE emp_name = '류명한') AND emp_name != '류명한'


-- 4.10번 부서에 속하지 않으면서 10번 부서원들과 같은 급여를 받는 사원들의
-- 사번, 이름, 급여를 출력하는 SQL 문을 작성하시오
SELECT emp_no, emp_name, salary
FROM employee
WHERE dep_no <> 10 AND salary = ANY(SELECT salary FROM employee WHERE dep_no = 10)

-- 지언
-- 1.부서번호별 직급별로 직원수 ,최대 연봉, 최소 연봉 , 합 연봉,평균 연봉을 출력한다
-- 그룹으로 지어줄 것은 부서번호, 직급이다
-- 평균값은 소수점 첫번째 자리까지 표현한다
-- 부서마다 마지막에 부서의 총데이터 합을 구한다.
-- 결과 값 마지막에는 총 데이터의 결과를 출력한다.
-- 결과 값이 이런식으로 나오게끔 출력해보자
SELECT dep_no, jikup, COUNT(*), MAX(salary), MIN(salary), SUM(salary), TRUNC(AVG(salary), 1)
FROM employee
GROUP BY ROLLUP(dep_no, jikup)
ORDER BY 1

-- 2. 부서번호별 직급별로 직원수 ,최대 연봉, 최소 연봉 , 합 연봉,평균 연봉을 출력한다
--그룹으로 지어줄 것은 부서번호, 직급이다
--평균값은 소수점 첫번째 자리까지 표현한다
--부서마다 마지막에 부서의 총데이터 합을 구한다.
--결과 값 마지막에는 직급별로 총 데이터를 구하고 모든인원의 데이터를 구한다.
SELECT dep_no, jikup, COUNT(*), MAX(salary), MIN(salary), SUM(salary), TRUNC(AVG(salary), 1)
FROM employee
GROUP BY  CUBE(dep_no, jikup)
ORDER BY 1


-- 희원
-- 3. employee 테이블 에 행 추가 '김김김', 35, '대리', 3000, '2012-02-28', '8911091109310', '01091499215', 2 데이터를 입력하면?
INSERT INTO employee((SELECT NVL(MAX(emp_no), 0) + 1 FROM employee), emp_name, dep_no, jikup
                    , salary, hire_date, jumin_num, phone, mgr_emp_no)
    VALUES('김김김', 35, '대리', 3000, TO_DATE('2012-02-28', 'YYYY-MM-DD'), '8911091109310', '01091499215', 2)
-- dep_no 35번이 없는뎅

SELECT * FROM employee