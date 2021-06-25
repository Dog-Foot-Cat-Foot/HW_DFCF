## Q1. customer 테이블에서 고객번호, 고객이름, 고객나이, 담당직원번호(null일 때 '없음'으로 표시)를 검색!(단! 나이가 많은 사람이 먼저!)


## Q2. 부서번호, 직원번호, 직원이름, 직급, 연봉, '-'를 포함은 주민번호, '-'를 포함한 핸드폰번호 검색!!(직급이 높은 사람이 먼저!)


## Q3. 직원번호, 직원이름, 부서이름, 직급, 입사년도, 나이, 연봉, 직속상관번호, 직속상관이름 검색!(나이가 높은 사람이 먼저!)

















### Q1
select
    cus_no                                                                         "고객번호"
    ,cus_name                                                                      "고객이름"
    ,to_number(to_char(sysdate, 'YYYY'))
        - to_number( case substr(jumin_num,7,1) when '1' then '19'
	                                             when '2' then '19'
                                                 else '20'
                                                 end || substr(jumin_num,1,2)) + 1
                                                || '세'                             "나이"
    ,nvl(emp_no||'','없음')                                                         "담당직원번호"
from customer
order by  to_number(to_char(sysdate, 'YYYY'))
        - to_number( case substr(jumin_num,7,1) when '1' then '19'
	                                             when '2' then '19'
                                                 else '20'
                                                 end || substr(jumin_num,1,2)) + 1
                                                || '세' desc;

### Q2
select
    dep_no               "부서번호"
    ,emp_no              "직원번호"
    ,emp_name            "직원이름"
    ,jikup               "직급"
    ,substr(jumin_num,1,6)||'-'||substr(jumin_num,7,7) "주민번호"
    ,substr(phone,1,3)||'-'||substr(phone,4,4)||'-'||substr(phone,8,4) "핸드폰번호"
from employee
order by  decode(jikup, '사장' , 1, '부장' , 2, '과장' , 3, '대리', 4,  5 ) asc;

### Q3
select
    e1.emp_no                                                    "직원번호"
    ,e1.emp_name                                                 "직원이름"
    ,(select d.dep_name from dept d where d.dep_no = e1.dep_no)  "부서이름"
    ,e1.jikup                                                    "직급"
    ,to_char(e1.hire_date,'YYYY')||'년'                          "입사년도"
    ,to_number(to_char(sysdate, 'YYYY'))
        - to_number( case substr(e1.jumin_num,7,1) when '1' then '19'
	                                              when '2' then '19'
                                                  else '20'
                                                  end || substr(e1.jumin_num,1,2)) + 1
                                                  || '세'         "나이"
    ,e1.salary                                                     "연봉"
    ,nvl(e1.mgr_emp_no||'','없음')                                 "직속상관번호"
    ,(select e2.emp_name from employee e2 
                        where e1.emp_no = e2.emp_no )             "직속상관이름"
from employee e1
order by to_number(to_char(sysdate, 'YYYY'))
        - to_number( case substr(e1.jumin_num,7,1) when '1' then '19'
	                                              when '2' then '19'
                                                  else '20'
                                                  end || substr(e1.jumin_num,1,2)) + 1
                                                  || '세' desc;
-------------------------------------------------------------------------------------------
select
    e1.emp_no                                                    "직원번호"
    ,e1.emp_name                                                 "직원이름"
    ,d.dep_name                                                  "부서이름"
    ,e1.jikup                                                    "직급"
    ,to_char(e1.hire_date,'YYYY')||'년'                          "입사년도"
    ,to_number(to_char(sysdate, 'YYYY'))
        - to_number( case substr(e1.jumin_num,7,1) when '1' then '19'
	                                              when '2' then '19'
                                                  else '20'
                                                  end || substr(e1.jumin_num,1,2)) + 1
                                                  || '세'         "나이"
    ,e1.salary                                                     "연봉"
    ,nvl(e1.mgr_emp_no||'','없음')                                 "직속상관번호"
    ,e2.emp_name                                                   "직속상관이름"
from employee e1,employee e2, dept d
where d.dep_no = e1.dep_no
    and  e1.emp_no = e2.emp_no
order by to_number(to_char(sysdate, 'YYYY'))
        - to_number( case substr(e1.jumin_num,7,1) when '1' then '19'
	                                              when '2' then '19'
                                                  else '20'
                                                  end || substr(e1.jumin_num,1,2)) + 1
                                                  || '세' desc;
