# Write your MySQL query statement below
WITH t1 as( SELECT d.name AS Department, e.name AS Employee, salary,dense_rank() over(partition by departmentId order by Salary desc) AS rn
FROM Employee as E
JOIN Department AS D
ON e.departmentId=d.id
)

select Department,Employee,salary FROM t1
Where rn<=3