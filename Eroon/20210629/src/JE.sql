-- 1번 문제
-- rollup 함수
-- 그룹핑 결과에 그룹지은 컬럼의 합계 정보를 추가 조회
select
	dep_no "부서번호"
	, jikup "직급"
	, count(*) "직원수"
	, max(salary) "최대연봉"
	, min(salary) "최소연봉"
	, sum(salary) "연봉합"
	, round(avg(salary),1) "평균연봉"
from employee
group by rollup(dep_no, jikup);

-- 2번 문제
-- cube 함수
--  그룹으로 지정한 모든 컬럼의 집계 정보를 조회
select
	dep_no "부서번호"
	, jikup "직급"
	, count(*) "직원수"
	, max(salary) "최대연봉"
	, min(salary) "최소연봉"
	, sum(salary) "연봉합"
	, round(avg(salary),1) "평균연봉"
from 
	employee
group by
	cube(dep_no, jikup)
order by 
	1;
  
-- 3번 문제
괄호,,,?

-- 4번 문제
X
