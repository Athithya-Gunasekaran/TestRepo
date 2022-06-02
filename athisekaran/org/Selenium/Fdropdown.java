package org.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));//to click on month dd
		month.click();
		Select mnth = new Select(month);
		mnth.selectByVisibleText("Feb");
		List<WebElement> mn = mnth.getOptions();//to find the month list
		for (WebElement m : mn)
			System.out.println(m.getText());
		WebElement date=driver.findElement(By.xpath("//*[@id='day']"));// to click on date dd
		date.click();
		Select dte=new Select(date);
		dte.selectByVisibleText("17");
		List<WebElement> dt=dte.getOptions();//to find the date list
		System.out.println(dt);
		for(WebElement d:dt)
			System.out.println(d.getText());
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));//to click on year dd
		year.click();
		Select yr=new Select(year);
		yr.selectByValue("1986");
		List<WebElement> y=yr.getOptions();
		for(WebElement r:y)
			System.out.println(r.getText());
		
		

	}

}
