# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.Salary
from Employee as e
inner join
Department as d
on e.departmentid=d.id
where e.salary=(select max(salary) from Employee
where departmentId=e.departmentId )