# Write your MySQL query statement below
select e2.unique_id,e1.name from EmployeeUNI as e2 right join Employees as e1 on e1.id=e2.id;