package remedy.health;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class MainPage extends RemedySharedFunctions {
  @Test
  public void CheckMainPage() throws InterruptedException {
	  RemedySharedFunctions.GlobalHeader();
	  VerifyModuleHeaderPresence();
	  VerifyImagePresence();
	  VerifyArticleHeaderPresence();
	  RemedySharedFunctions.GlobalFooter();
	  CheckSignUp();
	
  }
  public void VerifyModuleHeaderPresence()
  {
	  RemedySharedFunctions.CheckElementVisibility("//span[contains(text(),'Featured')]", "FEATURED");
	  RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/section[2]/div/h2/span");
	  RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/section[3]/div/h2/span");
	  RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/section[4]/div/h2/span");
	  RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/section[5]/div/h2/span");
	  System.out.println("All the module headers are displayed properly");
	  
  }
  public void VerifyImagePresence()
  {
	  List<WebElement> Images = (List<WebElement>) driver.findElements(By.xpath("//span/picture/img"));
		int imagecount = Images.size();
		System.out.println( "The number of articles displayed on this page are " + imagecount);
				  for(int i = 0; i < imagecount; ++i) {
				       
					  
				      if(  ( Images.get(i).isDisplayed()==true))
				       {
				    	   
				    	  System.out.println("The image is displayed properly");
				    	   
				    	  
				    	   
				       }
				       else
				       {
				    	   System.out.println("The images  is  not displayed properly");
				       }
				       
				    
				      
				       
				  }
  }
  public void VerifyArticleHeaderPresence()
  {
	  List<WebElement> ArticleHeaders = (List<WebElement>) driver.findElements(By.xpath("//span/picture/img"));
		int headercount = ArticleHeaders.size();
		System.out.println( "The number of articles displayed on this page are " + headercount);
				  for(int i = 0; i < headercount; ++i) {
				       
					  
				      if(  ( ArticleHeaders.get(i).isDisplayed()==true))
				       {
				    	   
				    	  System.out.println("The article header is displayed properly");
				    	   
				    	  
				    	   
				       }
				       else
				       {
				    	   System.out.println("The article header  is  not displayed properly");
				       }
				       
				    
				      
				       
				  }
				  
				 
  
  
  
  
  
  }
  
  public void CheckSignUp() throws InterruptedException
  {
	  Thread.sleep(2000);
	  RemedySharedFunctions.ScrollDown_Click("//input[@id='newsletter-email']");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("tasnuvatehrin@gmail.com");
	  driver.findElement(By.xpath(".//*[@id='footer']/div[2]/form/div/button")).click();
	  driver.findElement(By.xpath(".//*[@id='subscription-interests']/div/div[1]/form/ul[1]/li[1]/label/input")).click();
	  driver.findElement(By.xpath(".//*[@id='subscription-interests']/div/div[1]/form/ul[1]/li[2]/label/input")).click();
	  driver.findElement(By.linkText("CONTINUE")).click();
	  RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/h2", "You're Almost Done");
  
  }
  

  

}
