package payrollslim;

import java.util.ArrayList;
import java.util.List;

import payroll.Employee;
import static util.ListUtility.list;

public class HolidayBonusesPaidToEmployees {

	public List<Object> query() {

		List<Employee> employees = EmployeeTestRepository.getAll();
		List<Object> slimMapList = new ArrayList<Object>();
		for (Employee employee : employees) {
			slimMapList.add(list(list("employee name", employee.employeeName)));
		}
		return slimMapList;
	}
}
