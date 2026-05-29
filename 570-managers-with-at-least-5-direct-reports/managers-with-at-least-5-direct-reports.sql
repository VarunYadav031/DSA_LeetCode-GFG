# Write your MySQL query statement below
select emp.name
from Employee as e
join Employee as emp
on e.managerId =emp.id
group by emp.id,emp.name
having count(e.id)>=5
