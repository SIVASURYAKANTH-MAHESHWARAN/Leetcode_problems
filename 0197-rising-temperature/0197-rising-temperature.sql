# Write your MySQL query statement below
select w2.id from Weather as w2 join Weather as w1 on datediff(w1.recordDate,w2.recordDate)=-1 and w2.temperature>w1.temperature;
