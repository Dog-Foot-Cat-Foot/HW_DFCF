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
