-- 소희
-- 3. 고객 나이 순으로 정렬하였을 경우 3행부터 8행까지 검색하면?
-- 고객번호, 고객명, 고객나이, 담당직원번호, 담당직원명, 직급, 담당직원부서명, 부서위치를 보여주세요.
-- 고객 나이순으로 보여주세요.

-- 쿼리문 작성한 순서
-- 고객 나이순 정렬
-- 8행까지 검색
-- 3행부터 검색

SELECT zxc.cus_no "고객번호", zxc.cus_name "고객명"
       , EXTRACT( YEAR FROM SYSDATE )
            - TO_NUMBER(DECODE(SUBSTR(zxc.jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(zxc.jumin_num, 1, 2))
            + 1  "고객나이"
       , zxc.emp_no "담당직원번호", e.emp_name "담당직원명", e.jikup "직급"
       , d.dep_name "담당직원부서명", d.loc "부서위치"
FROM (
  SELECT ROWNUM "RNUM" ,d.* FROM (
      SELECT * FROM customer ORDER BY DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')
                              ||SUBSTR(jumin_num, 1, 6)
      -- 고객 나이순 정렬
  ) d WHERE ROWNUM <= 8  -- 8행까지
) zxc, employee e, dept d
WHERE zxc.emp_no = e.emp_no(+) AND e.dep_no = d.dep_no(+)  -- 조인조건
        AND zxc.rnum >= 3  -- 3행부터
ORDER BY zxc.rnum  -- 고객 나이순 정렬


-- 4. 직속상관이 있는 직원 중 입사일 순으로 정렬하였을 경우 3행부터 8행까지 검색하면?
-- 직원번호, 직원명, 부서번호, 부서명, 직급, 연봉, 연봉등급, 입사일을 보여주세요.
-- 입사일은 "년-월-일 (요일) x/4분기" 형식으로 보여주세요
-- 입사일 순으로 보여주세요.

-- 쿼리문 작성 순서
-- 입사일 순 정렬
-- 8행까지 정렬
-- 3행부터 정렬

SELECT zxc.emp_no "직원번호", zxc.emp_name "직원명", zxc.dep_no "부서번호"
        , d.dep_name "부서명", zxc.jikup "직업", zxc.salary "연봉"
        , s.sal_grade_no "연봉등급"
        , TO_CHAR(zxc.hire_date, 'YYYY-MM-DD (DY) Q/"4분기"', 'NLS_DATE_LANGUAGE = KOREAN') "입사일"
FROM (
  SELECT ROWNUM "RNUM", d.* FROM (
      SELECT * FROM employee WHERE mgr_emp_no IS NOT NULL ORDER BY hire_date
      -- 입사일 순 정렬, 직속상관이 있는 직원 중
  ) d WHERE ROWNUM <= 8  -- 8행까지 정렬
) zxc, dept d, salary_grade s
WHERE zxc.dep_no = d.dep_no AND zxc.salary BETWEEN s.min_salary AND s.max_salary -- 조인조건
        AND zxc.rnum >= 3  -- 3행부터
ORDER BY zxc.rnum  -- 입사일 순 정렬