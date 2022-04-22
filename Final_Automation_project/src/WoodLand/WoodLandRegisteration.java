package WoodLand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WoodLandRegisteration 
{
	 WebDriver driver; 
     Select s; //Globally Declaration
	
	@BeforeTest
	  public void beforeTest() throws InterruptedException 
	 {
		//Launch Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Advik\\Documents\\Automation testing\\Browser Extention\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		
		driver=new ChromeDriver(options);
		Thread.sleep(2000);
		driver.manage().window().maximize();
	  }

	@Test
    public void registeration() throws Exception 
	{
		//url
		  driver.get("https://www.woodlandworldwide.com/wdl/researchlab?slId=1049&clgId=10&token=");
		  
		  //driver.findElement(By.xpath("<i class=\"fas fa-user\"></i>")).click();
		 
		  driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"mini-profile\"]/ul/li[1]/span/span[3]")).click();
		  Thread.sleep(2000);
	
		  //Name	    
		   driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Akshada sanap");
		   Thread.sleep(2000);
			
		  //Email
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("akshadaavhad12@gmail.com");
				
	      //password
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Akshada123@");
							
		  
		  //Mobile
			driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("7620896037");
							
		   
		  //Gender
		     driver.findElement(By.xpath("//*[@id=\"form-sign-up\"]/div[5]/label[2]/span")).click();
				 		  
		   //Sign up
		    driver.findElement(By.xpath("//*[@id=\"form-sign-up\"]/p[1]/button")).click();
        } 
    }
