# Write your MySQL query statement below
select name as Employee from Employee as e1 left join (select id,salary as s1,managerId  from Employee)as P1 on p1.id=e1.managerId where e1.salary>s1; 
