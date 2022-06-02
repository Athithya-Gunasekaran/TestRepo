package org.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
WebDriver driver =new ChromeDriver();
driver.get("https://www.orbitz.com/");
driver.manage().window().maximize();  
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
String etitle =driver.getTitle();
System.out.println(etitle);
String atitle="Orbitz Flights, Cheap Vacations, Rental Cars & Hotel Deals";
if(atitle.equals(etitle)){
	System.out.println(" Test case is pass");
}
else{
	System.out.println(" Test case is fail");
	
}
WebElement rooms=driver.findElement(By.xpath("//*[@id='hotel-rooms-hp-hotel']"));
	rooms.click();
	Select lrooms=new Select(rooms);
	lrooms.selectByIndex(2);
	WebElement adults=driver.findElement(By.xpath("//*[@id='hotel-1-adults-hp-hotel']"));
	adults.click();
	Select ladults=new Select(adults);
	ladults.selectByValue("8");
	WebDriverWait wait=new WebDriverWait(driver,15);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='hotel-1-children-hp-hotel']")));
	
	WebElement cars=driver.findElement(By.xpath("//*[@id='tab-car-tab-hp']"));
	cars.click();
	
	WebElement date=driver.findElement(By.xpath("//*[@id='car-pickup-time-hp-car']"));
	date.click();
	Select cdate=new Select(date);
	
	List<WebElement> cd=cdate.getOptions();
	System.out.println(cd);
	for(WebElement cde: cd)
		System.out.println(cde.getText());
	
	
	
//	List<WebElement> links=driver.findElements(By.tagName("a"));
//	int li=links.size();
//	System.out.println(li);
//	for(WebElement l: links)
//		System.out.println(l.getAttribute("href"));
	
	
	
	
	
	
	
	}

}
