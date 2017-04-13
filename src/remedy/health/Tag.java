package remedy.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tag extends RemedySharedFunctions {
  @Test
  public void TestTag() throws InterruptedException {
	  CheckTag();
  
  }
  
  public void CheckTag() throws InterruptedException
  {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='banner']/div/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(text(),'Allergies')]")).click();
	  RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[1]/h2/a");
		WebElement element=driver.findElement(By.xpath(".//*[@id='main']/header/div/div/div/ul/li[1]/h2/a"));
		String Text=element.getText();
		RemedySharedFunctions.Click(".//*[@id='main']/header/div/div/div/ul/li[1]/h2/a");
		RemedySharedFunctions.GlobalHeader();
		String Text2=Text.substring(0, 1).toUpperCase()+Text.substring(1).toLowerCase();
		
	  RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/h1", Text2);
  
  }
}
