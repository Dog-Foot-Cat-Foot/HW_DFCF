-- ����
--1. ������޺�, ���޺��� [�������], [����], [������], [��տ���], [��� ����]�� ����ϸ�?
--(��, ��տ����� ��� ���̴� �Ҽ��� ��°�ڸ����� �ݿø��ϰ� ������� ������ �����ϱ�)
SELECT s.sal_grade_no �������, e.jikup ����, COUNT(*) ������, ROUND(AVG(salary), 1) ��տ���
        , ROUND(AVG(EXTRACT(YEAR FROM SYSDATE) - TO_NUMBER(CASE WHEN SUBSTR(jumin_num, 7, 1) IN ('1', '2') THEN '19' ELSE '20' END
                    ||SUBSTR(jumin_num, 1, 2)) + 1), 1) ��ճ���
FROM salary_grade s, employee e
WHERE e.salary BETWEEN s.min_salary AND s.max_salary
GROUP BY s.sal_grade_no, e.jikup
ORDER BY 1
;

SELECT * FROM employee e, salary_grade s WHERE e.salary BETWEEN s.min_salary AND s.max_salary

--
--2. ������� ��������� [������], [�����], [������], [��ճ���], [���̰� ���� ���� ���], [���̰� ���� ���� ���]�� ����ϸ�?
--(��, ��� ���̴� �Ҽ��� ù°�ڸ����� ��Ÿ���� ������� ������� ������ �����ϱ�)
SELECT CASE WHEN SUBSTR(jumin_num, 7, 1) IN('1', '2') THEN '19' ELSE '20' END||SUBSTR(jumin_num, 1, 1)||'0���' ������
        , SUBSTR(jumin_num, 3, 2) �����, COUNT(*) ������
        , ROUND(AVG(EXTRACT(YEAR FROM SYSDATE) - TO_NUMBER(CASE WHEN SUBSTR(jumin_num, 7, 1) IN ('1', '2') THEN '19' ELSE '20' END
                ||SUBSTR(jumin_num, 1, 2)) + 1), 1) ��ճ���
        , MAX(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19' , '20')||SUBSTR(jumin_num, 1, 2)) "���̰� ���� ���� ���"
        , MIN(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19' , '20')||SUBSTR(jumin_num, 1, 2)) "���̰� ���� ���� ���"
FROM employee
GROUP BY CASE WHEN SUBSTR(jumin_num, 7, 1) IN('1', '2') THEN '19' ELSE '20' END||SUBSTR(jumin_num, 1, 1)||'0���'
        , SUBSTR(jumin_num, 3, 2)
ORDER BY ������, �����
;

--
--3. �ڵ�����ȣ ���ڸ� ù��° ���ں��� [�������� ��]�� [��� ����]�� ���ϵ� �ο����� 2�� �̻��� ����ϸ�?
--(��, �ڵ��� ��ȣ ���ڸ��� '010-nXXX-XXXX'���·� ����ϰ� ��� ������ �Ҽ����� ������ ��Ÿ����)
SELECT SUBSTR(phone, 1, 3)||'-'||SUBSTR(phone, 4, 1)||'XXX-XXXX'  �ڵ�����ȣ
        , COUNT(*)             "�������� ��"
        , FLOOR(AVG(salary))   "��� ����"
FROM employee
GROUP BY SUBSTR(phone, 1, 3)||'-'||SUBSTR(phone, 4, 1)||'XXX-XXXX'
HAVING COUNT(*) >= 2
;

--
-- ����
--1. ������, �μ���ȣ, �Ϸ�޿�, �ñ��� ����Ѵ�
--�������� �� ��� 21.5���� �����ϰ� 8�ð� �ٹ��Ѵ�.
--�� �޿��� �Ҽ��� ù��°���� ����ϰ� �ϰ� �ñ��� �Ҽ��� 3��°���� �ݿø��Ͽ� ����Ѵ�.
SELECT emp_name ������, dep_no �μ���ȣ, ROUND((salary/12)/21.5, 1) �Ϸ�޿�, ROUND(((salary/12)/12.5)/8, 3) �ñ�
FROM employee
;

--2.������, �μ���ȣ, �������Ǵ³��� ����Ѵ�.
-- employee ���̺��� �Ի��� �������� 3������ ���� �� ù �����Ͽ� �������� �ȴ�.
-- �������� �Ǵ� ��¥�� YYYY-MM-DD �������� ����Ѵ�.
-- ���� ���� �������� ���ӻ���� �ִ� ������� ���� Y�� ǥ���ϰ� ���� �������� N���� ǥ���Ѵ�.
SELECT emp_name ������, dep_no �μ���ȣ
        , TO_CHAR(NEXT_DAY(ADD_MONTHS(hire_date, 3), 2), 'YYYY-MM-DD') �������Ǵ³�
        , NVL2(mgr_emp_no, 'Y', 'N') ���ӻ������
FROM employee
;

--3. ������, ������ȣ, ���ӻ����ȣ�� ����Ѵ�
--������� ���ӻ���� ��ȣ�� 1������ 5�������� ǥ���� �� A�� ǥ�����ְ� 6��10�������� B, 11~ 15 C, 16~20 D�� ǥ���Ѵ�
--���� ���ӻ���� ���� ������ 0000���� ǥ���Ѵ�
-- A~D ���� ������� ����Ѵ�
SELECT emp_name ������, emp_no ������ȣ
        , CASE
           WHEN mgr_emp_no IN(1, 2, 3, 4, 5) THEN 'A'
           WHEN mgr_emp_no IN(6, 7, 8, 9, 10) THEN 'B'
           WHEN mgr_emp_no IN(11, 12, 13, 14, 15) THEN 'C'
           WHEN mgr_emp_no IN(16, 17, 18, 19, 20) THEN 'D'
           ELSE '0000'
          END  ���ӻ����ȣ
FROM employee
;

-- ����
--Q1. customer ���̺��� ����ȣ, ���̸�, ������, ���������ȣ(null�� �� '����'���� ǥ��)�� �˻�!
--(��! ���̰� ���� ����� ����!)
SELECT cus_no ����ȣ, cus_name ���̸�
        , TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2)) + 1 ������
        , NVL(emp_no||'', '����') ���������ȣ
