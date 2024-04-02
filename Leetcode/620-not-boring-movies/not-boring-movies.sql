# Write your MySQL query statement below

-- report the movies
-- with an odd-numbered ID 
-- and a description that is not "boring".

-- ordered by rating in descending order

SELECT *
FROM Cinema
WHERE MOD(id, 2) = 1
AND description NOT LIKE '%boring%'
ORDER BY rating DESC
;



