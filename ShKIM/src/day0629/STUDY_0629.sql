-- ����
-- 3. ���̰� � ������� ������ �˻��ϵ� 11����� 20������� �˻��ϸ�? (inline view)

-- ���̰� � ����
-- 20������� �˻�
-- 11����� �˻�

SELECT * FROM (
  SELECT ROWNUM "RNUM", zxc.* FROM
  (
    SELECT * FROM employee
    ORDER BY DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 6) DESC
    ) zxc WHERE ROWNUM <= 20   -- 20������� �˻�
) WHERE rnum >= 11  -- 11������� �˻�

-- 4. �������� ���� ������ �ο���, ��ճ���, ��տ����� �˻��ϸ�?
-- <����> ���� �� �������� ����
-- <����> �� ������� 4��, 6��, 8���� ��� ����. 4��, 6���� 8���� ���Խ�Ű�� �ο����� 0���� ����
-- <����> ��� ������ �Ҽ��� �ι�° �ڸ����� �ݿø��ϱ�
SELECT day.xday||'��'   "���Ͽ���"
        , NVL(COUNT(e.emp_no), 0)   "�ο���"
        , FLOOR(AVG( EXTRACT(YEAR FROM SYSDATE)
            - TO_NUMBER(DECODE(SUBSTR(e.jumin_num, 7, 1), '1', '19', '2', '19', '3', '20', '4', '20'
                        , TO_CHAR(EXTRACT(YEAR FROM SYSDATE)+1))||SUBSTR(e.jumin_num, 1, 2))
            + 1))  "��ճ���"
        , NVL(ROUND(AVG(e.salary), 1), 0) "��տ���"
FROM employee e, (
    SELECT '01' "XDAY" FROM DUAL UNION
    SELECT '02' FROM DUAL UNION SELECT '03' FROM DUAL UNION SELECT '04' FROM DUAL UNION
    SELECT '05' FROM DUAL UNION SELECT '06' FROM DUAL UNION SELECT '07' FROM DUAL UNION
    SELECT '08' FROM DUAL UNION SELECT '09' FROM DUAL UNION SELECT '10' FROM DUAL UNION
    SELECT '11' FROM DUAL UNION SELECT '12' FROM DUAL
) day
WHERE SUBSTR(e.jumin_num(+), 3, 2) = day.xday
GROUP BY day.xday||'��'
ORDER BY 1

-- ����
-- 3. �̹��� �߿� �ݿ����� ������ ���ϸ�?
SELECT COUNT(*) "�ݿ����� ����" FROM
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

-- 4. ����ȣ, ����, ���������ȣ, ���������, ��������ҼӺμ���, ��������������
-- , ����������ӻ����, ����������ӻ������, ���ӻ��������� ����϶�.
-- <����>������� ���� ���������� �����ϰ�, 6����� 10����� ����Ͻÿ�.
-- <����>null ���� ������ ���ԵǾ� ���;��Ѵ�.
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
    ) zxc WHERE ROWNUM <= 10 -- 10�����
) asd WHERE asd.rnum >= 6 -- 6������̰���

-- ����
-- 1. ����ȣ, ����, '-'�� ������ ���ֹι�ȣ, '-'�� ������ ����ȭ��ȣ
-- , ���������, ��������ҼӺμ���, ��������������
-- , ����������ӻ����, ����������ӻ������, ���ӻ����������� ����϶�.
-- �� ���� �� ���;��ϰ� null�� 'X' �� ǥ��
SELECT c.cus_no "����ȣ", c.cus_name "����", SUBSTR(c.jumin_num, 1, 6)||'-'||SUBSTR(c.jumin_num, 7, 7) "���ֹι�ȣ"
        , c.tel_num "����ȭ��ȣ", NVL(e.emp_name||'', 'X') "���������", NVL(d.dep_name||'', 'X') "��������ҼӺμ���"
        , NVL(s.sal_grade_no||'', 'X') "��������������", NVL(e2.emp_name||'', 'X') "����������ӻ����"
        , NVL(e2.jikup||'', 'X') "����������ӻ������", NVL(s2.sal_grade_no||'', 'X') "���ӻ���������"
FROM customer c LEFT OUTER JOIN employee e ON c.emp_no = e.emp_no
                LEFT OUTER JOIN dept d ON e.dep_no = d.dep_no
                LEFT OUTER JOIN salary_grade s ON e.salary BETWEEN s.min_salary AND s.max_salary
                LEFT OUTER JOIN employee e2 ON e.mgr_emp_no = e2.emp_no
                LEFT OUTER JOIN salary_grade s2 ON e2.salary BETWEEN s2.min_salary AND s2.max_salary

-- 2. ���� ������� ������ �˻�! ��, 1����� 15�������!
SELECT * FROM (
    SELECT ROWNUM "RNUM", zxc.* FROM (
        SELECT * FROM employee ORDER BY salary
    ) zxc WHERE ROWNUM <= 15
) WHERE rnum >= 1