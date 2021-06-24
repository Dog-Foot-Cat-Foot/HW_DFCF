-- ����
-- 1
SELECT o.animal_id, o.name
FROM animal_ins i RIGHT OUTER JOIN animal_outs o
ON o.animal_id = i.animal_id WHERE i.animal_id IS NULL
ORDER BY 1;

-- 2
SELECT i.animal_id, i.name
FROM animal_ins i, animal_outs o
WHERE i.animal_id = o.animal_id AND i.datetime > o.datetime
ORDER BY i.datetime;

-- 3
SELECT i.name, i.datetime
FROM animal_ins i LEFT OUTER JOIN animal_outs o
ON i.animal_id = o.animal_id
WHERE o.animal_id IS NULL
ORDER BY i.datetime
FETCH FIRST 3 ROWS ONLY;

-- ����
-- 1. '�̼���'�� ������ ������ ����� �� '�����'�� ������� �˻��Ͽ� �Ի������ �����ϱ�
SELECT *
FROM employee e
WHERE jikup = (SELECT jikup FROM employee WHERE emp_name = '�̼���')
    AND
      dep_no = (SELECT dep_no FROM dept d WHERE dep_name = '�����')
ORDER BY hire_date;

-- 2. ������ȣ, ������, ����, �Ի���, �Ի��� ������ ����ϱ� (��, �Ի��� ������ ������������ ����)
SELECT emp_no  ������ȣ
        , emp_name ������
        , TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY'))
            - TO_NUMBER(DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')
                    ||SUBSTR(jumin_num, 1, 2)) ����
        , TO_CHAR(hire_date, 'YYYY-MM-DD') �Ի���
        , (SELECT COUNT(*) + 1 FROM employee e2 WHERE
             e1.hire_date > e2.hire_date
        )  �Ի��ϼ���
FROM employee e1
ORDER BY 5;

-- 3. ����ȣ, ����, �ֹι�ȣ, ���� ������ ����ϱ� (��, ���� ������ ������������ ����)
SELECT cus_no, cus_name, jumin_num
        , (SELECT COUNT(*)+1 FROM customer c2
            WHERE DECODE(SUBSTR(c1.jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(c1.jumin_num, 1, 6)
                > DECODE(SUBSTR(c2.jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(c2.jumin_num, 1, 6) )  ���ϼ���
FROM customer c1
ORDER BY 4 DESC;

-- ����
-- 1. ����ȣ, ����, ���������ȣ, ��������μ����� ����϶�.
-- ��, ��������� ���ӻ���� �̼����� ��츸 ���
SELECT c.cus_no, c.cus_name, c.emp_no, d.dep_name
FROM customer c, employee e1, dept d, employee e2
WHERE c.emp_no = e1.emp_no AND e1.dep_no = d.dep_no AND e1.mgr_emp_no = e2.emp_no
        AND e2.emp_name = '�̼���'

-- 2. ����ȣ, ����, �����������, ���������, ������� ��������� ����϶�.
-- ��, null �� X�� ǥ��, ������������� ���������ȣ�� �̿��Ͽ� ���� ������ O�� ǥ�� ������ ����ȣ ��������
SELECT c.cus_no, c.cus_name, NVL2(c.emp_no, 'O', 'X'), e.emp_name, s.sal_grade_no
FROM customer c, employee e, salary_grade s
WHERE c.emp_no = e.emp_no(+) AND e.salary BETWEEN s.min_salary(+) AND s.max_salary(+)
ORDER BY cus_no DESC;

-- 3. ���� 3000�̻��� ������ ������������ ������ȣ, ������, ����, ��������� ����϶�.(��������)
-- ORACLE JOIN
SELECT e2.emp_no, e2.emp_name, e2.salary, s.sal_grade_no
FROM employee e1, employee e2, salary_grade s
WHERE e1.emp_no = e2.mgr_emp_no AND e1.salary >= 3000
        AND e2.salary BETWEEN s.min_salary AND s.max_salary
ORDER BY 1 ;

-- SUBQUERY
SELECT
        emp_no       ������ȣ
        , emp_name   ������
        , salary     ����
        , (SELECT s.sal_grade_no FROM salary_grade s WHERE
                    e1.salary BETWEEN s.min_salary AND s.max_salary ) �������
FROM employee e1
WHERE (SELECT e2.salary FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no) >= 3000

-- ����
-- 1. '�Ӳ���'���� �ʰ� �Ի��� ������ �̸�,�Ի����� �˻��Ͻÿ�.
SELECT emp_name, TO_CHAR(hire_date, 'YYYY-MM-DD')
FROM employee
WHERE (SELECT hire_date FROM employee WHERE emp_name = '�Ӳ���') < hire_date;

-- 2. �����ο��� ���ϴ� ������� �̸� , ������ ����϶�.
SELECT emp_name, jikup
FROM employee
WHERE (SELECT dep_no FROM dept WHERE dep_name = '������') = dep_no;

-- 3. ��ü ���� �� '�̼���'�� ���� ��å�� ������� �̸�,����,�μ����� ����Ͻÿ�
SELECT emp_name, salary, (SELECT dep_name FROM dept d WHERE d.dep_no = e.dep_no)
FROM employee e
WHERE (SELECT jikup FROM employee WHERE emp_name = '�̼���') = jikup;

-- ����
-- Q1. �μ���, ������ȣ, �����̸�, ����, �������� �˻�.
SELECT (SELECT dep_name FROM dept d WHERE d.dep_no = e.dep_no)
        , phone
        , emp_name
        , jikup
        , (SELECT COUNT(*) FROM customer c WHERE c.emp_no = e.emp_no)
FROM employee e

-- Q2. ������ 1���� ������ȣ, �����̸�, ����, ������ �˻�.
SELECT emp_no, emp_name, jikup, salary
FROM employee e
WHERE (SELECT COUNT(*) FROM customer c WHERE c.emp_no = e.emp_no) = 1

-- Q3. ���޸�, ����������, ���޴����� �˻�.
-- ORACLE JOIN
SELECT
        jikup                       ���޸�
        , COUNT(DISTINCT e.emp_no)  ����������
        , COUNT(c.emp_no)           ���޴�����
FROM employee e, customer c
WHERE e.emp_no = c.emp_no(+)
GROUP BY jikup
ORDER BY DECODE(jikup, '����', 1, '����', 2, '����', 3, '�븮', 4, 5);

-- ANSI JOIN
SELECT
        jikup                       ���޸�
        , COUNT(DISTINCT e.emp_no)  ����������
        , COUNT(c.emp_no)           ���޴�����
FROM employee e LEFT OUTER JOIN customer c ON e.emp_no = c.emp_no
GROUP BY jikup
ORDER BY DECODE(jikup, '����', 1, '����', 2, '����', 3, '�븮', 4, 5);

-- SUBQUERY
SELECT
        DISTINCT jikup   ���޸�
        , (SELECT COUNT(*) FROM employee e2 WHERE e.jikup = e2.jikup) ����������
        , (SELECT COUNT(*) FROM employee e2, customer c WHERE e2.emp_no = c.emp_no
                                    AND e2.jikup = e.jikup ) ���޴�����
FROM employee e
ORDER BY DECODE(jikup, '����', 1, '����', 2, '����', 3, '�븮', 4, 5);

