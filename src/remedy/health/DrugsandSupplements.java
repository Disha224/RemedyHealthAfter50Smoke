package remedy.health;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class DrugsandSupplements extends RemedySharedFunctions {
  @Test
  public void TestDrugsandSpplements () throws InterruptedException {
	  
	  CheckDrugsandSupplements();
	  
  }
  
  public void CheckDrugsandSupplements() throws InterruptedException
  {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='banner']/div/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='menu']/ul[1]/li[2]/a")).click();
	 


	
	  RemedySharedFunctions.GlobalHeader();
	  RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/h1", "Drugs and Supplements");
		RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[1]/h2/a", "SUPPLEMENTS");
		RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[3]/h2/a", "PRESCRIPTION");
		RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[2]/h2/a", "OVER THE COUNTER");

	List<WebElement> headerfirstpage = (List<WebElement>) driver.findElements(By.xpath("//h3[@class='post-summary-title']/a"));
	int headercount = headerfirstpage.size();
	System.out.println( "The number of articles displayed on this page are " + headercount);
			  for(int i = 0; i < headercount; ++i) {
			       
				  
			      if(  ( headerfirstpage.get(i).isDisplayed()==true))
			       {
			    	   
			    	  System.out.println("The first page's headers are visible");
			    	   
			    	  
			    	   
			       }
			       else
			       {
			    	   System.out.println("The first page's headers are not visible");
			       }
			       
			    
			      
			       
			  }
			  RemedySharedFunctions.GlobalFooter();
			  driver.findElement(By.linkText("Next")).click();
			  
			  RemedySharedFunctions.GlobalHeader();
			  RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/h1", "Drugs and Supplements");
				RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[1]/h2/a", "SUPPLEMENTS");
				RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[3]/h2/a", "PRESCRIPTION");
				RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[2]/h2/a", "OVER THE COUNTER");
				List<WebElement> headersecondpage = (List<WebElement>) driver.findElements(By.xpath("//h3[@class='post-summary-title']/a"));
				int headercount2 = headersecondpage.size();
				System.out.println( "The number of articles displayed on this page are " + headercount2);
						  for(int i = 0; i < headercount2; ++i) {
						       
							  
						      if(  ( headersecondpage.get(i).isDisplayed()==true))
						       {
						    	   
						    	  System.out.println("The second page's headers are visible");
						    	   
						    	  
						    	   
						       }
						       else
						       {
						    	   System.out.println("The second page's headers are not visible");
						       }
						       
						    
						      
						       
						  } 
						  RemedySharedFunctions.GlobalFooter();
						  driver.findElement(By.linkText("Next")).click();
						  RemedySharedFunctions.GlobalHeader();
						  RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/h1", "Drugs and Supplements");
							RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[1]/h2/a", "SUPPLEMENTS");
							RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[3]/h2/a", "PRESCRIPTION");
							RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[2]/h2/a", "OVER THE COUNTER");
							List<WebElement> headerthirdpage = (List<WebElement>) driver.findElements(By.xpath("//h3[@class='post-summary-title']/a"));
							int headercount3 = headerthirdpage.size();
							System.out.println( "The number of articles displayed on this page are " + headercount3);
									  for(int i = 0; i < headercount3; ++i) {
									       
										  
									      if(  ( headerthirdpage.get(i).isDisplayed()==true))
									       {
									    	   
									    	  System.out.println("The third page's headers are visible");
									    	   
									    	  
									    	   
									       }
									       else
									       {
									    	   System.out.println("The third page's headers are not visible");
									       }
									       
									    
									      
									       
									  }
									  RemedySharedFunctions.GlobalFooter();
									  driver.findElement(By.linkText("Next")).click();
					RemedySharedFunctions.GlobalHeader();
					RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/h1", "Drugs and Supplements");
					RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[1]/h2/a", "SUPPLEMENTS");
					RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[3]/h2/a", "PRESCRIPTION");
					RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[2]/h2/a", "OVER THE COUNTER");
					List<WebElement> headerfourthpage = (List<WebElement>) driver.findElements(By.xpath("//h3[@class='post-summary-title']/a"));
				    int headercount4 = headerfourthpage.size();
					System.out.println( "The number of articles displayed on this page are " + headercount4);
						for(int i = 0; i < headercount4; ++i) {
												       
													  
							if(  ( headerfourthpage.get(i).isDisplayed()==true))
									{
												    	   
										 System.out.println("The fourth page's headers are visible");
												    	   
												    	  
												    	   
									}
									else
									{
										  System.out.println("The fourth page's headers are not visible");
												       
									}
												       
												    
												      
												       
									}
						RemedySharedFunctions.GlobalFooter();
						driver.findElement(By.linkText("Next")).click();
						RemedySharedFunctions.GlobalHeader();
						RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/h1", "Drugs and Supplements");
						RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[1]/h2/a", "SUPPLEMENTS");
						RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[3]/h2/a", "PRESCRIPTION");
						RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[2]/h2/a", "OVER THE COUNTER");
						List<WebElement> headerfifthpage = (List<WebElement>) driver.findElements(By.xpath("//h3[@class='post-summary-title']/a"));
						int headercount5 = headerfifthpage.size();
						System.out.println( "The number of articles displayed on this page are " + headercount5);
								for(int i = 0; i < headercount5; ++i) {
															       
																
									if(  ( headerfifthpage.get(i).isDisplayed()==true))
												{
															    	   
														System.out.println("The fifth page's headers are visible");
															    	   
															    	  
															    	   
												}
									else
												{
													    System.out.println("The fifth page's headers are not visible");
															       
												}
															       
															    
															      
															       
															  }
						RemedySharedFunctions.GlobalFooter();
						driver.findElement(By.linkText("Next")).click();
						RemedySharedFunctions.GlobalHeader();
						RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/h1", "Drugs and Supplements");
						RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[1]/h2/a", "SUPPLEMENTS");
						RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[3]/h2/a", "PRESCRIPTION");
						RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[2]/h2/a", "OVER THE COUNTER");
						List<WebElement> headersixthpage = (List<WebElement>) driver.findElements(By.xpath("//h3[@class='post-summary-title']/a"));
						int headercount6 = headersixthpage.size();
						System.out.println( "The number of articles displayed on this page are " + headercount6);
							for(int i = 0; i < headercount6; ++i) {
																		       
																			  
								if(  ( headersixthpage.get(i).isDisplayed()==true))
											{
																		    	   
													 System.out.println("The sixth page's headers are visible");
																		    	   
																		    	  
																		    	   
											}
																		       
								
							             else
																		       
							             {
																		    	   
							            	 System.out.println("The sixth page's headers are not visible");
										
							             
							             }
																		       
																		    
																		      
																		       
										}
							RemedySharedFunctions.GlobalFooter();
							driver.findElement(By.linkText("Next")).click();
							RemedySharedFunctions.GlobalHeader();
							RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/h1", "Drugs and Supplements");
							RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[1]/h2/a", "SUPPLEMENTS");
							RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[3]/h2/a", "PRESCRIPTION");
							RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[2]/h2/a", "OVER THE COUNTER");
							 List<WebElement> headerseventhpage = (List<WebElement>) driver.findElements(By.xpath("//h3[@class='post-summary-title']/a"));
							int headercount7 = headerseventhpage.size();
							System.out.println("The number of articles displayed on this page are " + headercount7);
							for(int i = 0; i < headercount7; ++i) {
																		       
																			  
							if(  ( headerseventhpage.get(i).isDisplayed()==true))
									{
																		    	   
										System.out.println("The seventh page's headers are visible");
																		    	   
																		    	  
																		    	   
									}
								   else
								   {
																		    	   
									   
									 System.out.println("The seventh page's headers are not visible");
																		       
								   }
							}
							RemedySharedFunctions.GlobalFooter();
							driver.findElement(By.linkText("Next")).click();
							RemedySharedFunctions.GlobalHeader();
							RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/h1", "Drugs and Supplements");
							RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[1]/h2/a", "SUPPLEMENTS");
							RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[3]/h2/a", "PRESCRIPTION");
							RemedySharedFunctions.CheckElementVisibility(".//*[@id='main']/header/div/div/div/ul/li[2]/h2/a", "OVER THE COUNTER");
							  List<WebElement> headereighthpage = (List<WebElement>) driver.findElements(By.xpath("//h3[@class='post-summary-title']/a"));
								int headercount8 = headereighthpage.size();
								System.out.println( "The number of articles displayed on this page are " + headercount8);
										  for(int i = 0; i < headercount8; ++i) {
										       
											  
										      if(  ( headereighthpage.get(i).isDisplayed()==true))
										       {
										    	   
										    	  System.out.println("The eight page's headers are visible");
										    	   
										    	  
										    	   
										       }
										       else
										       {
										    	   System.out.println("The eight page's headers are not visible");
										       }
										       
										    
										      
										       
										  }		  
													
													  
													  
																					       
																					    
																					      
																					       
																					  
							                  
											                                        
																								  
									}
 

}
