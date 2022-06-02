package google_testcase;

import google_pomrep.googlehp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testclass {
	
	public static WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.out.println("Setup initiated");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
  @Test
  public void headerlinks() {
	  //WebElement element = driver.findElement(By.xpath("//*[@id='hptl']/a[1]"));
	  googlehp.About(driver).click();
	  Reporter.log("RAJASEKAR");
  }
	  @DataProvider(name ="dp")
	    public String[][] dp() throws IOException{
		  for()
		  {
			  
		  }
		  
	        Td1 edata = new Td1();
	        String filePath = System.getProperty("user.dir")+"\\src\\testdata";
	        //objExcelFile.readExcel(filePath,"Tbook1.xlsx","Test1");
	        return edata.readExcel(filePath,"Tbook1.xlsx","Testa1");
	    }
  }
  
  
  
 
}
