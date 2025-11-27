# Write your MySQL query statement below
-- select max(e1.Salary) as SecondHighestSalary
-- from Employee e1
-- INNER JOIN Employee e2
-- ON e1.salary<e2.salary
SELECT max(Salary) as SecondHighestSalary
FROM Employee
WHERE salary < (SELECT max(Salary)
               FROM Employee
 );
