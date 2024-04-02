# Write your MySQL query statement below


-- report the name and balance of users
-- with a balance higher than 10000
-- balance of an account = sum of the amounts of all transactions 

SELECT u.name NAME, sum(t.amount) BALANCE
FROM users u
JOIN transactions t on u.account = t.account
GROUP BY u.account
HAVING sum(t.amount) > 10000
;