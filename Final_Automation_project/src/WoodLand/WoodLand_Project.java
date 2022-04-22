package WoodLand;

//when we run the program then product get added into the add to cart so when next time we want to run the code the product need to removed from the 
//add to card manually..also the address get stored so that address also need to be removed manually

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WoodLand_Project
{
	WebDriver driver;
    Select s;//Globally Declared
    
    @BeforeTest
	  public void beforeTest() throws InterruptedException 
	 {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Advik\\Documents\\Automation testing\\Browser Extention\\chromedriver.exe");
		    ChromeOptions options=new ChromeOptions();
			options.addArguments("disable-notifications");
		    driver=new ChromeDriver(options);
			Thread.sleep(2000);
			driver.manage().window().maximize();
		
		//Login:
			driver.get("https://www.woodlandworldwide.com/collections/men/footwear?clgId=10&channel=Web&price=&colors=&sizes=&brands=2306&pN=0&srtBy=&sOrdr=");
			Thread.sleep(2000);
			
			//Admin
			driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]/i")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"mini-profile\"]/ul/li[1]/span/span[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("akshadaavhad12@gmail.com");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Akshada123@");
			Thread.sleep(2000);
			
			//sign in
			driver.findElement(By.xpath("//*[@id=\"form-login\"]/p[1]/button")).click();
			Thread.sleep(2000);
		
	  }
    
   @Test(priority=1) 
    public void smokeTesting() throws InterruptedException 
   {
    	 //step 1: create object of action class
	     Actions a= new Actions(driver);
	     Thread.sleep(3000);
	     //step 2: create object of list with webElement
	     List ls=driver.findElements(By.xpath("//*[@id=\"navbar1\"]/li"));
	     Thread.sleep(1000);
	     //step 3: store size of list
	     int listSize=ls.size();
	     
	     System.out.println("No of modules" +5);
	     
	     //step 4:
	     for(int i=1; i<=listSize; i++)
	    	 
	     {
	    	 //wait
	    	 Thread.sleep(2000);
	    	 
	    	 // Display module name
	    	 System.out.println(driver.findElement(By.xpath("//*[@id=\"navbar1\"]/li["+i+"]")).getText());
	    	 Thread.sleep(3000);
	         //perform Mouse hover
	    	 a.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbar1\"]/li["+i+"]"))).click().perform();
	     }
   }
         @Test(priority=2) 
         public void Searchbox() throws Exception
         {
     
	       //Search Box
	        driver.findElement(By.xpath("//*[@id=\"searchKey\"]")).sendKeys("Shoes");
 		    Thread.sleep(2000);
 		    
            //Search
 	        driver.findElement(By.xpath("/html/body/header/div/div/nav/div[3]/div[1]/i")).click();
 	        Thread.sleep(2000);
		    
            //item-shoes
 	        driver.findElement(By.xpath("//*[@id=\"p-13744\"]/div[2]/div[2]/div[1]/a/img")).click();
	        Thread.sleep(2000);
		  
           //size
	 	     driver.findElement(By.xpath("//*[@id=\"49739-39\"]")).click();
		     Thread.sleep(2000);
			 
           //color 
	 	     driver.findElement(By.xpath("//*[@id=\"c3b091\"]")).click();
		     Thread.sleep(2000);
			
             //add to card
		     driver.findElement(By.xpath("//*[@id=\"addToCart-13744\"]/span")).click();
		     Thread.sleep(2000);
			   
		     driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]/a/i")).click();
		     Thread.sleep(2000);
   
		     driver.findElement(By.xpath("//*[@id=\"miniCartItems\"]/ul/li/a")).click();
		     Thread.sleep(2000);
             
		     
		     //Proceed order
		     driver.findElement(By.xpath("//*[@id=\"checkout-btn-buy-now\"]")).click();
		     Thread.sleep(2000);
		     
		     //Name
		     driver.findElement(By.xpath("//*[@id=\"fullName\"]")).sendKeys("Akshada Sanap");
		     Thread.sleep(2000);
		     
		     //Phone number
		     driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9028758479");
		     Thread.sleep(2000);
		     
		     //Address line 1
		     driver.findElement(By.xpath("//*[@id=\"addr1\"]")).sendKeys("Niphad");
		     Thread.sleep(2000);
		     
		     //Address line 2
		     driver.findElement(By.xpath("//*[@id=\"addr2\"]")).sendKeys("Nashik");
		     Thread.sleep(2000);
 
		     //pin code
		     driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("422303");
		     Thread.sleep(2000);
		     
		      //country
		      s= new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
			  s.selectByVisibleText("INDIA");
		      Thread.sleep(2000);
             
		      //state
  		      Select s= new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
			  s.selectByIndex(23);
			  Thread.sleep(2000);
			
			  //city
			  Select s1= new Select(driver.findElement(By.xpath("//*[@id=\"city\"]")));
		  	  s1.selectByIndex(1);
			  Thread.sleep(2000);
				
			  //add to cart
		      driver.findElement(By.xpath("//*[@id=\"addUpdateAddress\"]")).click();
		      Thread.sleep(2000);
          }	
    
           @Test(priority=3) 
           public void menmodule2() throws Exception
           {

    	        //Men
    	        driver.findElement(By.xpath("//*[@id=\"tp_men\"]")).click();
     		    Thread.sleep(2000);
     		   
                //T-shirt
     		    driver.findElement(By.xpath("//*[@id=\"men_apparels_t-shirts\"]")).click();
    		    Thread.sleep(2000);
    	        
    		    //image
    		    driver.findElement(By.xpath("//*[@id=\"p-18822\"]/div[2]/div[2]/div[1]/a/img")).click();
    		    Thread.sleep(2000);
    	        
    		    //size
    		    driver.findElement(By.xpath("//*[@id=\"100553-M\"]")).click();
     		    Thread.sleep(2000);
     		    
     		    //color
     		    driver.findElement(By.xpath("//*[@id=\"FFFFFF\"]")).click();
    		    Thread.sleep(2000);
               
    		    //add to cart
     		    driver.findElement(By.xpath("//*[@id=\"addToCart-18822\"]")).click();
    		    Thread.sleep(2000);
        }
       
       
     //Previously this module was working as it is live site some time it is working some time it does not work because of upgradation product get change so the module is not working
         //some time it works some time not  
           @Test(priority=4)
             public void womenmodule3() throws Exception
             {
    	       //Women
	            driver.findElement(By.xpath("//*[@id=\"tp_women\"]")).click();
		        Thread.sleep(2000);
		
			   //image
		        driver.findElement(By.xpath("//*[@id=\"women_accessories_bags\"]")).click();
		        Thread.sleep(2000);
		        
		       //Search Box
		       //driver.findElement(By.xpath("//*[@id=\"searchKey\"]")).sendKeys("SKY BLUE SLING BAG FOR WOMEN");
	 		   //Thread.sleep(2000);
	 	
		       //image
		        driver.findElement(By.xpath("//*[@id=\"p-12215\"]/div[2]/div[2]/div[1]/a/img")).click();
		        Thread.sleep(2000);

		       //color
		        driver.findElement(By.xpath("//*[@id=\"FD9DB8\"]")).click();
		        Thread.sleep(2000);
	        
		       //Add to cart
		        driver.findElement(By.xpath("//*[@id=\"addToCart-12215\"]/span")).click();
		        Thread.sleep(2000);
            }  
		  @Test(priority=5)
	       public void lookbookmodule4() throws Exception
	       {
	    	     
		      //Lookbook
		      driver.findElement(By.xpath("//*[@id=\"navbar1\"]/ul/li[3]/a")).click();
		      Thread.sleep(2000);
	          
		      //image
		      driver.findElement(By.xpath("/html/body/header/div/div/nav/div[2]/ul/li[3]/ul/li/div/div[1]/a/div")).click();
		      Thread.sleep(2000);
	          
		      //view woods lookbook
		      driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/p/a/button")).click();
		      Thread.sleep(2000);
	          
              //front arrow
              //driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div/div/div/a[2]")).click(); 
              //Thread.sleep(2000);
	           
             //search
             //driver.findElement(By.xpath("//*[@id=\"searchKey\"]")).sendKeys("Woods WHITE block heel sandals");
             
              // Search
             //driver.findElement(By.xpath("/html/body/header/div/div/nav/div[3]/div[1]/i")).click();
              // Thread.sleep(2000);
		      
	 	      //image
			  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div/div/ul/li[5]/a/span[2]/img")).click();
		      Thread.sleep(2000);
			    
		      //size
		      driver.findElement(By.xpath("//*[@id=\"81800-39\"]")).click();
		      Thread.sleep(2000);
	          
		      //color
		      driver.findElement(By.xpath("//*[@id=\"FFFFFF\"]")).click();
		      Thread.sleep(2000);
		      
		      //add to card
		      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/button[2]/span")).click();
		      Thread.sleep(2000);
	       }
		  
		  @Test(priority=6)
			 public void Labs() throws  Exception
			 {
			      driver.findElement(By.xpath("//*[@id=\"navbar1\"]/ul/li[4]/a")).click();
				  Thread.sleep(2000);
				 
				//how to scroll
				    JavascriptExecutor js=(JavascriptExecutor)driver;//type_cast	
				    js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //scroll to bottom
			        Thread.sleep(2000);
					 
				 //How to take screenshot
				    TakesScreenshot ts=(TakesScreenshot)driver;//Type_cast
				    File src=ts.getScreenshotAs(OutputType.FILE);
					FileHandler.copy(src,new File("labs.png"));
			 		Thread.sleep(2000);
		
			 }
       
