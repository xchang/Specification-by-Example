package payrollslim;

import payroll.SalaryCalculator;

public class BonusCalculation {
	private String employeeLevel;
	private int salary;
	public void setEmployeeLevel(String employeeLevel) {
		this.employeeLevel = employeeLevel;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int bonus(){
		SalaryCalculator sc=new SalaryCalculator();
		return sc.bonusFor(employeeLevel, salary);		
	}

}
