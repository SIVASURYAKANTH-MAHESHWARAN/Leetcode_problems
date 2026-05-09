# Write your MySQL query statement below
-- select s.student_id,s.student_name,e.subject_name,count(*) from Students as s left join Examinations as e on s.student_id=e.student_id group by s.student_id,e.subject_name order by s.student_id,e.subject_name;

-- select student_id,subject_name from Examinations group by student_id,subject_name;

select t.student_id,t.student_name,t.subject_name,count(e.subject_name) as attended_exams from (select * from Students cross join Subjects)as t left join Examinations as e on t.student_id=e.student_id and t.subject_name=e.subject_name group by t.student_id,t.subject_name order by t.student_id,t.subject_name;