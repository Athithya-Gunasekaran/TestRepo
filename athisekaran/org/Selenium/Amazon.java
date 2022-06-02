package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.com/");

		WebElement signin =driver.findElement(By.className("nav-action-inner"));
		signin.sendKeys("asjfgrt");
		

	}

}
