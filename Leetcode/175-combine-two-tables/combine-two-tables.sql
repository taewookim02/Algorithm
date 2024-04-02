# Write your MySQL query statement below


-- report the first name, last name, city, and state
-- of each person

-- If the address of a personId is not present 
-- report null

SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p
LEFT JOIN Address a on p.personId = a.personId
;


