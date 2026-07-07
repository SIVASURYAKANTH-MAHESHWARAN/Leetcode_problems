# Write your MySQL query statement below
-- select v.customer_id,count(v.customer_id) as count_no_trans from Visits as v left join Transactions as t on (v.visit_id=t.visit_id) where t.visit_id is null group by v.customer_id;


select (customer_id),count(*) as count_no_trans from Visits as v where v.visit_id not in(select visit_id from transactions) group by v.customer_id;

-- ,count(v.visit_id)
-- group by v.visit_id

