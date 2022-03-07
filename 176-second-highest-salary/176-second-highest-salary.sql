# Write your MySQL query statement below

SELECT IFNULL ( (SELECT MAX(salary) as salary 
FROM Employee
WHERE salary <>(SELECT MAX(salary) FROM Employee)),null) as SecondHighestSalary;
