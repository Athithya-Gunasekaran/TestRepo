package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyOfFreecrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		String apagetitle="Cogmento CRM";
		String epagetitle= driver.getTitle();
		if(epagetitle.equalsIgnoreCase(apagetitle))
		{
			System.out.println("Test is pass");	
		}
		else{
			System.out.println("Test is fail");
		}
		
		 driver.manage().window().maximize();
		 
		//Locating web element by name attribute
		
		//WebElement email= driver.findElement(By.name("email"));
		//email.sendKeys("athi@gmail.com");
		

		//WebElement pwd=driver.findElement(By.name("password"));
		//pwd.sendKeys("ngtfgh");
		
		
		//Locating web element by class name attribute
		//WebElement button=driver.findElement(By.cssSelector("div.ui fluid large blue submit button"));
		//button.click();
		
		
		//Locating web element by linkText attribute
//WebElement fplink=driver.findElement(By.linkText("Forgot your password?"));
//fplink.click();
		//WebElement link=driver.findElement(By.linkText("Classic CRM"));
		//link.click();
		
	//WebElement link=driver.findElement(By.linkText("Sign Up"));
		//link.click();
		
		//Locating web element by partialLinkText attribute
		//WebElement link=driver.findElement(By.partialLinkText("Classic"));
		//link.click();
		
		WebElement link=driver.findElement(By.partialLinkText("Sign"));
		link.click();
        driver.manage().window().maximize();
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("Athi@gmail.com");
		
		WebElement phone= driver.findElement(By.id("phone_number"));
		phone.sendKeys("12344466");
		
		WebElement checkbox= driver.findElement(By.id("terms"));
		checkbox.click();
		
		//WebElement rcheckbox= driver.findElement(By.className("recaptcha-checkbox-border"));
		//rcheckbox.click();
		
		WebElement signup=driver.findElement(By.name("action"));
		signup.click();
		
		//WebElement label= driver.findElement(By.id("recaptcha-anchor-label"));
		//label.isDisplayed();
		
		WebElement verify=driver.findElement(By.linkText(" Got an account? Log in here"));
		verify.click();
		
		
		
		
		
	}

}
