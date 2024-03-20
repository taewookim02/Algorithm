# Write your MySQL query statement below
-- calculate the total time in minutes spent 
-- by each employee 
-- on each day at the office.
-- within one day, an employee can enter and leave more than once.
-- time spent in the office for a single entry is out_time - in_time


SELECT 
    event_day "day"
    , emp_id
    , SUM(out_time - in_time) total_time
FROM Employees
GROUP BY event_day, emp_id
ORDER BY emp_id asc;
