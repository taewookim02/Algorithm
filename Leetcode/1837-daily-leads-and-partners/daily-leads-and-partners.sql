# Write your MySQL query statement below
-- For each date_id and make_name
-- find number of distinct lead_id's
-- distinct partner_id's.

SELECT 
    date_id
    , make_name
    , COUNT(DISTINCT lead_id) unique_leads
    , COUNT(DISTINCT partner_id) unique_partners
FROM DailySales
GROUP BY date_id, make_name
ORDER BY date_id;