package remedy.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Author extends RemedySharedFunctions{
  @Test
  public void Test_Author() {
	  Check_Author();
	  
	  
  }
  
  public void Check_Author()
  {
	  
	  RemedySharedFunctions.GlobalHeader();
		RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/section[2]/div/div/div/article/div[2]/h3/a");
		WebElement element=driver.findElement(By.xpath(".//*[@id='main']/section[2]/div/div/div/article/div[2]/h3/a"));
		String Text=element.getText();
		RemedySharedFunctions.Click(".//*[@id='main']/section[2]/div/div/div/article/div[2]/h3/a");
		RemedySharedFunctions.GlobalHeader();
	    RemedySharedFunctions.verifyImagePresence("//div[@class='post-hero']/picture/img");
	    System.out.println("The article Image has been displayed");
	    RemedySharedFunctions.CheckElementVisibility("//header[@class='post-header rule-bottom']/div/div//following::h1", Text);
	    RemedySharedFunctions.verifyElementVisibility("//ul[@class='post-authors list-inline']/li[2]/a");
	    WebElement element2=driver.findElement(By.xpath("//ul[@class='post-authors list-inline']/li[2]/a"));
		String Text2=element2.getText();
		RemedySharedFunctions.Click("//ul[@class='post-authors list-inline']/li[2]/a");
		RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/h1", Text2);
		RemedySharedFunctions.verifyImagePresence(".//*[@id='main']/header/div/div/div/picture/img");
		RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/header/div/div/div/div/p");
		
  
  }
}
