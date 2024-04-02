# Write your MySQL query statement below

-- for each date, 
-- find the number of different products sold
-- and names


-- products names sorted lexicographically.
-- ordered by sell_date


SELECT 
    sell_date
    , count(DISTINCT product) num_sold 
    , GROUP_CONCAT(DISTINCT product ORDER BY product) products
FROM Activities
GROUP BY sell_date
ORDER BY sell_date
;

