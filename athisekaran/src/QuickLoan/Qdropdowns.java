package QuickLoan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qdropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
WebDriver driver =new ChromeDriver();
driver.get("https://www.quickenloans.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
WebElement reference =driver.findElement(By.xpath("/html/body/header/nav[1]/ul/li[2]/a"));
reference.click();
//WebElement referenced =driver.findElement(By.xpath("/html/body/header/nav[1]/ul/li[2]/a/svg"));
//referenced.click();
//WebElement referenceg =driver.findElement(By.xpath("/html/body/header/nav[1]/ul/li[2]/ul/li[1]/a"));
//referenceg.click();
//driver.navigate().back();
//WebElement lypay =driver.findElement(By.xpath("/html/body/header/nav[1]/ul/li[2]/ul/li[2]/a"));
//lypay.click();
WebElement logo =driver.findElement(By.xpath("/html/body/header/div/div/div[1]/a"));
 String logoc=logo.getCssValue("color");
 System.out.println(logoc);
 String logof=logo.getCssValue("font");
 System.out.println(logof);
	}

}
