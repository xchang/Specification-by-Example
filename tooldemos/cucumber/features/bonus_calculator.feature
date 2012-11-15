Feature: End of year bonus calculations
 The company provides employees with end-of-year bonuses 
 based on their level and base salary. 

  Scenario: Bonus Calculation For Managers
    Given an employee of level Manager
    And a salary of 75000
    When the end of year bonus is paid
    Then the employee should receive a bonus of 20000
	
  Scenario Outline: Bonus Calculation 
    Given an employee of level <level>
    And a salary of <salary>
    When the end of year bonus is paid
    Then the employee should receive a bonus of <bonus>
 	
 	Examples:

      | level | salary 	| bonus |
      | Manager | 75000 | 20000 |
      | Intern  | 5000 	| 0 	|
      | Lab rat | 10000 | 1000 	| 