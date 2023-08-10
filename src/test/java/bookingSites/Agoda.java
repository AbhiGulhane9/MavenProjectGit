package bookingSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Agoda {
  @Test
  public void BS_112AgodaTest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening Agoda", true);
	  driver.get("https://www.agoda.com/");
	  Thread.sleep(5000);
	  driver.close();
  }
}
