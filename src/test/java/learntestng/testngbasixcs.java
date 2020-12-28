package learntestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbasixcs {


	@BeforeClass
	  
	
	public  void launchbrowser() {
		
		System.out.println("Launch broser");

	}
	
  @BeforeMethod
  
   public void enterURL()  {
	  
	  System.out.println("Enter URLr");
  }
  
   @BeforeTest
   
    public void login() {
	   
	   System.out.println("Login Method");
   }
   
   @Test
   
  public void googleTitleTest() {
	   System.out.println("Google Title Test");  
   }
   
   @AfterMethod
   public void logout() {
	   System.out.println("Logout from app");
   }
   
   @AfterTest
   public void deleteAllCookies() {
	   System.out.println("Delete All Cookies");
   }
   
   @AfterClass
   public void closeBrowser() {
	   System.out.println("Close Browser");
   }
}
