# Write your MySQL query statement below
SELECT p.email FROM person p GROUP BY email HAVING COUNT(email)>1;