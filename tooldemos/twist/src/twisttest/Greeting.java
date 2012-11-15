package twisttest;
import static org.junit.Assert.*;
// JUnit Assert framework can be used for verification

public class Greeting {

	private String object;
	private String action;

	public void givenTheObjectIs(String object) throws Exception {
		this.object = object;
	
	}

	public void andTheActionIs(String action) throws Exception {
		this.action = action;
	
	}

	public void thenTheGreetingIs(String expectedGreeting) throws Exception {
		assertEquals(expectedGreeting, action+ " "+object);
	}

}
