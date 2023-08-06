package bookingSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GoIbibo {
  @Test
  public void GoIbiboTest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening MakeMyTrip", true);
	  driver.get("https://www.makemytrip.com/");
	  Thread.sleep(5000);
	  driver.close();
  }
}
