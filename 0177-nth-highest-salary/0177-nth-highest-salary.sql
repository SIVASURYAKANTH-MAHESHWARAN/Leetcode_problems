CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
    --   select 
    --   case when count(t.salary)<=N then t.salary
    --   else null
    --   end
    select t.salary 
       from (select *,dense_rank() over (order by salary desc) as no from Employee)as t where t.no=N limit 1
  );
END