package bookingSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class IRCTC {
  @Test
  public void IrctcTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","F:\\Browesrs Data and selelium app down\\chromedriver-win64\\chromedriver.exe" );
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening IRCTC", true);
	  driver.get("https://www.irctc.co.in");
	  Thread.sleep(3000);
	  driver.close();
  }
}
