package payroll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;

public class HolidayAllowanceSteps {
	List<Employee> employees=new ArrayList<Employee>();
	@Given("^the following employees$")
	public void theFollowingEmployeesWithTable(cuke4duke.Table table) {
		 List<Map<String,String>> hashes=table.hashes();
		 for (Map<String,String> employeeData : hashes){
			 Employee employee=new Employee(employeeData.get("employee name"), Integer.parseInt(employeeData.get("free days left")));	 
			 employees.add(employee);
		 }
	}

	@Then("^the following holiday bonuses should be paid at the end of the month$")
	public void theFollowingHolidayBonusesShouldBePaidAtTheEndOfTheMonthWithTable(cuke4duke.Table table) {
		List<Employee> bonusesPaidOutTo=new SalaryCalculator().getEmployeesForMonthlyBonus(employees);
		
		List<Map<String,String>> actualEmployeesTable=
		       new ArrayList<Map<String,String>>();
		   for (Employee employee:bonusesPaidOutTo){
		       actualEmployeesTable.add(toHash(employee));
		   }   
		   table.diffHashes(actualEmployeesTable);
	}

	private Map<String, String> toHash(Employee employee) {
		 Map<String,String> map=new HashMap<String,String>();
		   map.put("employee name",employee.getEmployeeName());
		   return map;
	}

}
