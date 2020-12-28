package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Clctest {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception {
		

		openCalc();
	}

	private static void openCalc() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
	  cap.setCapability("deviceName", "ASUS_X01BDA");
	  cap.setCapability("udid", "JBAAGF07P137P2E");
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("platformVersion", "9");
	  cap.setCapability("appPackage", "com.asus.calculator");
	  cap.setCapability("appActivity", "com.asus.calculator.Calculator");
	  URL url = new URL("http://0.0.0.0:4723/wd/hub");
	  driver = new AppiumDriver<MobileElement>(url,cap);
	  MobileElement two = driver.findElement(By.id("com.asus.calculator:id/digit2")); 
	  two.click();
	  MobileElement multiply = driver.findElement(By.id("com.asus.calculator:id/mul"));
	  multiply.click();
	  MobileElement one = driver.findElement(By.id("com.asus.calculator:id/digit5"));
	  one.click();
	  MobileElement equals = driver.findElement(By.id("com.asus.calculator:id/equal"));
	  equals.click();
	  
	  driver.close();
	}

}
 