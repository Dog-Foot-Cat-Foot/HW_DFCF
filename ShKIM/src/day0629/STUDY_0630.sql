-- ����
-- 3. �������̺��� �̸��� �������� �����Ϳ� ���� �μ����� �ٹ��ϴ� ����� �̸���
-- �μ���ȣ�� ����ϴ� SQL ���� �ۼ��Ͻÿ�
SELECT emp_name, dep_no
FROM employee
WHERE dep_no = ANY(SELECT dep_no FROM employee WHERE emp_name = '������') AND emp_name != '������'


-- 4.10�� �μ��� ������ �����鼭 10�� �μ������ ���� �޿��� �޴� �������
-- ���, �̸�, �޿��� ����ϴ� SQL ���� �ۼ��Ͻÿ�
SELECT emp_no, emp_name, salary
FROM employee
WHERE dep_no <> 10 AND salary = ANY(SELECT salary FROM employee WHERE dep_no = 10)

-- ����
-- 1.�μ���ȣ�� ���޺��� ������ ,�ִ� ����, �ּ� ���� , �� ����,��� ������ ����Ѵ�
-- �׷����� ������ ���� �μ���ȣ, �����̴�
-- ��հ��� �Ҽ��� ù��° �ڸ����� ǥ���Ѵ�
-- �μ����� �������� �μ��� �ѵ����� ���� ���Ѵ�.
-- ��� �� ���������� �� �������� ����� ����Ѵ�.
-- ��� ���� �̷������� �����Բ� ����غ���
SELECT dep_no, jikup, COUNT(*), MAX(salary), MIN(salary), SUM(salary), TRUNC(AVG(salary), 1)
FROM employee
GROUP BY ROLLUP(dep_no, jikup)
ORDER BY 1

-- 2. �μ���ȣ�� ���޺��� ������ ,�ִ� ����, �ּ� ���� , �� ����,��� ������ ����Ѵ�
--�׷����� ������ ���� �μ���ȣ, �����̴�
--��հ��� �Ҽ��� ù��° �ڸ����� ǥ���Ѵ�
--�μ����� �������� �μ��� �ѵ����� ���� ���Ѵ�.
--��� �� ���������� ���޺��� �� �����͸� ���ϰ� ����ο��� �����͸� ���Ѵ�.
SELECT dep_no, jikup, COUNT(*), MAX(salary), MIN(salary), SUM(salary), TRUNC(AVG(salary), 1)
FROM employee
GROUP BY  CUBE(dep_no, jikup)
ORDER BY 1


-- ���
-- 3. employee ���̺� �� �� �߰� '����', 35, '�븮', 3000, '2012-02-28', '8911091109310', '01091499215', 2 �����͸� �Է��ϸ�?
INSERT INTO employee((SELECT NVL(MAX(emp_no), 0) + 1 FROM employee), emp_name, dep_no, jikup
                    , salary, hire_date, jumin_num, phone, mgr_emp_no)
    VALUES('����', 35, '�븮', 3000, TO_DATE('2012-02-28', 'YYYY-MM-DD'), '8911091109310', '01091499215', 2)
-- dep_no 35���� ���µ�

SELECT * FROM employee