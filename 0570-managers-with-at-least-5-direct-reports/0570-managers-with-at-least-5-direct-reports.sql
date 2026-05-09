# Write your MySQL query statement below
select e1.name from(select id,managerId,count(managerId) as cou from Employee group by managerId)as t join Employee as e1 on t.managerId=e1.id where t.cou>=5;

-- select managerId from Employee where managerId != 'null' group by managerId


-- (select managerId,count(managerId) as cou from Employee group by managerId where cou>=5);