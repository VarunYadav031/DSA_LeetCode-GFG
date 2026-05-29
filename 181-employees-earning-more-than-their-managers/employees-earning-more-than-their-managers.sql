# Write your MySQL query statement below
select e.name as Employee
from Employee as e
join Employee as emp
on e.managerId=emp.id
where e.salary>emp.salary