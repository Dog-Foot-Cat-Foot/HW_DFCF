[20210629 모든 문제](20210629.md)

혹시 저의 4번문제 평균 나이에 '2002' 값이 나오는 이유를 아시는분,,,,,? 

#### 1. 저장되는 값을 쓰세요.

  ① NUMBER(5, 2)라고 지정한 컬럼에 987.667을 저장하면?

  ② NUMBER(5,2)라고 한 컬럼에 9876.5을 저장하면?

  ③ NUMBER(3)라고 지정한 컬럼에 987 저장하면?

  ④ NUMBER(4)라고 지정한 컬럼에 9876.5 저장하면? 

  ⑤ NUMBER(3)라고 지정한 컬럼에 9876 저장하면?
  
   <details>
  <summary>정답</summary>
  <div markdown="1">       

  ① 987.67

  ② 저장 오류(행 자체가 들어갈 수 없음). 정수 자릿수 부족으로 오류

  ③ 987

  ④ 9877

  ⑤ 저장 오류(행 자체가 들어갈 수 없음). 정수 자릿수 부족으로 오류 
   

  </div>
  </details>


#### 2. PK과 FK에 대해 옳은 문장의 번호는?

  ① FK는 not null, unique의 제약 조건 성질을 가진다

  ② 하나의 테이블에 하나의 foreign key만 설정할 수 있음

  ③ FK가 있으면 반드시 PK가 있어야 한다.

  ④ 참조 당하는 PK가 먼저 생성되어야 한다.

  ⑤ FK와 참조하는 PK는 동일한 테이블에 있을 수 없다.
<details>
<summary>정답</summary>
<div markdown="1">       

**④** 

① PK는 not null, unique의 제약 조건 성질을 가짐

② 하나의 테이블에 하나의 primary key만 설정할 수 있음

③ PK가 있다고 FK가 반드시 있어야 하는 것은 아님!

⑤ 참조하는 PK가 동일한 테이블에 있을 수 있음 

</div>
</details>

#### 3. 나이가 어린 순서대로 직원을 검색하되 11행부터 20행까지만 검색하면? (inline view)

  ![image](https://user-images.githubusercontent.com/77269204/123663182-1e870000-d871-11eb-9bed-05fc8f6062a3.png)

  ```sql
  select *
  from
    (
      select rownum RNUM, e.*
      from 
        (select * from employee 
          order by
            case substr(jumin_num, 7,1)
            when '1' then '19'
            when '2' then '19'
            else '20'
            end || substr(jumin_num,1,6) desc
        ) e
      where rownum<=20
    )
  where RNUM>=11;
  ```

#### 4. 직원들의 생일 월별로 인원수, 평균나이, 평균연봉을 검색하면?
  <조건> 생일 월 오름차순 유지
  
  <조건> 위 결과에서 4월, 6월, 8월은 없어서 빠짐. 4월, 6월과 8월도 포함시키고 인원수는 0으로 포함
  
  <조건> 평균 연봉은 소숫점 두번째 자리에서 반올림하기

  ![image](https://user-images.githubusercontent.com/77269204/123663234-2ba3ef00-d871-11eb-8d1c-b539103bacb8.png)



  ```sql
  select
    m.month||'월' "생일월"
    , count(e.emp_no) "입사인원수"
    , nvl(floor(avg(to_number(to_char(sysdate,'YYYY'))
      - to_number(case substr(e.jumin_num,7,1)
        when '1' then '19'
        when '2' then '19'
        else '20' 
        end ||substr(e.jumin_num,1,2)) +1)), 0)
      "평균 나이"
    , nvl(round(avg(e.salary),1), 0) "평균연봉"
  from
    (select '01' "MONTH" from dual union
      select '02' from dual union
      select '03' from dual union
      select '04' from dual union
      select '05' from dual union
      select '06' from dual union
      select '07' from dual union
      select '08' from dual union
      select '09' from dual union
      select '10' from dual union
      select '11' from dual union
      select '12' from dual 
    )m, employee e
  where
    substr(e.jumin_num(+), 3,2) = m.month
  group by
    m.month||'월'
  order by 1;
  ```