FROM customer
ORDER BY 3
;
--Q2. �μ���ȣ, ������ȣ, �����̸�, ����, ����, '-'�� ������ �ֹι�ȣ, '-'�� ������ �ڵ�����ȣ �˻�!!
--(������ ���� ����� ����!)
SELECT dep_no �μ���ȣ, emp_no ������ȣ, emp_name �����̸�, jikup ����, salary ����
        , SUBSTR(jumin_num, 1, 6)||'-'||SUBSTR(jumin_num, 7, 7) �ֹι�ȣ
        , SUBSTR(phone, 1, 3)||'-'||SUBSTR(phone, 4, 4)||'-'||SUBSTR(phone, 8, 4) �ڵ�����ȣ
FROM employee
ORDER BY DECODE(jikup, '����', 1, '����', 2, '����', 3, '�븮', 4, 5)
;
--Q3. ������ȣ, �����̸�, �μ��̸�, ����, �Ի�⵵, ����, ����, ���ӻ����ȣ, ���ӻ���̸� �˻�!
--(���̰� ���� ����� ����!)
SELECT e.emp_no ������ȣ, e.emp_name �����̸�
        , (SELECT dep_name FROM dept d WHERE d.dep_no = e.dep_no) �μ��̸�
        , EXTRACT(YEAR FROM SYSDATE)
            - TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2)) + 1  ����
        , salary  ����
        , (SELECT e2.emp_no FROM employee e2 WHERE e.mgr_emp_no = e2.emp_no)  ���ӻ����ȣ
        , (SELECT e2.emp_name FROM employee e2 WHERE e.mgr_emp_no = e2.emp_no) ���ӻ���̸�
FROM employee e
ORDER BY ���� DESC
;

--����
--1. �������� 65�� ��� ���� �Ͽ� �Ʒ� ó�� ����ϸ�?
--[������ȣ], [������], [�ٹ�����], [�����ϱ��� ���� �⵵], [�ҼӺμ���], [���ӻ����],[���ӻ�� ���� �ο���]
--��, ��� ���� �� ������, ���� ���� ���� ������ ������ ������ ���̰� ���� ����� ���;���.
SELECT emp_no ������ȣ, emp_name ������, CEIL((SYSDATE - hire_date)/365) �ٹ�����
        , 65 - (EXTRACT(YEAR FROM SYSDATE)
                - TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2) )
                + 1
                )   "�����ϱ��� ���� �⵵"
        , (SELECT dep_name FROM dept d WHERE d.dep_no = e.dep_no)  �ҼӺμ���
        , (SELECT e2.emp_name FROM employee e2 WHERE e.mgr_emp_no = e2.emp_no) ���ӻ����
        , (SELECT COUNT(*) FROM customer c, employee e2 WHERE e2.emp_no = e.mgr_emp_no AND e2.emp_no = c.emp_no)
        "��� �� �ο���"
FROM employee e
ORDER BY DECODE(jikup, '����', 1, '����', 2, '����', 3, '�븮', 4, 5)
        , (EXTRACT(YEAR FROM SYSDATE)
            - DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2)
            + 1
            )
;

--
--2. �μ��� �������� �Ի��� ����Ͻÿ�
--[�μ��̸�], [�μ���ġ], [�Ի���]
SELECT dep_name �μ��̸�, loc �μ���ġ, SUBSTR(EXTRACT(YEAR FROM e.hire_date), 1, 3)||'0' �Ի���
FROM dept d, employee e
WHERE d.dep_no = e.dep_no
GROUP BY dep_name, loc, SUBSTR(EXTRACT(YEAR FROM e.hire_date), 1, 3)||'0'
;

--
--3. ���޺� �������� ����Ͻÿ�.
--[����], [������], [������]
--��, ���� ������ ���� ������ �Ͻÿ�.
SELECT jikup ����, COUNT(DISTINCT e.emp_no) ������, COUNT(c.emp_no) ������
FROM employee e, customer c
WHERE e.emp_no = c.emp_no(+)
GROUP BY jikup
ORDER BY DECODE(jikup, '����', 1, '����', 2, '����', 3, '�븮', 4, 5) DESC
;