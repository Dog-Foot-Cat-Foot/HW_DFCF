7/1  목


 1. 다음은, 강아지 동호회 게시판의
 공지사항과 필독사항에 관한 게시글이다. (공지사항과 필독사항은 정순으로 번호정렬됨)
  
      다음 게시판 구조 중 
  "글제목", "글쓴이", "등록일", "조회수"를 출력하면?
  
  
  
![화면 캡처 2021-06-30 202903](https://user-images.githubusercontent.com/84062322/123953204-ed7a0d00-d9e1-11eb-9d9e-953a2c2b9e49.png)


  
  
  
  
  
  
 <조건> 단, 공지사항과 필독사항은 
  게시 순서대로 '정순번호'로 정렬하고,
    공지사항과 필독사항에는 답글을 달 수 있다.
     들여쓰기는 3칸, 기호는 'ㄴ'을 사용한다.







답>



 
 
 	select
		 rownum		 "번호"
		,  b.*
 	from
	
	(
	   select
		lpad('  ', print_level*5, '  ') || decode(print_no,0,'','ㄴ')||subject  "글제목"
		, writer								"글쓴이"
		, to_char(reg_date,'YYYY-MM-DD')					"등록일"
		, readcount								"조회수"
		
	   from board
	   order by
		group_no asc, print_no desc
	)  b ,  (select count(*) CNT from board) x







2. 다음 HTML문과 필기를 참고하여 태그명, 속성명, 속성값을 분류해보기


![화면 캡처 2021-07-01 175249](https://user-images.githubusercontent.com/84062322/124096815-e6acd200-da95-11eb-90b2-aa3bf2c2b5c4.png)



![화면 캡처 2021-07-01 175434](https://user-images.githubusercontent.com/84062322/124096824-e90f2c00-da95-11eb-89c6-87d12fb9da13.png)










3. 1. 아래와 같은 테이블이 있을 때 모든 SQL 이 수행된 이후의 결과는?

[테이블]
TABLE : SQLD_D5
        COL1 VARCHAR2(30)
        COL2 NUMBER 
 
[SQL]
INSERT INTO SQLD_D5(COL1, COL2) VALUES('ABCD',NULL);
INSERT INTO SQLD_D5(COL1, COL2) VALUES('BC',NULL);
ALTER TABLE SQLD_D5 MODIFY COL2 DEFAULT 10;
INSERT INTO SQLD_D5(COL1, COL2) VALUES('XY',NULL);
INSERT INTO SQLD_D5(COL1) VALUES('EXD');
SELECT SUM(COL2) FROM SQLD_D5;

1. 20
2. 0
3. 40
4. 20












정답 1. 20









