package payroll;

public class Employee {
	private String employeeName;
	private int holidayDaysLeft;
	public Employee(String employeeName, int holidayDaysLeft) {
		this.employeeName = employeeName;
		this.holidayDaysLeft = holidayDaysLeft;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public int getHolidayDaysLeft() {
		return holidayDaysLeft;
	}
}
