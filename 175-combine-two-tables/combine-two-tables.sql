# Write your MySQL query statement below
SELECT firstName,lastName,city,state
FROM Person as p
Left Join Address as a
ON p.PersonId=a.PersonId
