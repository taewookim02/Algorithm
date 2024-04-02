# Write your MySQL query statement below
--  rearrange the Products table 


--   each row has (product_id, store, price)
--   if product is not available in a store,
--   do not include a row with that product_id and store
-- SELECT product_id, 'store1' AS store, store1 AS price 

SELECT product_id, 'store1' AS store, store1 AS price
FROM products
WHERE store1 IS NOT NULL
UNION ALL
SELECT product_id, 'store2' AS store, store2 AS price
FROM products
WHERE store2 IS NOT NULL
UNION ALL
SELECT product_id, 'store3' AS store, store3 AS price
FROM products
WHERE store3 IS NOT NULL
;