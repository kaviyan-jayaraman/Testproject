package newpackage;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import java.net.URL;

	public class BrowserStackSampleTest {
	  public static final String USERNAME = "kaviyanjayaraman1";
	  public static final String AUTOMATE_KEY = "DbbWqqRA1QaFJKArSszx";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  public static void main(String[] args) throws Exception {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    
	    caps.setCapability("browserName", "android");
	    caps.setCapability("device", "7T");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "10.0");
	    
	    caps.setCapability("name", "kaviyanjayaraman1's First Test");
		  /*DesiredCapabilities caps = new DesiredCapabilities();
	        
		  caps.setCapability("os", "Windows");
		  caps.setCapability("os_version", "10");
		  caps.setCapability("browser", "Chrome");
		  caps.setCapability("browser_version", "81");
		  caps.setCapability("name", "kaviyanjayaraman1's First Test");*/
	    
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();
	  }
} 