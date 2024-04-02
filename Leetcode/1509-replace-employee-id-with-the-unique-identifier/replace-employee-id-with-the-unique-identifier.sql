# Write your MySQL query statement below


-- show the unique ID of each user
-- user does not have a unique ID replace just show null


select u.unique_id, e.name
from employees e
left join employeeUNI u on e.id = u.id
;