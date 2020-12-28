package GoogleTest;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;	

public class GoogleTest {

	public static WebDriver driver;
	public String baseURL = "http://54.145.113.181:93/";
	
	@BeforeTest
    public void setUp(){
		
	    WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(baseURL);
}
    @Test
    public void login() throws InterruptedException
    {
      
    	   driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("abmadmin");
    	   driver.findElement(By.id("txtPassword")).sendKeys("Password");
    	   Thread.sleep(7000);
    	   driver.findElement(By.id("btnLogin")).click();
    	   driver.findElement(By.linkText("Master")).click();
    	   driver.findElement(By.xpath("//a[@href='/warehouse/ListCountry']")).click();
    	   driver.findElement(By.xpath("//a[@href='/Warehouse/AddOrUpdateCountry']")).click();
    	   
    	   Thread.sleep(3000);
    	   
    	   WebElement active = driver.findElement(By.xpath("//label[@for='cbIsActive']"));
    	   
    	   active.click();
    	   
    	   System.out.println("checkbox is selected");
    	   
    	   Thread.sleep(5000);
    		
    	   WebElement currency =driver.findElement(By.xpath("//span[text()='Select Currency']"));
    	   
    	   
    	   currency.click();
    	   
    	   WebElement country =driver.findElement(By.xpath("//span[text()='Select Country']"));
    	   
    	   country.click();
    	   
    		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
    				.withTimeout(20, TimeUnit.SECONDS) 			
    				.pollingEvery(5, TimeUnit.SECONDS) 			
    				.ignoring(NoSuchElementException.class);
    		
    		
    		
    	   List<WebElement> countrylist =  driver.findElements(By.xpath("//ul[@id='ddlCountry_listbox']/child::li[@class='k-item']"));
    	   
    	   for(WebElement value:countrylist)
    	   { 
    	     String pcvalues=value.getText();
    	     System.out.println("Country Name is : " + pcvalues);
    	    }
    	   
    	 
    	   String beforeXpath="";
    	   
    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.k-item[data-offset-index='7']"))).click();
    	   
    	   
    	   
    }
    	   
    
    @AfterTest
    public void endSession(){
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            driver.close();
        }
}
