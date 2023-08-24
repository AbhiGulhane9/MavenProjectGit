package bookingSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Paytm {
  @Test
  public void Paytmtest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","F:\\Browesrs Data and selelium app down\\chromedriver-win64\\chromedriver.exe" );
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening Paytm", true);
	  driver.get("https://paytm.com/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
