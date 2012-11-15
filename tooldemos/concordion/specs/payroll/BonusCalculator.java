package payroll;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)

public class BonusCalculator {
	public int getBonus(String employeeLevel, int salary){
		SalaryCalculator sc=new SalaryCalculator();
		return sc.bonusFor(employeeLevel, salary);
	}
}