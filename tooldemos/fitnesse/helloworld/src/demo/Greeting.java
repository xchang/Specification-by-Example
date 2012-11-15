package demo;

public class Greeting {
	private String action;
	public void setAction(String action){
		this.action = action;	
	}
	public String subject;
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String greeting(){
		return action+", "+subject;
	}
}
