Feature: Holiday allowance
 Employees have a yearly holiday allowance of days and they can buy more or exchange unused days for cash

 Scenario: The company pays employees a bonus each month when they have not used all their holiday allowance. 
  Given the following employees
   |employee name|free days left|
   | John | 2 |
   | Gina | 0 |
  Then the following holiday bonuses should be paid at the end of the month
   |employee name| 
   |John|
   