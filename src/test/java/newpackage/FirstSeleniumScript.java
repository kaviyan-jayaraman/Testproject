package newpackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class FirstSeleniumScript {
public static void main(String[] args) throws InterruptedException{
//System.setProperty("webdriver.chrome.driver", "C:Selenium-java-edurekachromedriver_win32chromedriver.exe");
System.setProperty("webdriver.chrome.driver", "D:\\jk\\ios\\CDRIver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://13.233.194.125/");
driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("9000000001");
} 
}