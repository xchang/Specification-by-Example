package webexample;

// JUnit Assert framework can be used for verification
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.*;
public class UserInterfaceSteps {
	
	private final BrowserDriver browserDriver;
	public UserInterfaceSteps(BrowserDriver browserDriver){
			this.browserDriver = browserDriver;
			System.err.println("UI Steps");
	}

	public void theUserOpensPage(String page) {
		browserDriver.getDriver().get(browserDriver.getBaseUrl()+page);
	}
	public void thePageTitleIs(String text){
		assertEquals(text, browserDriver.getDriver().getTitle());
	}
	public void thePageContainsText(String text) throws Exception{
		assertTrue( browserDriver.getDriver().getPageSource().contains(text));
	}
	public void theUserClicksOnTheLink(String linkText) {
		browserDriver.getDriver().findElement(By.partialLinkText(linkText)).click();
	}
	public void theUserTypesIntoTheField(String what, String fieldName) {
		browserDriver.getDriver().findElement(By.name(fieldName)).sendKeys(what);
	}
	public void theUserClicksOnTheButton(String buttonName) {
		browserDriver.getDriver().findElement(By.name(buttonName)).click();
	}	


	

}
