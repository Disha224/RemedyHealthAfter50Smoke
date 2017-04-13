package remedy.health;


import java.util.List;
import java.util.concurrent.TimeUnit;











import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
public class RemedySharedFunctions  {

	
public static WebDriver driver=null;

public static String bookstore = "BOOKSTORE";
public static String subscribe = "SUBSCRIBE";

@BeforeClass(alwaysRun=true)
public static void LaunchBrowser()
{
	System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//eclipse workplace//chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start-maximized");
	driver = new ChromeDriver( options );
	//driver= new FirefoxDriver();
	driver.get("https://www.healthafter50.com/");
	
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='evergage-tooltip-ambPsbxa']/a/span")).click();
}

	
	
	public static void CheckElementVisibility(String xpath,String DesiredText )
    {
		WebElement selectElement = driver.findElement(By.xpath(xpath));
		String Text=selectElement.getText();
		System.out.println(Text);
		Assert.assertEquals(Text, DesiredText, "Expected Text not found");
		 System.out.println(Text.equals(DesiredText));
		
  }

	public static void verifyElementVisibility(String xpath)
	{
		boolean element=driver.findElement(By.xpath(xpath)).isDisplayed();
		
		if(element==true)
		{
			System.out.println("The element is visible");
		}
		else
		{
			System.out.println("The element is not visible");
		}
		
	}
	

	public static void GlobalHeader() {
		// TODO Auto-generated method stub
		verifyImagePresence(".//*[@id='logo']/a/picture/img");
		
		System.out.println("Header Logo is visible");
		verifyElementVisibility(".//*[@id='banner']/div/a");
		CheckElementVisibility("//li[@class='banner-shop-bookstore']/a[contains(text(),'Bookstore')]",bookstore );
		CheckElementVisibility("//li[@class='banner-shop-newsletter']/a[contains(text(),'Subscribe')]",subscribe);
		verifyElementVisibility(".//*[@id='banner']/div/form/i");
		
		
	}
	
	public static void SEO(String Text) throws InterruptedException{
		
		driver.findElement(By.xpath(".//*[@id='banner']/div/form/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='banner']/div/form/input")).sendKeys(Text);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='banner']/div/form/i")).click();
		//click($(".ion-search"));
		//write(Text, into($("@q")));
		//click($(".ion-search"));
		 WebElement x = driver.findElement(By.xpath(".//*[@id='main']/header/div/div/div/div/small"));
	        String y = x.getText().toString();
	       System.out.println(y);
	       String z=y.substring(0, 2);
	       System.out.println(z);
	       int a= Integer.valueOf(z);
	   	List<WebElement> headers = (List<WebElement>) driver.findElements(By.xpath("//h3[@class='post-summary-title']/a/strong"));
		int headercount = headers.size();
		if(a==headercount)
		{
			 System.out.println("Proper numbers of articles are displayed");
		}
		else
		{
			 System.out.println("Proper numbers of articles are not displayed");
		}
		
		/* WebElement element=driver.findElement(By.xpath(".//*[@id='banner']/div/form/i"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(element);
		 actions.click();
		 actions.sendKeys("Allergies");
		 actions.click();
		
		 actions.build().perform();*/
		
		
	}

	
	
	public static void CheckFontSize(String xpath1,String xpath2)
	{
		WebElement text1=driver.findElement(By.xpath(xpath1));
		  String fontSize1 = text1.getCssValue("font-size");
		 
		  
		  WebElement text2=driver.findElement(By.xpath(xpath2));
		  String fontSize2 = text2.getCssValue("font-size");
		
		  int fontResult=fontSize1.compareTo(fontSize2);
		  if(fontResult==1)
		  {
			  System.out.println("The first paragraph's font is larger");
		  }
		  else if(fontResult==-1)
		  {
			  System.out.println("The first paragraph's font is smaller");
		  }
		  else if(fontResult==0)
		  {
			  System.out.println("Both font sizes are equal");
		  }
		
	}
	
	public static void CheckArticleContinuation(String xpath) throws InterruptedException
	{
		
		  
		
		for (int second = 0;; second++) {
		    if(second >=10){
		    	List<WebElement> ArticleHeaders = (List<WebElement>) driver.findElements(By.xpath(xpath));
				int headercount = ArticleHeaders.size();
				System.out.println( "The number of articles displayed on this page are " + headercount);
						  for(int j = 0; j < headercount; ++j) {
						       
							  
						      if(  ( ArticleHeaders.get(j).isDisplayed()==true))
						       {
						    	   
						    	  System.out.println("The next article is displayed properly");
						    	   
						    	}
						       else
						       {
						    	   System.out.println("The next article is  not displayed properly");
						       }
						  }
		    	
		     break;
		    }
		    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3500)", "");
			Thread.sleep(3000);
          
		    
		 
		    }
		}
		
	
		
	public static void verifyTextPresent(String value)
	{
		 WebElement element = driver.findElement(By.cssSelector("body"));
		    boolean feedBack = driver.findElement(By.cssSelector("body")).getText().contains(value);
		    boolean feedbackVisible = element.isDisplayed();
		    if(feedBack==true){
		        System.out.println(value+ " is present");
		        if(feedbackVisible==true){
		            System.out.println(value+ " is visible");
		        }
		        else{
		            System.out.println(value+ " is not visible");
		        }
		        

		    }
		    else  {
		        System.out.println(value+ " is not present");

		    } 
	}	  
		
	
	
	public static void SharingControls() throws InterruptedException
	{
		
	    
	    
	    RemedySharedFunctions.GlobalHeader();
		RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/section[1]/div/div/div/article/div[2]/h3/a");
		RemedySharedFunctions.Click(".//*[@id='main']/section[1]/div/div/div/article/div[2]/h3/a");
	    RemedySharedFunctions.GlobalHeader();
	    RemedySharedFunctions.verifyImagePresence("//div[@class='post-hero']/picture/img");
	    System.out.println("The article Image has been displayed");
	    WebElement element=driver.findElement(By.xpath("//header[@class='post-header rule-bottom']/div/div//following::h1"));
	    String text1=element.getText();
	    
	    String parentHandle = driver.getWindowHandle(); // get the current window handle
	    // click some link that opens a new window
	    driver.findElement(By.xpath("//ul[@class='social social-share list-inline active']/li/a/i[@class='icon ion-social-facebook']")).click();
	    for (String winHandle : driver.getWindowHandles()) {
	        driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
	    }
            Thread.sleep(2000);
            driver.findElement(By.name("email")).sendKeys("tehrintasnuva@yahoo.com");
            driver.findElement(By.name("pass")).sendKeys("doggystyle@");
            driver.findElement(By.name("login")).click();
            verifyTextPresent(text1);
	   /* write("tehrintasnuva@yahoo.com",into("Email or Phone:"));
		   write("coitus@",into("Password:"));
		   click("Log In");
		   
		   if(verifyElements(text2)==true)
		   {
			   System.out.println("Proper article has been shared");
		   }*/

	    driver.close(); // close newly opened window when done with it
	    driver.switchTo().window(parentHandle);
	    
	  
		}
	
        
	public static void ScrollDown_Click(String xpath) throws InterruptedException
	{
		for (int second = 0;; second++) {
		    if(second >=5){
		    	driver.findElement(By.xpath(xpath)).click();
		     break;
		    }
		    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,4500)", "");
			
			Thread.sleep(1000);
		}
			//WebDriverWait wait = new WebDriverWait(driver, 35);
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		
		}

		public static void Click(String xpath) 
		{
			
				
				WebDriverWait wait = new WebDriverWait(driver, 35);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
				 driver.findElement(By.xpath(xpath)).click();
			
			}
		
		
	   
		
	
    
	
	
	




	
	public static void verifyImagePresence(String xpath) {
		
		
	
		
		WebElement ImageFile = driver.findElement(By.xpath(xpath));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	    Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
	    if (!ImagePresent)
	    {
	         System.out.println("Image not displayed.");
	    }
	    else
	    {
	        System.out.println("Image displayed.");
	    }
		
	}
	


	


	public void sleep(int seconds) 
	{
	    try {
	        Thread.sleep(seconds * 1000);
	    } catch (InterruptedException e) {

	    }
	}

	public static void GlobalFooter() {
		//scrollDown(10000);
		
		verifyElementVisibility(".//*[@id='footer']/div[2]/span");
		verifyElementVisibility(".//*[@id='newsletter-email']");
		CheckElementVisibility("//button[contains(.,'Sign Up')]", "SIGN UP" );
		verifyElementVisibility(".//*[@id='footer']/div[2]/div/ul/li[1]/a/i");
		verifyElementVisibility(".//*[@id='footer']/div[2]/div/ul/li[2]/a/i");
		CheckElementVisibility("//a[contains(.,'Contact Us')]", "Contact Us" );
		
		CheckElementVisibility("//a[contains(.,'Remedy Health Media, LLC')]", "Remedy Health Media, LLC" );

		CheckElementVisibility("//a[contains(.,'About Us')]", "About Us" );
	
		CheckElementVisibility("//a[contains(.,'Privacy Policy')]", "Privacy Policy" );
	
		CheckElementVisibility("//a[contains(.,'Terms of Use')]", "Terms of Use" );
	
		CheckElementVisibility("//a[contains(.,'Advertising Policy')]", "Advertising Policy" );
		
		CheckElementVisibility("//a[contains(.,'Advertise With Us')]", "Advertise With Us" );
		
		CheckElementVisibility("//a[contains(.,'Customer Service')]", "Customer Service" );
		
		CheckElementVisibility("//a[contains(.,'The Body')]", "The Body" );
		
		CheckElementVisibility("//a[contains(.,'The Body Pro')]", "The Body Pro" );
		
		CheckElementVisibility("//a[contains(.,'Berkeley Wellness')]", "Berkeley Wellness" );
	
		CheckElementVisibility("//a[contains(.,'Health Communities')]", "Health Communities" );
		
		CheckElementVisibility("//a[contains(.,'Health Central')]", "Health Central" );
		
		CheckElementVisibility("//a[contains(.,'Intelecare')]", "Intelecare" );
		
		CheckElementVisibility("//a[contains(.,'Mood 24/7')]", "Mood 24/7" );
	
		
	}
	@AfterClass(alwaysRun=true)
	public void tearDown(){
		driver.close();
		//killBrowser();
	}

	
	
	

    

	
}