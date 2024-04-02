# Write your MySQL query statement below

-- find all the authors 
-- that viewed at least one of their own articles.

-- id in ascending order

SELECT DISTINCT (author_id) id
FROM Views
WHERE author_id = viewer_id
ORDER BY author_id
;





