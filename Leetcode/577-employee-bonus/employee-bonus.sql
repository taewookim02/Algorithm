# Write your MySQL query statement below

-- report the name and bonus amount
-- of each employee
-- with bonus less than 1000

SELECT e.name, b.bonus
FROM Employee e
LEFT JOIN Bonus b ON e.empId = b.empId
GROUP BY e.empId
HAVING b.bonus < 1000 OR b.bonus IS NULL
ORDER BY e.empId
;

