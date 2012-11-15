package twisttest;

import payroll.SalaryCalculator;

public class EmployeeBonuses {

	private String level;

	private int salary;

	public void setLevel(String level) throws Exception {
		this.level = level;
	}

	public void setSalary(int salary) throws Exception {
		this.salary = salary;
	}

	public void setUp() throws Exception {
		//Put the code to be executed before execution of each row
	}

	public void tearDown() throws Exception {
		//Put the code to be executed after execution of each row
	}

	public int bonus() throws Exception {
		return new SalaryCalculator().bonusFor(level,salary);
	}

}
