package payrollslim;

import payroll.Employee;

public class FreeDaysLeft {
	private String employeeName;
	private int daysLeft;
	public void setEmployeeName(String name){
		employeeName=name;
	}
	public void setFreeDaysLeft(int days){
		daysLeft=days;
	}
	public void reset(){
		daysLeft=0;
		employeeName=null;
	}
	public void execute(){
		Employee employee=new Employee(employeeName, daysLeft);
		EmployeeTestRepository.add(employee);
	}
}
