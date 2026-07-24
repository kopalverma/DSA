# Write your MySQL query statement below
SELECT firstName , lastName , city , state FROM Person
LEFT JOIN address ON person.personId = address.personId;
-- WHERE address.personId IS null;