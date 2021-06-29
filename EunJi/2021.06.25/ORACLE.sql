-----------은지1
--Q1. customer 테이블에서 고객번호, 고객이름, 고객나이, 담당직원번호(null일 때 '없음'으로 표시)
--   를 검색!(단! 나이가 많은 사람이 먼저!)
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

--------------------------------은지2
--Q2. 부서번호, 직원번호, 직원이름, 직급, 연봉, '-'를 포함은 주민번호
--      , '-'를 포함한 핸드폰번호 검색!!(직급이 높은 순서로 정렬)
select
    dep_no               "부서번호"
    ,emp_no              "직원번호"
    ,emp_name            "직원이름"
    ,jikup               "직급"
    ,substr(jumin_num,1,6)||'-'||substr(jumin_num,7,7) "주민번호"
    ,substr(phone,1,3)||'-'||substr(phone,4,4)||'-'||substr(phone,8,4) "핸드폰번호"
from employee
order by  decode(jikup, '사장' , 1, '부장' , 2, '과장' , 3, '대리', 4,  5 ) asc;


---------------------------------은지3
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

----------------------이현1
select
    s.sal_grade_no||' 등급'                                                                   "연봉등급"
    ,e.jikup                                                                                  "직급"
    ,count(*)||' 명'                                                                          "직원수"
    ,round(avg(e.salary),1)||' 만원'                                                          "평균연봉"
    ,round(avg(to_number(to_char(sysdate, 'YYYY'))
        - to_number( case substr(e.jumin_num,7,1) when '1' then '19'
	                                              when '2' then '19'
                                                  else '20'
                                                  end || substr(e.jumin_num,1,2)) + 1),1)||' 세' "평균나이"
from employee e, salary_grade s
where e.salary between s.min_salary and s.max_salary
group by s.sal_grade_no
        , jikup
order by s.sal_grade_no asc;


-----------------------이현2
select
   -- case substr(jumin_num,7,1) when '1' then'19'
                               -- when '2' then '19'
                              --  else '20' end ||substr(jumin_num,1,1)||'0 년대'                  "출생년대"
    substr(jumin_num,3,2)||'월'                                                                 "출생월"
    ,count(*)||'명'                                                                              "직원수"
    ,round(avg(to_number(to_char(sysdate, 'YYYY'))
        - to_number( case substr(jumin_num,7,1) when '1' then '19'
	                                              when '2' then '19'
                                                  else '20'
                                                  end || substr(jumin_num,1,2)) + 1),1)||' 세' "평균나이"
    ,max(round(avg(to_number(to_char(sysdate, 'YYYY'))
        - to_number( case substr(jumin_num,7,1) when '1' then '19'
	                                              when '2' then '19'
                                                  else '20'
                                                  end || substr(jumin_num,1,2)) + 1),1))||' 세' "나이가 가장많은 사람"
    ,min(round(avg(to_number(to_char(sysdate, 'YYYY'))
        - to_number( case substr(jumin_num,7,1) when '1' then '19'
	                                              when '2' then '19'
                                                  else '20'
                                                  end || substr(jumin_num,1,2)) + 1),1))||' 세' "나이가 가장 적은 사람"
from employee
group by  --case substr(jumin_num,7,1) when '1' then'19'
                             --   when '2' then '19'
                             --   else '20' end ||substr(jumin_num,1,1)||'0 년대'
        ,substr(jumin_num,3,2)||'월'
order by --"출생년대"
        "출생월";


-----------------------------이현3
select
    '010-'||substr(phone,4,1)||'XXX-XXXX' "핸드폰번호"
    ,count(*)                             "직원수"
    ,floor(avg(salary))                   "평균연봉"
from employee
group by '010-'||substr(phone,4,1)||'XXX-XXXX'
having  count(*) >= 2
order by '010-'||substr(phone,4,1)||'XXX-XXXX' asc;






----------------------지언1
select
    emp_name                               "직원명"
    ,dep_no                                "부서번호"
    ,round(salary/12/21.5,1)||'만원'       "하루급여"
    ,round(salary/12/21.5/8,3)||'만원'     "시급"
from employee
order by round(salary/12/21.5/8,3)||'만원' asc;

-----------------------지언2
select
    emp_name                                                             "직원명"
    ,dep_no                                                              "부서번호"
    ,to_char(next_day(add_months(hire_date,3),'monday'),'YYYY-MM-DD')    "정식원된날"
    ,nvl2(mgr_emp_no,'Y','N')                                            "직속상관여부"
from employee;

------------------------지언3
select
    emp_name                                                    "직원이름"
    ,emp_no                                                     "직원번호"
    ,case when (mgr_emp_no between 1 and 5) then 'A'
         when (mgr_emp_no between 6 and 10) then 'B'
          when (mgr_emp_no between 11 and 15) then 'C'
           when (mgr_emp_no between 16 and 20) then 'D'
           else '0000' end                                       "직속상관번호"
