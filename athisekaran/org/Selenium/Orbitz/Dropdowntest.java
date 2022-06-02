package org.Selenium.Orbitz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowntest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
driver.manage().window().maximize();
WebElement countrydd=driver.findElement(By.id("country"));
Select s = new Select(countrydd);
//s.selectByIndex(5);
//List<WebElement> l=;
//for(int i=0; i<l.size();i++){
	System.out.println(s.);
//System.out.println(l.size());
	
}



	}

}