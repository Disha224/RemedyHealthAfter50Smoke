package remedy.health;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class SharedControls extends RemedySharedFunctions {
  @Test
  public void TestSharedControls() throws InterruptedException {
	  CheckSharingControls();
  }
  
  public void CheckSharingControls() throws InterruptedException
  {
  	RemedySharedFunctions.SharingControls();
  }
 

}
