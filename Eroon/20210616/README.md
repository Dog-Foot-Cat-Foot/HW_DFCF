[20210617 모든 문제](20210617.md)

### Oracle - select 응용 문제

1. customer 테이블에서 고객번호, 고객명, 생년월일('년.월.일'), 성별('여', '남')을 검색하면?


2. customer 테이블에서 고객번호, 고객명, 전화 번호, 담당고객(있으면 O, 없으면 X)을 출력할 때, 핸드폰 번호를 기준(오름차순)으로 정렬하여 출력하면?

    
3. customer 테이블에서 고객번호, 고객명, 주민번호('970101-2******')를 출력할 때, 나이가 많은 순서대로 정렬하여 출력하면?

-------

- 1번 정답
 ```sql
select
    cus_no     as "고객번호"
    , cus_name  as "고객명"
    , '19'||substr(jumin_num,1,2)
        ||'.'||substr(jumin_num,3,2)
        ||'.'||substr(jumin_num,5,2)
        as "생년월일"
    , case substr(jumin_num, 7,1) 
        when '2' then '여'
        when '4' then '여'
        else '남'
        end
    as "성별"
from
    customer;
```

- 2번 정답
```sql
select
    cus_no      as "고객번호"
    , cus_name  as "고객명"
    , tel_num   as "전화번호"
    , nvl2(emp_no, 'O', 'X')
from
    customer
order by
    tel_num
    asc;
```

- 3번 정답
```sql
select
    cus_no
    , cus_name
    , substr(jumin_num, 1,6)
    ||'-'||substr(jumin_num,7,1)||'******'
from
    customer
order by
    to_number(
    case
        substr(jumin_num, 7, 1)
        when '1' then '19'
        when '2' then '19'
        else '20'
        end || substr(jumin_num,1,2)
    )
    asc;
```
