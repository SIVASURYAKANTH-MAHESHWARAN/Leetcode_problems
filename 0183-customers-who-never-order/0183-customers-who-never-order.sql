# Write your MySQL query statement below
-- select
-- case when customers.id not in (select customerId from Orders) then name end
-- from customers;
select c.name as Customers from customers as c where c.id not in (select customerId from Orders);