package robottest;

import payroll.SalaryCalculator;

public class BonusCalculator {
	private String level;
	private int salary;

	public void setEmployeeLevel(String level){
		this.level=level;
	}
	public void setSalary (int salary){
		this.salary=salary;
	}
	public int bonus(){
		return new SalaryCalculator().bonusFor(level, salary);
	}
}
