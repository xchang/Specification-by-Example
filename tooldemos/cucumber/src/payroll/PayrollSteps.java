package payroll;

import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;
import static junit.framework.Assert.assertEquals;

public class PayrollSteps {

	private int actualBonus;
	private String employeeLevel;
	private int salary;
	@Given("^an employee of level ([a-zA-Z ]*)$")
	public void antEmployeeOfLevel(String level) {
		employeeLevel=level;
	}

	@Given("^a salary of ([0-9]*)$")
	public void aSalaryOf(int salary) {
		this.salary=salary;
	}

	@When("^the end of year bonus is paid$")
	public void theEndOfYearBonusIsPaid() {
		actualBonus=new SalaryCalculator().bonusFor(employeeLevel, salary);
	}

	@Then("^the employee should receive a bonus of ([0-9]*)$")
	public void theEmployeeShouldReceiveABonusOf(int bonus) {
		assertEquals(bonus,actualBonus);
	}
}
