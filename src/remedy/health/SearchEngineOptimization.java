package remedy.health;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class SearchEngineOptimization extends RemedySharedFunctions{
  @Test
  public void TestSearchEngine() throws InterruptedException {
	  CheckSearchEngine();
  }
  public void CheckSearchEngine() throws InterruptedException {
	  RemedySharedFunctions.SEO("Allergies");

  }


}
