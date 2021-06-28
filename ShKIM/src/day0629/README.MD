## 오라클 문제

### 1. 페이징 처리에 대해 설명해 주세요

<details>
<summary>정답</summary>
<div markdown="1">    
  
  SELECT 결과물에서 n행씩 끊어서 화면에 보여주는 것을 말한다.
  
</div>
</details>

### 2. 아래 쿼리의 실행 결과값은? 쿼리 실행해보는건 반칙~

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
  
  이유는? WHERE절에서 ROWNUM을 1 넣었을 때 FALSE가 나오는 조건이 있다면 조건이 성립되지 않는다.
  
</div>
</details>


### 3. 고객 나이 순으로 정렬하였을 경우 3행부터 8행까지 검색하면? 고객번호, 고객명, 고객나이, 담당직원번호, 담당직원명, 직급, 담당직원부서명, 부서위치를 보여주세요. 고객 나이순으로 보여주세요.


<details>
<summary>정답</summary>
<div markdown="1">    
  
![image](https://user-images.githubusercontent.com/82145134/123625938-3cda0500-d84b-11eb-81a7-635c0cc4fd70.png)
  
  
</div>
</details>



### 4. 직속상관이 있는 직원 중 입사일 순으로 정렬하였을 경우 3행부터 8행까지 검색하면? 직원번호, 직원명, 부서번호, 부서명, 직급, 연봉, 연봉등급, 입사일을 보여주세요. 입사일은 "년-월-일 (요일) x/4분기" 형식으로 보여주세요. 입사일 순으로 보여주세요.


<details>
<summary>정답</summary>
<div markdown="1">    
 
![image](https://user-images.githubusercontent.com/82145134/123628677-54ff5380-d84e-11eb-964f-82dd5258bc35.png)
  
  
</div>
</details>
