package QuickLoan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("i.icon.ir.datePicker")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
		Thread.sleep(2000);
		
		 WebElement adultdropdown = driver.findElement(By.id("Adults"));
		 adultdropdown.click();
		 Thread.sleep(2000);
		 Select adults = new Select(adultdropdown);
		 adults.selectByValue("3");
		 
		 
		 WebElement childrendropdown = driver.findElement(By.id("Childrens"));
		 childrendropdown.click();
		 Select children = new Select(childrendropdown);
		 children.selectByValue("2");
		 Thread.sleep(2000);
		 driver.findElement(By.id("MoreOptionsLink")).click();
		 driver.findElement(By.id("AirlineAutocomplete")).sendKeys("asdggfjhjgh");
		 Thread.sleep(2000);
		 driver.findElement(By.id("SearchBtn")).click();
		 Thread.sleep(2000);
		 String errormessage = driver.findElement(By.id("homeErrorMessage")).getText();
		 System.out.println(errormessage);
		 
		 driver.close();
		
	

	}

}
