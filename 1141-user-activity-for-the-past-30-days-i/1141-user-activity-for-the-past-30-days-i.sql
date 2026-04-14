# Write your MySQL query statement below
select activity_date as day,count(distinct(user_id)) as active_users from(select * from Activity as a where datediff('2019-07-27',a.activity_date) between 0 and 29)as t group by activity_date; 
