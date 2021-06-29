-- 이현
-- 3. 나이가 어린 순서대로 직원을 검색하되 11행부터 20행까지만 검색하면? (inline view)

-- 나이가 어린 순서
-- 20행까지만 검색
-- 11행부터 검색

SELECT * FROM (
  SELECT ROWNUM "RNUM", zxc.* FROM
  (
    SELECT * FROM employee
    ORDER BY DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 6) DESC
    ) zxc WHERE ROWNUM <= 20   -- 20행까지만 검색
) WHERE rnum >= 11  -- 11행까지만 검색

-- 4. 직원들의 생일 월별로 인원수, 평균나이, 평균연봉을 검색하면?
-- <조건> 생일 월 오름차순 유지
-- <조건> 위 결과에서 4월, 6월, 8월은 없어서 빠짐. 4월, 6월과 8월도 포함시키고 인원수는 0으로 포함
-- <조건> 평균 연봉은 소숫점 두번째 자리에서 반올림하기
SELECT day.xday||'월'   "생일월별"
        , NVL(COUNT(e.emp_no), 0)   "인원수"
        , FLOOR(AVG( EXTRACT(YEAR FROM SYSDATE)
            - TO_NUMBER(DECODE(SUBSTR(e.jumin_num, 7, 1), '1', '19', '2', '19', '3', '20', '4', '20'
                        , TO_CHAR(EXTRACT(YEAR FROM SYSDATE)+1))||SUBSTR(e.jumin_num, 1, 2))
            + 1))  "평균나이"
        , NVL(ROUND(AVG(e.salary), 1), 0) "평균연봉"
FROM employee e, (
    SELECT '01' "XDAY" FROM DUAL UNION
    SELECT '02' FROM DUAL UNION SELECT '03' FROM DUAL UNION SELECT '04' FROM DUAL UNION
    SELECT '05' FROM DUAL UNION SELECT '06' FROM DUAL UNION SELECT '07' FROM DUAL UNION
    SELECT '08' FROM DUAL UNION SELECT '09' FROM DUAL UNION SELECT '10' FROM DUAL UNION
    SELECT '11' FROM DUAL UNION SELECT '12' FROM DUAL
) day
WHERE SUBSTR(e.jumin_num(+), 3, 2) = day.xday
GROUP BY day.xday||'월'
ORDER BY 1

-- 명진
-- 3. 이번달 중에 금요일의 개수를 구하면?
SELECT COUNT(*) "금요일의 개수" FROM
(
    SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD') "XDAY" FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+1 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+2 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+3 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+4 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+5 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+6 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+7 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+8 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+9 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+10 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+11 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+12 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+13 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+14 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+15 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+16 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+17 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+18 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+19 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+20 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+21 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+22 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+23 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+24 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+25 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+26 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+27 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+28 FROM DUAL
    UNION SELECT TO_DATE(TO_CHAR(SYSDATE, 'YYYYMM')||'01', 'YYYYMMDD')+29 FROM DUAL
) "M"
WHERE TO_CHAR(m.xday, 'd') = 6

-- 4. 고객번호, 고객명, 담당직원번호, 담당직원명, 담당직원소속부서명, 담당직원연봉등급
-- , 담당직원직속상관명, 담당직원직속상관직급, 직속상관연봉등급 출력하라.
-- <조건>담당직원 연봉 높은순으로 정렬하고, 6행부터 10행까지 출력하시오.
-- <조건>null 값이 있으면 포함되어 나와야한다.
SELECT * FROM (
    SELECT ROWNUM "RNUM", zxc.* FROM (
        SELECT c.cus_no "CUS_NO", c.cus_name "CUS_NAME", c.emp_no "EMP_NO", e1.emp_name "EMP_NAME", d.dep_name "DEP_NAME"
                , s1.sal_grade_no "SAL_GRADE_NO", e2.emp_name "EMP_NAME2", e2.jikup "JIKUP2", s2.sal_grade_no "SAL_GRADE_NO2"
        FROM customer c LEFT OUTER JOIN employee e1 ON c.emp_no = e1.emp_no
                        LEFT OUTER JOIN dept d ON e1.dep_no = d.dep_no
                        LEFT OUTER JOIN salary_grade s1 ON e1.salary BETWEEN s1.min_salary AND s1.max_salary
                        LEFT OUTER JOIN employee e2 ON e1.mgr_emp_no = e2.emp_no
                        LEFT OUTER JOIN salary_grade s2 ON e2.salary BETWEEN s2.min_salary AND s2.max_salary
        ORDER BY e1.salary DESC
    ) zxc WHERE ROWNUM <= 10 -- 10행까지
) asd WHERE asd.rnum >= 6 -- 6행까지이강민

-- 은지
-- 1. 고객번호, 고객명, '-'를 포함한 고객주민번호, '-'를 포함한 고객전화번호
-- , 담당직원명, 담당직원소속부서명, 담당직원연봉등급
-- , 담당직원직속상관명, 담당직원직속상관직급, 직속상관연봉등급을 출력하라.
-- 단 고객은 다 나와야하고 null은 'X' 로 표시
SELECT c.cus_no "고객번호", c.cus_name "고객명", SUBSTR(c.jumin_num, 1, 6)||'-'||SUBSTR(c.jumin_num, 7, 7) "고객주민번호"
        , c.tel_num "고객전화번호", NVL(e.emp_name||'', 'X') "담당직원명", NVL(d.dep_name||'', 'X') "담당직원소속부서명"
        , NVL(s.sal_grade_no||'', 'X') "담당직원연봉등급", NVL(e2.emp_name||'', 'X') "담당직원직속상관명"
        , NVL(e2.jikup||'', 'X') "담당직원직속상관직급", NVL(s2.sal_grade_no||'', 'X') "직속상관연봉등급"
FROM customer c LEFT OUTER JOIN employee e ON c.emp_no = e.emp_no
                LEFT OUTER JOIN dept d ON e.dep_no = d.dep_no
                LEFT OUTER JOIN salary_grade s ON e.salary BETWEEN s.min_salary AND s.max_salary
                LEFT OUTER JOIN employee e2 ON e.mgr_emp_no = e2.emp_no
                LEFT OUTER JOIN salary_grade s2 ON e2.salary BETWEEN s2.min_salary AND s2.max_salary

-- 2. 연봉 서열대로 직원을 검색! 단, 1행부터 15행까지만!
SELECT * FROM (
    SELECT ROWNUM "RNUM", zxc.* FROM (
        SELECT * FROM employee ORDER BY salary
    ) zxc WHERE ROWNUM <= 15
) WHERE rnum >= 1