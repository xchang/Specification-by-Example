package payroll;

import java.util.List;

import fitlibrary.SetUpFixture;

public class EmployeeEntryFixture extends SetUpFixture {
	private final List<Employee> employees;

	public EmployeeEntryFixture(List<Employee> employees) {
		this.employees = employees;
	}

	public void employeeNameFreeDaysLeft(String name, int daysLeft){
		employees.add(new Employee(name,daysLeft));
	}
}
