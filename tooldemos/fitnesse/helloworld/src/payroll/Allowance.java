package payroll;

import java.util.ArrayList;
import java.util.List;

import fitlibrary.DoFixture;
import fitlibrary.SetUpFixture;

public class Allowance extends DoFixture {
	List<Employee> employees=new ArrayList<Employee>();
	public SetUpFixture freeDaysLeft(){
		return new EmployeeEntryFixture(employees);
	}
	public List<Employee> holidayBonusesPaidToEmployees(){
		SalaryCalculator sc=new SalaryCalculator();
		return sc.getEmployeesForMonthlyBonus(employees);
	}
}
