[20210625 모든 문제](20210625.md)

### Oracle 응용 문제

#### 1. 연봉등급별, 직급별로 [연봉등급], [직급], [직원수], [평균연봉], [평균 나이]를 출력하면? 
  (단, 평균연봉과 평균 나이는 소수점 둘째자리에서 반올림하고 연봉등급 순으로 나열하기)
  

#### 2. 출생년대와 출생월별로 [출생년대], [출생월], [직원수], [평균나이], [나이가 가장 많은 사람], [나이가 가장 적은 사람]을 출력하면?
  (단, 평균 나이는 소수점 첫째자리까지 나타내고 출생년대와 출생월별 순으로 정렬하기)
  
  
#### 3. 핸드폰번호 앞자리 첫번째 숫자별로 [직원들의 수]와 [평균 연봉]을 구하되 인원수가 2명 이상을 출력하면?
  (단, 핸드폰 번호 앞자리는 '010-nXXX-XXXX'형태로 출력하고 평균 연봉은 소수점을 버리고 나타내기)
  
---
- 1번 정답
  ``` sql
  select
    s.sal_grade_no "연봉등급"
    , e.jikup "직급"
    , count(*) "직원수"
    , round(avg(e.salary),1) "평균 연봉"
    , round(avg(
        to_number(to_char(sysdate, 'YYYY'))
        -
        to_number(decode(substr(e.jumin_num,7,1)
        , '1', '19'
        , '2', '19'
        , '20')||substr(e.jumin_num,1,2))+1
    ),1) "평균 나이"
  from 
    salary_grade s, employee e
  group by
     s.sal_grade_no, e.jikup
  order by
    1;
  ```

- 2번 정답
  ``` sql
  select
    case substr(jumin_num,7,1)
    when '1' then '19'
    when '2' then '19'
    else '20'
    end||substr(jumin_num,1,1)||'0년대'
    "출생년대"
    , substr(jumin_num,3,2)||'월'
    "출생월"
    , count(*) "직원수"
    , round(avg(
        to_number(extract(year from sysdate))
        - to_number(case substr(jumin_num,7,1)
            when '1' then '19'
            when '2' then '19'
            else '20'
            end || substr(jumin_num, 1,2))+1),1)
        "평균나이"
    , min(case substr(jumin_num,7,1)
            when '1' then '19'
            when '2' then '19'
            else '20'
            end || substr(jumin_num, 1,2))
        "나이가가장많은사람"
    , max(case substr(jumin_num,7,1)
            when '1' then '19'
            when '2' then '19'
            else '20'
            end || substr(jumin_num, 1,2))
        "나이가가장적은사람"
  from
     employee
  group by
    case substr(jumin_num,7,1)
    when '1' then '19'
    when '2' then '19'
    else '20'
    end||substr(jumin_num,1,1)||'0년대'
    , substr(jumin_num,3,2)||'월'
  order by
    1, 2;
  ```
  
- 3번 정답
  ``` sql
  select
    '010-'||substr(phone,4,1)||'XXX-XXXX' "핸드폰앞자리첫번째수"
    , count(*)||'명' "직원수"
    , floor(avg(salary))||'만원' "평균연봉"
  from
    employee
  group by 
    substr(phone,4,1)
  having
    count(*) >=2;
  ```
