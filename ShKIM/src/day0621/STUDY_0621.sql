-- ����
-- 1. customer ���̺��� 50���� ������� ����ȣ, ����, ���̸� �˻��ϰ� ���̼����� �����ϱ�
SELECT cus_no
        , cus_name
        , TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY'))
            - TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2))
            + 1  ����
FROM customer
WHERE FLOOR((TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY'))
            - TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2))
            + 1)* 0.1) = 5
ORDER BY 3;

-- 2. customer ���̺��� �̸��� �������� '��'�� ���� ����� ��
-- 70��� ���鸸 �˻��Ͽ� ���̰� � ������ �����ϱ�
SELECT *
FROM customer
WHERE cus_name LIKE '%��' AND SUBSTR(jumin_num, 1, 1) = '7'
ORDER BY 4;

-- 3. customer ���̺��� �ڵ��� �� ���ڸ��� 1�� �����ϴ� ����� ��
-- '��'�� ���� ���� ����鸸 �˻��ϱ�
SELECT *
FROM customer
WHERE SUBSTR(tel_num, 5, 1) = '1' AND cus_name LIKE '��%';

-- ����
-- 1. EMPLOYEE ���̺��� �̾��� �Ӿ��� �˻��ϸ�?
SELECT *
FROM employee
WHERE emp_name LIKE '��%' OR emp_name LIKE '��%';

-- 2. ������ȣ, ������, �ҼӺμ���ȣ, �ҼӺμ��� �˻��ϸ�?
SELECT emp_no, emp_name, e.dep_no, dep_name
FROM employee e, dept d
WHERE e.dep_no = d.dep_no;

-- 3. ��� �������� ���� �޴� ������?
SELECT *
FROM employee
WHERE ( SELECT avg(salary)
        FROM employee ) > salary;

-- ����
-- 1. employee ���̺��� 10�� �μ� �������� ��������� �ٹ� ������ ����Ͻÿ�
-- (�Ҽ�ù°�ڸ����� ���������Ͻÿ�)
SELECT ROUND(MONTHS_BETWEEN(SYSDATE, hire_date), 1) �ٹ�����
FROM employee
WHERE dep_no = 10;

-- 2. employee ���̺��� �μ���ȣ�� 10���� �ƴϰ� ,
-- �Ի���¥�� 1987�� 1�� 1�� ������ ����� ������ �˻��Ͻÿ� ( ���� not in �Լ� ��� )
SELECT *
FROM employee
WHERE dep_no NOT IN(10) AND hire_date > TO_DATE('1987-01-01', 'YYYY-MM-DD');

-- 3. �μ��� 30�̰� �޿��� 1500�̻� 3300������ �̸�,�޿�,�μ���,�μ���ȣ�� ����Ͻÿ�.
SELECT emp_name, salary, dep_name, d.dep_no
FROM employee e, dept d
WHERE e.dep_no = d.dep_no
    AND e.dep_no = 30 AND salary BETWEEN 1500 AND 33000;

-- ����
-- 1. employee ���̺��� ���� �̾��̰� ���̰� 60���� ������ �˻��ϸ�?
SELECT *
FROM employee
WHERE emp_name LIKE '��%'
        AND FLOOR((TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY'))
            - TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(jumin_num, 1, 2))
            + 1)* 0.1) = 6;

-- 2. employee ���̺��� �̸��� �� ���� ������ ������ �˻��ϸ�?
SELECT *
FROM employee
WHERE emp_name LIKE '%��%' AND SUBSTR(jumin_num, 7, 1) IN('2', '4');

-- 3. customer ���̺��� ���̸��� ��ȭ��ȣ ������� �� �˻��ϸ�? ��, ���̸� ��������
SELECT c.cus_name, e.phone
FROM customer c, employee e
WHERE c.emp_no = e.emp_no
ORDER BY 1 DESC;