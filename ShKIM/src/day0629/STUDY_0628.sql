-- ����
-- 3. �� ���� ������ �����Ͽ��� ��� 3����� 8����� �˻��ϸ�?
-- ����ȣ, ����, ������, ���������ȣ, ���������, ����, ��������μ���, �μ���ġ�� �����ּ���.
-- �� ���̼����� �����ּ���.

-- ������ �ۼ��� ����
-- �� ���̼� ����
-- 8����� �˻�
-- 3����� �˻�

SELECT zxc.cus_no "����ȣ", zxc.cus_name "����"
       , EXTRACT( YEAR FROM SYSDATE )
            - TO_NUMBER(DECODE(SUBSTR(zxc.jumin_num, 7, 1), '1', '19', '2', '19', '20')||SUBSTR(zxc.jumin_num, 1, 2))
            + 1  "������"
       , zxc.emp_no "���������ȣ", e.emp_name "���������", e.jikup "����"
       , d.dep_name "��������μ���", d.loc "�μ���ġ"
FROM (
  SELECT ROWNUM "RNUM" ,d.* FROM (
      SELECT * FROM customer ORDER BY DECODE(SUBSTR(jumin_num, 7, 1), '1', '19', '2', '19', '20')
                              ||SUBSTR(jumin_num, 1, 6)
      -- �� ���̼� ����
  ) d WHERE ROWNUM <= 8  -- 8�����
) zxc, employee e, dept d
WHERE zxc.emp_no = e.emp_no(+) AND e.dep_no = d.dep_no(+)  -- ��������
        AND zxc.rnum >= 3  -- 3�����
ORDER BY zxc.rnum  -- �� ���̼� ����


-- 4. ���ӻ���� �ִ� ���� �� �Ի��� ������ �����Ͽ��� ��� 3����� 8����� �˻��ϸ�?
-- ������ȣ, ������, �μ���ȣ, �μ���, ����, ����, �������, �Ի����� �����ּ���.
-- �Ի����� "��-��-�� (����) x/4�б�" �������� �����ּ���
-- �Ի��� ������ �����ּ���.

-- ������ �ۼ� ����
-- �Ի��� �� ����
-- 8����� ����
-- 3����� ����

SELECT zxc.emp_no "������ȣ", zxc.emp_name "������", zxc.dep_no "�μ���ȣ"
        , d.dep_name "�μ���", zxc.jikup "����", zxc.salary "����"
        , s.sal_grade_no "�������"
        , TO_CHAR(zxc.hire_date, 'YYYY-MM-DD (DY) Q/"4�б�"', 'NLS_DATE_LANGUAGE = KOREAN') "�Ի���"
FROM (
  SELECT ROWNUM "RNUM", d.* FROM (
      SELECT * FROM employee WHERE mgr_emp_no IS NOT NULL ORDER BY hire_date
      -- �Ի��� �� ����, ���ӻ���� �ִ� ���� ��
  ) d WHERE ROWNUM <= 8  -- 8����� ����
) zxc, dept d, salary_grade s
WHERE zxc.dep_no = d.dep_no AND zxc.salary BETWEEN s.min_salary AND s.max_salary -- ��������
        AND zxc.rnum >= 3  -- 3�����
ORDER BY zxc.rnum  -- �Ի��� �� ����