package org.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelinum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//C:\Users\rajekra.000\workspace\athisekaran\driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
			        // launch Fire fox and direct it to the Base URL
	      /*  driver.get("https://ui.freecrm.com/");

		
		String epagetitle = "Cogmento CRM";
		String apagetitle= driver.getTitle();
		if(epagetitle.equals(apagetitle))
		{
			System.out.println("TC1 is pass");
		}
		else{
			System.out.println("TC1 is fail");
			
		}*/
//		driver.get("https://ui.freecrm.com/");
//		driver.get("https://www.amazon.com/");
		
		
		driver.navigate().to("https://ui.freecrm.com/");
		driver.manage().window().maximize();
//		String eurl= "https://ui.freecrm.com/";
//		String aurl = driver.getCurrentUrl();
//		System.out.print("aurl"+aurl);
//		if(eurl.equals(aurl))
//		{
//			System.out.println("TC1 is pass");
//		}
//		else{
//			System.out.println("TC1 is fail");
//		}
		//driver.close();
		driver.navigate().back();
		driver.navigate().to("https://www.Amazon.com/");
		driver.navigate().to("https://www.Google.com/");
		
		driver.quit();
	}
}
