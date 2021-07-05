[20210621 모든 문제](20210621.md)

### Oracle - select 응용 문제

1. customer 테이블에서 50대인 사람들의 고객번호, 고객명, 나이를 검색하고 나이순으로 정렬하기


2. customer 테이블에서 이름의 마지막에 '이'가 들어가는 사람들 중 70년대 생들만 검색하여 나이가 어린 순으로 정렬하기

    
3. customer 테이블에서 핸드폰 뒤 네자리가 1로 시작하는 사람들 중 '이'씨 성을 가진 사람들만 검색하기

---
- 1번 정답
    ```sql
    select
	cus_no as "고객 번호"
	, cus_name as "고객 명"
	, to_number(to_char(sysdate, 'YYYY'))
			- to_number(
				case substr(jumin_num,7,1)
					when '1' then '19'
					when '2' then '19'
					else '20'
					end
					||substr(jumin_num,1,2))
			+ 1
			||'세'
			as "나이"
    from customer
    where 
        to_number(to_char(sysdate, 'YYYY'))
                - to_number(
                    case substr(jumin_num,7,1)
                        when '1' then '19'
                        when '2' then '19'
                        else '20'
                        end
                        ||substr(jumin_num,1,2))
                + 1 between 50 and 59
    order by
	    "나이" asc;
    ```
    
- 2번 정답
    ```sql
    select
    *
    from 
        customer
    where
        substr(jumin_num,1,1) = '7'
        and 
        cus_name like '%이'
    order by
        to_number(
        case 
            substr(jumin_num,7,1)
        when '1' then '19'
        when '2' then '19'
        else '20'
        end || substr(jumin_num,1,2))
        desc;
    ```
- 3번 정답
    ```sql
    select
    *
    from
        customer                 
    where
        tel_num like'___1%'
        and
        cus_name like '이%';
    ```
