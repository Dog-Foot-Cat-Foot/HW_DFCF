-- 이현
-- 1. customer 테이블에서 고객번호, 고객명, 생년월일('년.월.일'), 성별('여', '남')을 검색하면?
SELECT
       cus_no  고객번호
       , cus_name   고객명
       ,  TO_CHAR(
            TO_DATE(
                DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19' ,'20')
                    ||SUBSTR(jumin_num, 1, 6)
            , 'YYYYMMDD')
           , 'YYYY.MM.DD') 생년월일
       , DECODE(SUBSTR(jumin_num, 7, 1) ,'1', '남', '3', '남', '여' )  성별
FROM customer;


-- 2. customer 테이블에서 고객번호, 고객명, 전화 번호, 담당고객(있으면 O, 없으면 X)을 출력할 때,
-- 핸드폰 번호를 기준(오름차순)으로 정렬하여 출력하면?
SELECT
        cus_no   고객번호
        , cus_name  고객명
        , tel_num    "전화 번호"
        , NVL2(emp_no, 'O','X' )  "담당고객"
FROM customer
ORDER BY 3;


-- 3. customer 테이블에서 고객번호, 고객명, 주민번호('970101-2******')를 출력할 때,
-- 나이가 많은 순서대로 정렬하여 출력하면?
SELECT
        cus_no     고객번호
        , cus_name   고객명
        , SUBSTR(jumin_num, 1, 6) || '-' || SUBSTR(jumin_num, 7, 1) || '******'  주민번호
FROM customer
ORDER BY DECODE( SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20') || SUBSTR(jumin_num, 1, 6) ;


-- 명진
-- 1. employee 테이블에서 부하직원을 가진 직원
SELECT COUNT(DISTINCT mgr_emp_no) "직속상사 직원수"
FROM employee;


-- 2. customer 테이블에서 고객의 연령대
SELECT FLOOR((TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY')) - TO_NUMBER(DECODE( SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20' )
                        || SUBSTR(jumin_num, 1, 2)) +1)*0.1) || '0대' "연령대"
FROM customer;

-- 3. customer 테이블에서 고객의 생일
SELECT TO_CHAR(TO_DATE(DECODE( SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')
                || SUBSTR( jumin_num, 1, 6), 'YYYYMMDD'), 'YYYY-MM-DD')  생일
FROM customer;


-- 은지
-- 1. employee 테이블에서 직원번호, 직원명, 직급, 연봉, 직속상관 번호를 출력하면?
-- 단, 직속상관번호가 없으면 '없음'으로 표시!
SELECT
        emp_no   직원번호
        , emp_name   직원명
        , jikup      직급
        , salary      연봉
        , NVL(mgr_emp_no||'', '없음')   직속상관번호
FROM employee;


-- 2. employee 테이블에서 직원번호, 직원명, 직급, 연봉, 핸드폰번호는 '-' 를 포함한 전체 번호를 출력하면?
SELECT
        emp_no    직원번호
        , emp_name   직원명
        , jikup      직급
        , salary     연봉
        , SUBSTR(phone, 1, 3) || '-' || SUBSTR(phone, 4, 4) || '-' || SUBSTR(phone, 8, 4)  핸드폰번호
FROM employee;