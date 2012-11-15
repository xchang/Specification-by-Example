package webexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import java.util.concurrent.TimeUnit;

public class SeleniumExample {
	
	public void go(){
	    WebDriver oWebDriver = new FirefoxDriver();
	    oWebDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	   
	    oWebDriver.get("http://www.google.co.uk/#");
	    WebElement oSearchInputElem = oWebDriver.findElement(By.name("q")); // Use name locator to identify the search input field.
	    oSearchInputElem.sendKeys("Selenium 2");
	    WebElement oGoogleSearchBtn = oWebDriver.findElement(By.xpath("//button[@name='btnG']"));
	    oGoogleSearchBtn.click();
	    oWebDriver.quit();
	}
	public static void main(String args[]){
		SeleniumExample w=new SeleniumExample();
		w.go();
	}
}