//	//Previously this module was working as it is live site the because of upgradation product get change so the module is not working
		 @Test(priority=7)
	        public void streetwear() throws Exception
	        {  
		      //streetwear
		      driver.findElement(By.xpath("/html/body/header/div/div/nav/div[2]/ul/li[5]/a")).click();
		      Thread.sleep(2000);
		      
		      //All product
		      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/a[1]/span[2]")).click();
		      Thread.sleep(2000);
//		      
//		       //filter :whats new 
		       // driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div/div[2]/a[2]")).click();
		      //Thread.sleep(2000);
		      
//		     
//		      //product
//		        driver.findElement(By.xpath("//*[@id=\"p-24578\"]")).click();
//		        Thread.sleep(2000);
//		      
//		      //size
//		       driver.findElement(By.xpath("//*[@id=\"663333\"]")).click();
//		       Thread.sleep(2000);
//		      
//		      //add to cart
//		       driver.findElement(By.xpath("//*[@id=\"addToCart-24579\"]/span")).click();
//		       Thread.sleep(2000);
		  
		    //how to scroll
		     //JavascriptExecutor js=(JavascriptExecutor)driver;//type_cast	
		   //js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //scroll to bottom
	       //Thread.sleep(3000);
	        
	        
		 //How to take screenshot
		    TakesScreenshot ts=(TakesScreenshot)driver;//Type_cast
		    File src=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("streetware.png"));
	 		Thread.sleep(3000);
		  
      }
		 
		 @AfterTest
	     public void afterTest()
	    {
	    	driver.close();
	    }
   }
				  
 
		     
       
	     
  