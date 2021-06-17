-- ����
-- 1. customer ���̺��� ����ȣ, ����, �������('��.��.��'), ����('��', '��')�� �˻��ϸ�?
SELECT
       cus_no  ����ȣ
       , cus_name   ����
       ,  TO_CHAR(
            TO_DATE(
                DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19' ,'20')
                    ||SUBSTR(jumin_num, 1, 6)
            , 'YYYYMMDD')
           , 'YYYY.MM.DD') �������
       , DECODE(SUBSTR(jumin_num, 7, 1) ,'1', '��', '3', '��', '��' )  ����
FROM customer;


-- 2. customer ���̺��� ����ȣ, ����, ��ȭ ��ȣ, ����(������ O, ������ X)�� ����� ��,
-- �ڵ��� ��ȣ�� ����(��������)���� �����Ͽ� ����ϸ�?
SELECT
        cus_no   ����ȣ
        , cus_name  ����
        , tel_num    "��ȭ ��ȣ"
        , NVL2(emp_no, 'O','X' )  "����"
FROM customer
ORDER BY 3;


-- 3. customer ���̺��� ����ȣ, ����, �ֹι�ȣ('970101-2******')�� ����� ��,
-- ���̰� ���� ������� �����Ͽ� ����ϸ�?
SELECT
        cus_no     ����ȣ
        , cus_name   ����
        , SUBSTR(jumin_num, 1, 6) || '-' || SUBSTR(jumin_num, 7, 1) || '******'  �ֹι�ȣ
FROM customer
ORDER BY DECODE( SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20') || SUBSTR(jumin_num, 1, 6) ;


-- ����
-- 1. employee ���̺��� ���������� ���� ����
SELECT COUNT(DISTINCT mgr_emp_no) "���ӻ�� ������"
FROM employee;


-- 2. customer ���̺��� ���� ���ɴ�
SELECT FLOOR((TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY')) - TO_NUMBER(DECODE( SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20' )
                        || SUBSTR(jumin_num, 1, 2)) +1)*0.1) || '0��' "���ɴ�"
FROM customer;

-- 3. customer ���̺��� ���� ����
SELECT TO_CHAR(TO_DATE(DECODE( SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')
                || SUBSTR( jumin_num, 1, 6), 'YYYYMMDD'), 'YYYY-MM-DD')  ����
FROM customer;


-- ����
-- 1. employee ���̺��� ������ȣ, ������, ����, ����, ���ӻ�� ��ȣ�� ����ϸ�?
-- ��, ���ӻ����ȣ�� ������ '����'���� ǥ��!
SELECT
        emp_no   ������ȣ
        , emp_name   ������
        , jikup      ����
        , salary      ����
        , NVL(mgr_emp_no||'', '����')   ���ӻ����ȣ
FROM employee;


-- 2. employee ���̺��� ������ȣ, ������, ����, ����, �ڵ�����ȣ�� '-' �� ������ ��ü ��ȣ�� ����ϸ�?
SELECT
        emp_no    ������ȣ
        , emp_name   ������
        , jikup      ����
        , salary     ����
        , SUBSTR(phone, 1, 3) || '-' || SUBSTR(phone, 4, 4) || '-' || SUBSTR(phone, 8, 4)  �ڵ�����ȣ
FROM employee;