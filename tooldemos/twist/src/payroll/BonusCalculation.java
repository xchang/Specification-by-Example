package payroll;

// JUnit Assert framework can be used for verification

public class BonusCalculation {

	private String level;
	private Integer salary;
	private Integer actualBonus;

	public void employeeLevelIs(String level) throws Exception {
		this.level = level;
	
	}

	public void andHeIsPaid(Integer salary) throws Exception {
		this.salary = salary;
	
	}

	public void whenTheEndOfYearBonusIsPaid() throws Exception {
		actualBonus=new SalaryCalculator().bonusFor(level,salary);
	}

	public void thenTheEmployeeShouldReceiveABonusOf(Integer expectedBonus)
			throws Exception {
		org.junit.Assert.assertEquals(expectedBonus, actualBonus);
	}

}
