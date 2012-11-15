package demo;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)

public class HelloWorld{
	private String separator=",";
	public void setSeparator(String separator) {
		this.separator = separator;
	};
	public String getGreeting(String action, String subject){
		return action+separator+" "+subject;
	}
}
