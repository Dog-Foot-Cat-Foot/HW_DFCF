-- ����
-- 1. ������ �ִ� ���� �� ������޺��� �������, �ο���, �޿���, ��տ����� ������ּ���.
-- ��տ����� �Ҽ� ù° �ڸ����� �������ּ���.
-- ��������� ���������� �����ּ���.
-- �޿��հ� ��տ����� (xxx,xxx����) �������� �����ּ���.
SELECT
        s.sal_grade_no                                      �������
        , COUNT(DISTINCT e.emp_no)||'��'                    �ο���
        , TO_CHAR(SUM(salary), '999,999')||'����'           �޿���
        , TO_CHAR(TRUNC(AVG(salary), 0), '999,999')||'����' ��տ���
FROM employee e, salary_grade s, customer c
WHERE e.salary BETWEEN s.min_salary AND s.max_salary  AND c.emp_no = e.emp_no
GROUP BY
        s.sal_grade_no
ORDER BY
        1 DESC;

-- 2. 10�� �μ� ������ �������� �� ���� �Ի��� ������ ������ �ּ���.
-- �Ի��� ����, ������ȣ, �����̸�, �Ի���, ����� ������ȣ, ����̸��� ���� �ּ���.
-- �Ի����� (��-��-�� ����)�� �����ּ���.
-- ���� �ֱٿ� �Ի��� ���� ������ �����ּ���.
-- ���������� Ǯ���ּ���.
SELECT
        (SELECT COUNT(*)+1 FROM employee e2, employee e3 WHERE e1.hire_date > e2.hire_date
                AND e2.mgr_emp_no = e3.emp_no AND e3.dep_no = 10) �Ի����
        , e1.emp_no            ������ȣ
        , e1.emp_name          ������
        , TO_CHAR(hire_date, 'YYYY-MM-DD DAY', 'NLS_DATE_LANGUAGE = KOREAN')   �Ի���
        , (SELECT e2.emp_no FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no) ����ȣ
        , (SELECT e2.emp_name FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no) ����̸�
FROM employee e1
WHERE (SELECT e2.emp_no FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no AND e2.dep_no = 10) = e1.mgr_emp_no
ORDER BY �Ի���� DESC;


-- 3. ���ӻ������ ������ ���� ���������� ���� ��� �󸶳� �� �޴��� �ñ��ؿ�.
-- ����������, ����, ����, ���ӻ����, ���ӻ������, �������̸� �����ּ���.
-- ���������� Ǯ���ּ���
SELECT
       e1.emp_name   ����������
       , e1.jikup    ����
       , e1.salary   ����
       , (SELECT e2.emp_name FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no)   ���ӻ����
       , (SELECT e2.salary FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no)     ���ӻ������
       , (SELECT e1.salary - e2.salary FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no)  ��������
FROM
        employee e1
WHERE
        (SELECT e2.salary FROM employee e2 WHERE e2.emp_no = e1.mgr_emp_no) < e1.salary
