package payrollslim;

import java.util.ArrayList;
import java.util.List;

import payroll.Employee;

public class EmployeeTestRepository {
	private static List<Employee> employees=new ArrayList<Employee>();
	public static void add(Employee employee) {
		employees.add(employee);
	}
	public static List<Employee> getAll() {
		return employees;
	}

}
