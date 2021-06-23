select * from employee e
where
  jikup = (select jikup from employee where emp_name = '이순라')
  and (select d.dep_name from dept d where e.dep_no = d.dep_no) ='전산부'
order by
  hire_date;
