package payroll;
import java.util.ArrayList;
import java.util.List;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class HolidayAllowance  {
	
	List<Employee> employees=new ArrayList<Employee>();
	public void addEmployee(String name, int daysLeft){
			employees.add(new Employee(name,daysLeft));
	}
	public List<Employee> getEmployeesForBonus(){
		SalaryCalculator sc=new SalaryCalculator();
		return sc.getEmployeesForMonthlyBonus(employees);
	}
}