package webexample;

// JUnit Assert framework can be used for verification

public class WebContext {
	

	private final BrowserDriver driver;

	public WebContext(BrowserDriver driver){
		this.driver = driver;
		System.err.println("WebContext");
	}
	public void setUp() throws Exception {
		driver.startBrowser();
	}

	public void tearDown() throws Exception {
		driver.stopBrowser();
	}

	

}
