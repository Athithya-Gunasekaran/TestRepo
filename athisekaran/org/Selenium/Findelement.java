package org.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//Css selector by using id attribute
		//WebElement signup =driver.findElement(By.cssSelector("input#u_0_13"));
		//signup.sendKeys("asjfgrt");
		//Css selector by using  attribute	
		//WebElement signup =driver.findElement(By.cssSelector("input._6j mvm _6wk _6wl _58mi _3ma _6o _6v"));
		//WebElement email =driver.findElement(By.cssSelector("input[data-testid=royal_email]"));
		//email.sendKeys("anaam");
		//WebElement signup=driver.findElement(By.cssSelector("button[type=submit]"));
		//signup.click();
		//WebElement signup=driver.findElement(By.cssSelector("button#u_0_13"));
		//signup.click();
		//WebElement signup=driver.findElement(By.cssSelector("button._6j mvm _6wk _6wl _58mi _6o _6v"));
		//signup.click();*/
		//WebElement email =driver.findElement(By.id("login_form"));
		//String emaillabel=email.getText();
	//System.out.println("Emaillabel is present");
	//WebElement pass=driver.findElement(By.cssSelector("label#login_form"));
	//String password=pass.getText();
	//System.out.println("Password label is present");WebElement pass=driver.findElement(By.cssSelector("label#login_form"));
		//String password=pass.getText();
		
		//WebElement month=driver.findElement(By.xpath("//*[@id='month']"));
		//month.click();
		//WebElement monthd=driver.findElement(By.xpath("//*[@id='month']["@option value='8']"));
		//monthd.click();
		String hid=driver.getTitle();
		WebElement terms = driver.findElement(By.xpath("//*[@id='terms-link']"));
		terms.click();
		WebElement datap = driver.findElement(By.xpath("//*[@id='cookie-use-link']"));
		datap.click();
		Set<String> allwindows=driver.getWindowHandles();
		for(String win: allwindows)
		{
			if(driver.switchTo().window(win).getTitle().equals())
		}
	
		String curl=driver.getCurrentUrl();
		System.out.println(curl);
		driver.switchTo().window("https://www.facebook.com/");
		
		
		
		

	}
}
