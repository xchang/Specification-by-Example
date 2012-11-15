package webexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserDriver {
	private String url;
	private String browser;
	private WebDriver driver;
	private int seconds=10;
	public void setBaseUrl(String url) throws Exception {
		this.url = url;
	}
	public void setBrowser(String browser) throws Exception {
		this.browser=browser;
	}
	public void stopBrowser(){
		driver.quit();
	}
	public void startBrowser(){
		if("firefox".equalsIgnoreCase(browser)){
			driver=new FirefoxDriver();
		}
		else if ("ie".equalsIgnoreCase(browser)){
			driver=new InternetExplorerDriver();
		}
		else if("chrome".equalsIgnoreCase(browser)){
			driver=new ChromeDriver();
		}
		else if("headless".equalsIgnoreCase(browser)){
			driver=new HtmlUnitDriver();
		}
		else throw new Error("unsupported browser "+browser);
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		
	}
	public void setTimeout(int seconds){
		this.seconds=seconds;	   
	}
	public WebDriver getDriver(){
		return driver;
	}
	public String getBaseUrl(){
		return url;
	}
}