from employee
order by case when (mgr_emp_no between 1 and 5) then 'A'
         when (mgr_emp_no between 6 and 10) then 'B'
          when (mgr_emp_no between 11 and 15) then 'C'
           when (mgr_emp_no between 16 and 20) then 'D'
           else '0000' end;



------------------------------------명진1
select
    e1.emp_no                                                "직원번호"
    ,e1.emp_name                                             "직원명"
    ,ceil((sysdate-e1.hire_date)/365)                        "근무년차"
    ,65-(to_number(to_char(sysdate, 'YYYY'))
        - to_number( case substr(e1.jumin_num,7,1) when '1' then '19'
	                                              when '2' then '19'
                                                  else '20'
                                                  end || substr(e1.jumin_num,1,2)) + 1)
                                                  || '세'   "퇴직까지남은년도"
    ,(select d.dep_name from dept d
                        where d.dep_no = e1.dep_no)         "소속부서명"
    ,(select e2.emp_name from employee e2
                         where e1.mgr_emp_no = e2.emp_no)   "직속상관명"
    ,(select nvl(count(*)||'','없음') from employee e2, customer c
                      where e2.emp_no=c.emp_no
                        and e2.mgr_emp_no = e1.emp_no)  "직속상관고객인원수"
from employee e1
order by decode(jikup, '사장' , 1, '부장' , 2, '과장' , 3, '대리', 4,  5 ) asc
        ,to_number(to_char(sysdate, 'YYYY'))
        - to_number( case substr(e1.jumin_num,7,1) when '1' then '19'
	                                              when '2' then '19'
                                                  else '20'
                                                  end || substr(e1.jumin_num,1,2)) + 1
                                                  || '세';

--------------------------명진2
select
    d.dep_name                                                              "부서이름"
    ,d.loc                                                                  "부서위치"
    ,substr(to_char(e.hire_date,'YYYY'),1,3)||'0년대'                       "입사년대"
from dept d, employee e
where d.dep_no = e.dep_no
group by d.dep_name, d.loc, substr(to_char(e.hire_date,'YYYY'),1,3)||'0년대'
order by d.dep_name;

------------------------명진3
select
    e.jikup                                              "직급"
    ,count(*)                                            "직원수"
    ,(select count(*) from customer c, employee e2
                        where c.emp_no = e2.emp_no
                            and e2.jikup=e.jikup)        "담당고객수"
from employee e
group by e.jikup
order by decode(e.jikup, '사장' , 1, '부장' , 2, '과장' , 3, '대리', 4,  5 ) desc;





---------------------------------소희1
select
    s.sal_grade_no||' 등급'                             "연봉등급"
    ,count(distinct e.emp_no)||' 명'                                    "인원수"
    ,to_char(sum(e.salary),'999,999,999')||' 만원'      "급여합"
    ,to_char(avg(e.salary),'999,999,999')||' 만원'      "평균연봉"
from employee e, salary_grade s, customer c
where (e.salary between min_salary and max_salary)
    and c.emp_no=e.emp_no
group by s.sal_grade_no
order by s.sal_grade_no asc;


------------------------------소희2 gg
select
    (select count(*)+1 from employee e2, employee e3
                        where e1.hire_date<e2.hire_date
                            and e2.mgr_emp_no = e3.emp_no)    "입사순위"
    ,e1.emp_no                                                              "직원번호"
    ,e1.emp_name                                                            "직원이름"
    ,to_char(e1.hire_date,'YYYY "년" MM "월" DD "일" DAY','NLS_DATE_LANGUAGE = Korean')  "입사일"
    ,e1.mgr_emp_no                                                          "상사번호"
    ,(select e2.emp_name from employee e2 where e2.emp_no = e1.mgr_emp_no)  "상사이름"
from employee e1
where e1.dep_no = 10
order by (select count(*)+1 from employee e2 where e1.hire_date<e2.hire_date) asc
    , to_char(e1.hire_date,'YYYY "년" MM "월" DD "일" DAY','NLS_DATE_LANGUAGE = Korean') asc;

-----------------------------------------소희3
select
    e1.emp_name                                                     "직원명"
    ,e1.jikup                                                       "직급"
    ,e1.salary                                                      "연봉"
    ,(select e2.emp_name from employee e2
                            where e1.mgr_emp_no = e2.emp_no)            "직속상관명"
    ,(select e2.salary from employee e2
                        where e1.mgr_emp_no = e2.emp_no)                "직속상관연봉"
    ,(select e1.salary-e2.salary from employee e2
                                    where e1.mgr_emp_no = e2.emp_no)    "연봉차이"
from employee e1
where (select e2.salary from employee e2
                                    where e1.mgr_emp_no = e2.emp_no)<e1.salary;
