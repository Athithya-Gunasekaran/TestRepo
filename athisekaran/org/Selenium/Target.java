package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		//WebElement image=driver.findElement(By.xpath("//svg[@focusable='false'][@width='24'][@xmlns='http://www.w3.org/2000/svg']"));
				//image.click();
	WebElement img=driver.findElement(By.id("home"));
	img.click();
	WebElement link=driver.findElement(By.linkText("Same Day Delivery"));
	link.click();
	driver.navigate().back();
	WebElement search=driver.findElement(By.cssSelector("input#search"));
	search.sendKeys("diaper");
	//WebElement ex=driver.findElement(By.cssSelector("div#headerMain"));
	//ex.click();
	WebElement ex=driver.findElement(By.id("headerMain"));
	ex.click();
	
	

}
	}
