CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      with cte as
      (select *, Dense_Rank() Over(Order By Salary Desc) as rnk
      from employee)
      
      Select Distinct IFNULL(salary,null)
      From cte
      Where rnk=N

  );
END