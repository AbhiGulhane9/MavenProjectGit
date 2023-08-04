package bookingSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Paytm {
  @Test
  public void Paytmtest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening Paytm", true);
	  driver.get("https://tickets.paytm.com/flights/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
