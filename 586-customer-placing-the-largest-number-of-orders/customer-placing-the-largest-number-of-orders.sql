# Write your MySQL query statement below
With CTE as (select customer_number,COUNt(*) as cnt 
from Orders
group by customer_number

)
select customer_number
from CTE
where cnt=(
    select MAX(cnt)
    from CTE
    
)