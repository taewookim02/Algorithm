# Write your MySQL query statement below

-- find the first login date
-- for each player

SELECT player_id, MIN(event_date) first_login
FROM Activity
GROUP BY player_id
;



