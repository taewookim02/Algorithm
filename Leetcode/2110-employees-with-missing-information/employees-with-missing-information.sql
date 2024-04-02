# Write your MySQL query statement below


-- report the IDs of
-- all the employees with missing information

-- employee's name is missing
-- OR employee's salary is missing

-- employee_id in ascending order

-- SELECT * 
-- FROM (

-- ) T;
-- Employees missing from the Salaries table
SELECT e.employee_id
FROM Employees e
LEFT JOIN Salaries s ON e.employee_id = s.employee_id
WHERE s.employee_id IS NULL

UNION

-- Salaries recorded for non-listed employees
SELECT s.employee_id
FROM Salaries s
LEFT JOIN Employees e ON s.employee_id = e.employee_id
WHERE e.employee_id IS NULL

ORDER BY employee_id;
