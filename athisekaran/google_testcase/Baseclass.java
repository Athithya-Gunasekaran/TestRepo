package google_testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Baseclass {
	public static WebDriver driver;
	
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");	  
  }
  @AfterMethod
  public void teardown(){
	  driver.quit();
  }
}
