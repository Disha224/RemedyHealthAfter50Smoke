package remedy.health;


import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class Bookstore extends RemedySharedFunctions {
  @Test
 public void CheckBookstore() throws AWTException, InterruptedException {
	  RemedySharedFunctions.GlobalHeader();
	  CheckBookstoreElements() ;
	  CheckLeftRail();
	  CheckProductModule();
	  AddandCleartoCart();
	  RemedySharedFunctions.GlobalFooter();
  }
  public void CheckLeftRail() throws InterruptedException
  {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='banner']/div[2]/a")).click();
	  List<WebElement> MainCategory = (List<WebElement>) driver.findElements(By.xpath(".//*[@id='menu']/ul[1]/li/a"));
		int categorycount = MainCategory.size();
		System.out.println( "The number of articles displayed on this page are " + categorycount);
				  for(int i = 0; i < categorycount; ++i) {
				       
					  
				      if(  ( MainCategory.get(i).isDisplayed()==true))
				       {
				    	   
				    	  System.out.println("The main category items are visible");
				    	   
				    	  
				    	   
				       }
				       else
				       {
				    	   System.out.println("The main category items are not visible");
				       }
				       
				    
				      
				       
				  }
				  RemedySharedFunctions.verifyElementVisibility(".//*[@id='menu']/ul[1]/li[5]");
				  List<WebElement> SubCategory = (List<WebElement>) driver.findElements(By.xpath(".//*[@id='menu']/ul[1]/li[5]/ul/li/a"));
					int subcategorycount = SubCategory.size();
					System.out.println( "The number of articles displayed on this page are " + subcategorycount);
							  for(int i = 0; i < subcategorycount; ++i) {
							       
								  
							      if(  ( SubCategory.get(i).isDisplayed()==true))
							       {
							    	   
							    	  System.out.println("The sub category items are visible");
							    	   
							    	  
							    	   
							       }
							       else
							       {
							    	   System.out.println("The sub category items are not visible");
							       }
							       
							    
							      
							       
							  }
							  Thread.sleep(2000);
							  driver.findElement(By.xpath(".//*[@id='banner']/div[2]/a")).click();
							
				  
  }
  
 public void CheckBookstoreElements() throws AWTException, InterruptedException {
	 WebElement element=driver.findElement(By.xpath("//li[@class='banner-shop-bookstore']/a[contains(text(),'Bookstore')]"));
	 CheckElementVisibility("//li[@class='banner-shop-bookstore']/a[contains(text(),'Bookstore')]",bookstore );
	    Point point = element.getLocation();
	    int xCoordinate=point.getX();
	    int yCoordinate=point.getY();
	    Robot robot = new Robot();
	   
	   
	    try {
	    	 robot.mouseMove(xCoordinate, yCoordinate);
	        Thread.sleep(10 * 1000);
	       
	    } catch (InterruptedException e) {

	    }
	    RemedySharedFunctions.verifyElementVisibility("//span[contains(text(),'Top Sellers')]");
	    RemedySharedFunctions.Click("//li[@class='banner-shop-bookstore']/a[contains(text(),'Bookstore')]");
	    List<WebElement> bookstorearticles = (List<WebElement>) driver.findElements(By.xpath("//div[@class='ecwid-img']/a"));
		int headercount = bookstorearticles.size();
		System.out.println( "The number of articles displayed on this page are " + headercount);
				  for(int i = 0; i < headercount; ++i) {
				       
					  
				      if(  ( bookstorearticles.get(i).isDisplayed()==true))
				       {
				    	   
				    	  System.out.println("The articles of this page are displayed properly");
				    	   
				    	  
				    	   
				       }
				       else
				       {
				    	   System.out.println("The articles of this page are not displayed properly");
				       }
				       
				    
				      
				       
				  }
	   
	
	
	 
  }
 public void CheckProductModule()
 {
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Hypertension and Stroke']");

	System.out.println("The image of Hypertension and Stroke module is visible");
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Vision']");
	
	System.out.println("The image of Vision module is visible");
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Nutrition']");

	System.out.println("The image of Nutrition module is visible");
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Digestion']");
	
	System.out.println("The image of Digestion module is visible");
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Depression']");
	
	System.out.println("The image of Depression module is visible");
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Diabetes']");

	System.out.println("The image of Diabetes module is visible");
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Lung']");

	System.out.println("The image of Lung module is visible");
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Health After 50 Newsletter']");

	System.out.println("The image of Health After 50 Newsletter module is visible");
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Memory']");
	
	System.out.println("The image of Memory module is visible");
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Prostate Disorders and Health']");
	
	System.out.println("The image of Prostate Disorders and Health module is visible");
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Back Pain']");
	
	System.out.println("The image of Back Pain module is visible");
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Arthritis']");

	System.out.println("The image of Arthrtis module is visible");
	RemedySharedFunctions.verifyImagePresence("//img[@alt='Heart Health']");

	System.out.println("The image of Heart Health module is visible");
	
 }
 public void AddandCleartoCart()
 {
	 driver.findElement(By.linkText("Hypertension and Stroke")).click();
	driver.findElement(By.xpath("//button[contains(.,'Add to Cart')]")).click();
	
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 WebElement element = driver.findElement(By.xpath(".//*[@id='ProductBrowser-1']/div[2]/div/div/div/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[4]/td/table/tbody/tr/td[1]/button"));

	 Actions actions = new Actions(driver);

	 actions.moveToElement(element).click().perform();
	 
 }
 

 
	

}

