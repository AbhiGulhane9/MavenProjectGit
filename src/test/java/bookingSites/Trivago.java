package bookingSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Trivago {
  @Test
  public void TrivagoTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","F:\\Browesrs Data and selelium app down\\chromedriver-win64\\chromedriver.exe" );
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening Trivago", true);
	  driver.get("https://www.trivago.in/");
	  Thread.sleep(5000);
	  driver.close();
	  
  }
}
