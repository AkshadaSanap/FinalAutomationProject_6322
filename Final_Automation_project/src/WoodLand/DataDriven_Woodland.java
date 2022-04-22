package WoodLand;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class DataDriven_Woodland 
{
  WebDriver driver;
  @BeforeTest
   public void beforeTest() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Advik\\Documents\\Automation testing\\Browser Extention\\chromedriver.exe");
	   ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
	    driver=new ChromeDriver(options);

     Thread.sleep(2000);
     driver.manage().window().maximize();
		
  }
  
	@Test(dataProvider = "dp1")
  public void f(String  username, String password) throws Exception
	{ 
	     Woodland_POM w1= new Woodland_POM();
	
		w1.maximizeBrowser(driver);
		w1.url(driver);
		w1.WelcomeAdmin(driver);
		Thread.sleep(2000);
		w1.loginButton(driver);
		Thread.sleep(2000);
		w1.userName(driver, username);
		w1.passWord(driver, password);
	
		Thread.sleep(2000);
		w1.signin(driver);
		w1.WelcomeAdmin1(driver);
		Thread.sleep(2000);
		w1.logOut(driver);
        w1.closeBrowser(driver);
	}
	

  @DataProvider
  public Object[][] dp1()
  {
      return new Object[][] 
  		{
     
      new Object[] { "Demo", "Demo1" },
      new Object[] { "akshadaavhad12@gmail.com", "Akshada123@" },
    //  new Object[] { "Demo@gmail.com", "Demo@12" },
      
    };
    
  }
  
  @AfterTest
  public void afterTest()
 {
 	driver.close();
 }
}

