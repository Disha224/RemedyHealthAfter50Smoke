package remedy.health;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class AboutUs extends RemedySharedFunctions {
  @Test
  public void CheckAboutUs() throws InterruptedException {
	  TestAboutUs();
	  RemedySharedFunctions.GlobalHeader();
	  RemedySharedFunctions.GlobalFooter();
  }
  
 public void TestAboutUs() throws InterruptedException
 {
	
	 RemedySharedFunctions.ScrollDown_Click("//a[contains(text(),'About Us')]");
	 RemedySharedFunctions.CheckElementVisibility("//h1[contains(text(),'About Us')]", "About Us");
	 RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/header/div/div/div/p[2]");
	 System.out.println("The first para is visible");
	 RemedySharedFunctions.CheckElementVisibility("//span[contains(text(),'Our Editorial Staff')]", "OUR EDITORIAL STAFF");
	 RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/section[1]/div/div[1]/div");
	 System.out.println("The  para under editorial stuff is visible");
	 RemedySharedFunctions.CheckElementVisibility("//span[contains(text(),'Our Board of Advisers')]", "OUR BOARD OF ADVISERS");
	 RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/section[2]/div/div[1]/div");
	 System.out.println("The  para under board of stuffs is visible");
	 RemedySharedFunctions.CheckElementVisibility("//span[contains(text(),'Health and Medical Advice Disclaimer')]", "HEALTH AND MEDICAL ADVICE DISCLAIMER");
	 RemedySharedFunctions.verifyElementVisibility(".//*[@id='main']/section[3]/div/div[1]/div");
	 System.out.println("The  para under medical advice disclaimer is visible");
	 
	 
 }
 

}
