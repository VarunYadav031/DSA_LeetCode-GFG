
select DATE_FORMAT(trans_date,'%Y-%m') as month,country,
COUNT(*) as trans_count,
SUM(CASE when state='approved' then 1 else 0 end) as approved_count ,
Sum(amount) as trans_total_amount,
Sum(case when state='approved' then amount else 0 end) as approved_total_amount
from Transactions
group by DATE_FORMAT(trans_date,'%Y-%M'),country