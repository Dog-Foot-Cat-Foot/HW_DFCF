
7/1  목

 1. 다음은, 강아지 동호회 게시판의
 공지사항과 필독사항에 관한 게시글이다.
 
 
 ![화면 캡처 2021-06-30 180353](https://user-images.githubusercontent.com/84062322/123937620-4f7e4680-d9d1-11eb-879c-80469d8f7e8a.png)
 
      다음 게시판 구조 중 
  "글제목", "글쓴이", "등록일", "조회수"를 출력하면?
 <조건> 단, 공지사항과 필독사항은 
  게시 순서대로 '정순번호'로 정렬하고,
    공지사항과 필독사항에는 답글을 달 수 있다.
     들여쓰기는 3칸, 기호는 'ㄴ'을 사용한다.





답 :

 select
	  rownum "번호"
		,  b.*
 from
(
	   select
		lpad('  ', print_level*5, '  ') || decode(print_no,0,'','ㄴ')||subject  "글제목"
		, writer					"글쓴이"
		, to_char(reg_date,'YYYY-MM-DD')		"등록일"
		, readcount				"조회수"
	   from board
	   order by
		group_no asc, print_no desc
	)  b ,  (select count(*) CNT from board) x ;

