# Write your MySQL query statement below


-- report the product_name, year, and price 
-- for each sale_id 
-- in the Sales table


SELECT Product.product_name, Sales.year, Sales.price
FROM Sales
JOIN Product USING (product_id)
;