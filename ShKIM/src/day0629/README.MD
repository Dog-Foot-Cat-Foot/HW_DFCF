## 오라클 문제

#### 1. 페이징 처리에 대해 설명해 주세요

<details>
<summary>정답</summary>
<div markdown="1">    
  SELECT 결과물에서 n행씩 끊어서 화면에 보여주는 것을 말한다.
</div>
</details>

#### 2. 아래 쿼리의 실행 결과값은? 쿼리 실행해보는건 반칙~

```sql

SELECT  z.* FROM (
    SELECT ROWNUM RNUM, d.* FROM (
        SELECT * FROM employee ORDER BY salary
    ) d WHERE ROWNUM >= 15
) z WHERE z.rnum <= 3

```

<details>
<summary>정답</summary>
<div markdown="1">    
  검색 결과 없음
  이유는? WHERE절에서 ROWNUM을 1을 넣었을 때 FALSE가 나오는 조건이 있다면 조건이 성립되지 않는다.
</div>
</details>


#### 3.


<details>
<summary>정답</summary>
<div markdown="1">    
  
  
</div>
</details>



#### 4.


<details>
<summary>정답</summary>
<div markdown="1">    
  
  
</div>
</details>
