package bookingSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RedBus {
  @Test
  public void RedbusTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","F:\\Browesrs Data and selelium app down\\chromedriver-win64\\chromedriver.exe" );
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening RedBus", true);
	  driver.get("https://www.redbus.in/");
	  Thread.sleep(3000);
	  driver.close();
	  
  }
}
