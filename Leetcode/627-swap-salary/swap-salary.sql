# Write your MySQL query statement below


-- swap all 'f' and 'm' values and vice versa
-- with a single update statement
-- no intermediate temporary tables.



UPDATE salary
SET sex = 
CASE
    WHEN sex = 'm' THEN 'f'
    WHEN sex = 'f' THEN 'm'
END
;