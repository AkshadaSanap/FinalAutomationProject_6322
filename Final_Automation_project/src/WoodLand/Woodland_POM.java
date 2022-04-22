package WoodLand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Woodland_POM
{
	public void maximizeBrowser(WebDriver driver)
	{
	   driver.manage().window().maximize();
	}
	public void url(WebDriver driver)
	{
	   driver.get("https://www.woodlandworldwide.com/collections/men/footwear?clgId=10&channel=Web&price=&colors=&sizes=&brands=2306&pN=0&srtBy=&sOrdr=");	
	}
   
	public void WelcomeAdmin(WebDriver driver)
	{
	   driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]/i")).click();  	
		
	}
	
	public void loginButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"mini-profile\"]/ul/li[1]/span/span[2]")).click();  	
	}
	

	public void userName(WebDriver driver,String usn)
	{
	   driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(usn);
	}
	
	public void passWord(WebDriver driver,String pwd)
	{
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pwd);  	
	}
	
	public void signin(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/p[1]/button")).click();  	
	}
	
 public void WelcomeAdmin1(WebDriver driver)//*[@id="dropdownMenuButton"]/i
	{
	   driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]/i")).click();  	
		
	}
	
	public void logOut(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/header/div/div/nav/div[3]/div[3]/div/ul/li[9]")).click();

		}
   
	public void closeBrowser(WebDriver driver)
	{
	     driver.close();
	}


}
