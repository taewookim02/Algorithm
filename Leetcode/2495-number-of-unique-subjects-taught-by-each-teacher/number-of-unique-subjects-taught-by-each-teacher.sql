# Write your MySQL query statement below
-- calculate the number of unique subjects
-- each teacher teaches
--  result table in any order.
SELECT teacher_id, COUNT(DISTINCT subject_id) AS "cnt"
FROM Teacher
GROUP BY teacher_id;