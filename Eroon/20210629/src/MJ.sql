명진언니 4번문제 다시 풀기

-- 1번
완료, 취소
입력, 수정, 삭제
rollback commit

-- 2번
from절에

-- 3번
select 
	count(*) "금요일의 개수"
from
	(
		select
			to_date(to_char(sysdate,'YYYY-MM')||'-01', 'YYYY-MM-DD')+RNUM-1 "XDAY"
		from
			(
				select rownum RNUM from employee 
				union select rownum+20 from employee)
				where RNUM<=to_number(to_char(last_day(sysdate), 'dd')
			)
	)d
where
	to_char(d.xday, 'dy', 'nls_date_language=korean')= '금'
	and XDAY <= last_day(sysdate);
  
 -- 4번
