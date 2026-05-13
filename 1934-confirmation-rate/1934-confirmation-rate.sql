# Write your MySQL query statement below

select s.user_id,round(avg(case when c.action='confirmed' then 1 else 0 end),2) as confirmation_rate from Signups as s left join Confirmations as c on s.user_id=c.user_id group by s.user_id; 

-- select t.user_id,round((case when (counts2/counts1) is null then 0 else (counts2/counts1)end),2) as confirmation_rate from (select s.user_id,count(c.user_id) as counts1 from Signups as s left join Confirmations as c on s.user_id=c.user_id group by s.user_id) as t join (SELECT s.user_id, COUNT(c.action) as counts2 FROM Signups as s LEFT JOIN Confirmations as c ON s.user_id = c.user_id AND c.action = 'confirmed' GROUP BY s.user_id) as s on t.user_id=s.user_id;

-- (select s.user_id,count(c.user_id) from Signups as s left join Confirmations as c on s.user_id=c.user_id group by s.user_id)


-- (SELECT s.user_id, COUNT(c.action) as counts2 FROM Signups as s LEFT JOIN Confirmations as c ON s.user_id = c.user_id AND c.action = 'confirmed' GROUP BY s.user_id)




-- select s.user_id,count(c.action) from Signups as s left join Confirmations as c on s.user_id=c.user_id where c.action is null or c.action='confirmed' group by s.user_id; 

-- SELECT 
--     s.user_id,
--     COUNT(CASE WHEN c.action = 'confirmed' THEN 1 END) AS confirmed_count
-- FROM Signups s
-- LEFT JOIN Confirmations c
--     ON s.user_id = c.user_id
-- GROUP BY s.user_id;



