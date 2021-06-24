[20210623 모든 문제](20210623.md)

- 못 푼 문제
소희 3

### Oracle 응용 문제

1. '이순라'와 직급이 동일한 사람들 중 '전산부'인 사람들을 검색하여 입사순으로 정렬하기
    ![image](https://user-images.githubusercontent.com/77269204/122936131-e16fc900-d3ab-11eb-8394-f59ba0405ac2.png)
    

2. 직원번호, 직원명, 나이, 입사일, 입사일 순위를 출력하기 (단, 입사일 순위를 오름차순으로 정렬)
    ![image](https://user-images.githubusercontent.com/77269204/122936342-0a905980-d3ac-11eb-974d-9cf6a5fd5b1f.png)


3. 고객번호, 고객명, 주민번호, 생일 순위를 출력하기 (단, 생일 순위를 내림차순으로 정렬)
    ![image](https://user-images.githubusercontent.com/77269204/122936484-27c52800-d3ac-11eb-9163-afc6c9fce9c0.png)



---
- 1번 정답
  ```sql
  select * from employee e
  where
    jikup = (select jikup from employee where emp_name = '이순라')
    and (select d.dep_name from dept d where e.dep_no = d.dep_no) ='전산부'
  order by
    hire_date;
    ```
    
    
- 2번 정답
  ```sql
  select
	e1.emp_no "직원번호"
	, e1.emp_name "직원명"
	, extract(year from sysdate)
		- extract(year from 
        to_date(
		case substr(e1.jumin_num, 7,1)
		when '1' then '19'
		when '2' then '19'
		else '20'
		end ||substr(e1.jumin_num,1,2),'YYYY'))
	"나이"
    , e1.hire_date "입사일"
    , (select count(*)+1 from employee e2 
        where e2.hire_date<e1.hire_date)
    "입사일 순위"
  from employee e1
  order by
    4 asc;
    ```
  
  
- 3번 정답
  ```sql
  select
	c1.cus_no "고객번호"
	,c1.cus_name "고객명"
	,c1.jumin_num "주민번호"
	,(select count(*)+1 from customer c2
        where 
        to_date(
        case substr(c2.jumin_num,7,1)
        when '1' then '19'
        when '2' then '19'
        else '20'
        end||substr(c2.jumin_num,1,6),'YYYYMMDD')
        < to_date(
        case substr(c1.jumin_num,7,1)
        when '1' then '19'
        when '2' then '19'
        else '20'
        end||substr(c1.jumin_num,1,6),'YYYYMMDD')
        )"생일순위"
  from customer c1
  order by 4 desc;
  ```
