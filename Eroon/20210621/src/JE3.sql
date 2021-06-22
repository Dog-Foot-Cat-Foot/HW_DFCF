select
	emp_no "직원번호"
	, emp_name "직원명"
	, to_number(to_char(sysdate,'YYYY'))
		- to_number(
			case substr(jumin_num,7,1)
			when '1' then '19'
			when '2' then '19'
			else '20'
			end || substr(jumin_num,1,2))+1 ||'세'
			"현재 나이"
	, to_number(to_char(hire_date,'YYYY'))
		- to_number(
			case substr(jumin_num,7,1)
			when '1' then '19'
			when '2' then '19'
			else '20'
			end || substr(jumin_num,1,2))+1 ||'세'
		"입사일 당시 나이"
from employee;
