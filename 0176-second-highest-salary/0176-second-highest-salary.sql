# Write your MySQL query statement below
-- select 
-- case salary 
-- when not null then salary
-- else null
-- end
-- as SecondHighestSalary from Employee where salary<(select max(salary) as sc from Employee)order by salary desc limit 1;

select max(salary) as SecondHighestSalary from Employee where salary<(select max(salary) as sc from Employee);
