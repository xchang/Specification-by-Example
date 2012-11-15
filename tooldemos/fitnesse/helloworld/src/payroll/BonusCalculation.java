package payroll;

public class BonusCalculation extends fit.ColumnFixture{
	public String employeeLevel;
	public int salary;
	public int bonus(){
		SalaryCalculator sc=new SalaryCalculator();
		return sc.bonusFor(employeeLevel, salary);
		
	}
}
