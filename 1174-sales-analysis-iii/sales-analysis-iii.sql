# Write your MySQL query statement below
select p.product_id , product_name from Product as p JOIN Sales as s ON p.product_id = s.product_id GROUP BY s.product_id HAVING MIN(sale_date) >= '2019-01-01' 
   AND MAX(sale_date) <= '2019-03-31';