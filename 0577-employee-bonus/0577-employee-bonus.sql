# Write your MySQL query statement below
select e.name,b.bonus from Employee as e left join Bonus as b on e.empId=b.empId where b.empId is null or b.bonus<1000;

-- select t.name from (select e.name,b.bonus from Employee as e join Bonus as b on (e.empId=b.empId)) as t where bonus<1000;