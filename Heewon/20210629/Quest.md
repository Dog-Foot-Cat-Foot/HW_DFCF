b_no		-> 게시판 글 고유번호 

subject  		-> 글 제목	              글쓴이가
writer 		-> 글쓴이 이름
content		-> 글내용
pwd		-> 암호
email		-> 이메일

reg_date 		-> 등록일                	db가
readcount	-> 조회수

group_no			
print_no	

print_level

-
-
-
-
문제 1.  게시판의 테이블 구조를 설계함에 있어서
 개발자가 연동해야 할 3가지를 쓰고 각각 설명하라.
(위 참조)
-
-
-
-
-

group_no		-> 게시판 글의 소속  그룹번호.		
print_no		-> 같은 그룹번호 내에서 화면  출력 순서 번호.	

print_level	-> 같은 그룹번호 내에서 댓글  들여쓰기 레벨 단계 번호.

-
-
-
-
-
-


 문제 1-1 OX 문제

 - 게시판 내의 게시글 작성 순서에 따라 부여받은 고유번호는 PK값으로 지정한다.

-
-
-
-
-

   X, 게시글 작성자의 삭제가 가능한 글의 특성상 PK값으로 쓰지 않고 
    고유값인 PK값은 공개되지 않는 경우가 많다.
-
-
-
-
-
-
-






문제2. 뷰를 만드는 SQL 문법 중 많이 쓰이는 것 두가지에 대해 설명하라.

▶WITH READ ONLY

▶WITH CHECK OPTION


-
-
-
-

▶WITH READ ONLY *****
		▷ 뷰에 대해 입력, 수정, 삭제 작업이 불가능하다.
		▷ 생략 시 특정 조건하에 하나의 테이블에서 만들어진 뷰에 대해서는 입력, 수정, 삭제 작업을 할 수 있고
		실존 테이블에 입력, 수정, 삭제가 된다.


WITH CHECK OPTION
		▷ 뷰의  WHERE 구문 조건에 위배되는 방향으로  INSERT, UPDATE 작업은 불가능하다.
		▷ <예> 뷰에 where salary>= 6000 이 있을 경우 salary>=6000 조건에 위배되는 방향으로 입력, 수정이 불가능하다.
			예를 들어 here salary>= 6000  조건에 해당하는 행의 salary를 6000 미만으로 입력, 수정하는 행위는 불가능하다.


-
-
-
-
-
-
-
-
-



문제3. employee  테이블 에 행 추가
'김김김', 35, '대리', 3000, '2012-02-28', '8911091109310', '01091499215', 2 데이터를 입력하면?

 시퀀스를 사용하여 PK값을 입력한 예	-- 시퀀스 사용할 것.( 작업의 맨마지막)



-
-
-
-
-
-
-
-

	insert into employee( 
	    emp_no, emp_name, dep_no, jikup, salary, hire_date, jumin_num, phone, mgr_emp_no 
	)
	values( 
	    emp_sq.nextval, '김김김', 35, '대리', 3000, to_date('2012-02-28','YYYY-MM-DD'), '8911091109310', '01091499215', 2  
	);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
