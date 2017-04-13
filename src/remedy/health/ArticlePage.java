package remedy.health;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class ArticlePage extends RemedySharedFunctions {
  @Test
  public void CheckArticles() throws InterruptedException {
	  Articles();
	  
  }
	public  void Articles() throws InterruptedException
	{
		 RemedySharedFunctions.GlobalHeader();
		RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/section[1]/div/div/div/article/div[2]/h3/a");
		WebElement element=driver.findElement(By.xpath(".//*[@id='main']/section[1]/div/div/div/article/div[2]/h3/a"));
		String Text=element.getText();
		RemedySharedFunctions.Click(".//*[@id='main']/section[1]/div/div/div/article/div[2]/h3/a");
	    
	    RemedySharedFunctions.GlobalHeader();
	    RemedySharedFunctions.verifyImagePresence("//div[@class='post-hero']/picture/img");
	    System.out.println("The article Image has been displayed");
	    RemedySharedFunctions.CheckElementVisibility("//header[@class='post-header rule-bottom']/div/div//following::h1", Text);
	    
	    RemedySharedFunctions.verifyElementVisibility("//ul[@class='social social-share list-inline active']/li/a/i[@class='icon ion-social-facebook']");
	    System.out.println("The facebook logo is visible");
	    RemedySharedFunctions.verifyElementVisibility("//ul[@class='social social-share list-inline active']/li[2]/a/i[@class='icon ion-social-twitter']");
	    System.out.println("The twitter logo is visible");
	    RemedySharedFunctions.verifyElementVisibility("//ul[@class='social social-share list-inline active']/li[3]/a/i[@class='icon ion-social-pinterest']");
	    System.out.println("The pininterest logo is visible");
	    RemedySharedFunctions.verifyElementVisibility("//ul[@class='social social-share list-inline active']/li[4]/a/i[@class='icon ion-email']");
	    System.out.println("The gmail logo is visible");
	    RemedySharedFunctions.CheckFontSize("//div[@class='post-body-main']/p[1]","//div[@class='post-body-main']/p[2]");
	  // RemedySharedFunctions.CheckFontSize(".//*[@id='1U4yoNzd92QEGiwWGCOWCW']/div[2]/div/div[1]/p[1]", ".//*[@id='1U4yoNzd92QEGiwWGCOWCW']/div[2]/div/div[1]/p[2]");
	   RemedySharedFunctions.CheckElementVisibility("//p[contains(text(),'Read this next')]", "READ THIS NEXT");
	   RemedySharedFunctions.CheckElementVisibility("//p[contains(text(),'MORE ABOUT')]", "MORE ABOUT");
	  
	   RemedySharedFunctions.CheckArticleContinuation("//header[@class='post-header rule-bottom']/div/h1");
	    GlobalFooter();
	   
		
}
 

}
