package org.Selenium.Orbitz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Header {

	public static void main(String[] args) {
		
		try{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().window().maximize();
		String epagetitle= "Orbitz Flights, Cheap Vacations, Rental Cars & Hotel Deals";
        String apagetitle = driver.getTitle();
		if(apagetitle.equalsIgnoreCase(epagetitle))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		//WebElement link=driver.findElement(By.linkText("Sign up now, it's free!"));
		//link.click();
		
		//WebElement image=driver.findElement(By.id("header-logo"));
	// image.click();
		
	 //WebElement img=driver.findElement(By.id("rewardsHeader"));
	// img.click();
	 
	 //WebElement mlist=driver.findElement(By.id("header-history"));
	 //mlist.click();
	 
	// WebElement mtrip=driver.findElement(By.id("header-itineraries"));
	 //mtrip.click();
	 
	 //WebElement lang=driver.findElement(By.id("header-language-2058"));
	// lang.click();
	// driver.navigate().back();
	 //WebElement hotel=driver.findElement(By.id("primary-header-hotel"));
	 //hotel.click();
		
	// WebElement flights=driver.findElement(By.id("primary-header-flight"));
	// flights.click();
	// driver.navigate().back();
	 
	 //WebElement vpackage=driver.findElement(By.id("primary-header-package"));
	// vpackage.click();
	 
	 
	// WebElement car=driver.findElement(By.id("primary-header-car"));
	// car.click();
	 
	 
	// WebElement vrental=driver.findElement(By.id("primary-header-vacationRental"));
	// vrental.click();
		//WebElement cruise=driver.findElement(By.id("primary-header-cruise"));
		// cruise.click();
		//WebElement deals=driver.findElement(By.id("primary-header-deals"));
		// deals.click();
		// WebElement mobile=driver.findElement(By.id("primary-header-mobile"));
		// mobile.click();
		// WebElement tblog=driver.findElement(By.id("primary-header-travel_blog"));
		// tblog.click();
		// driver.navigate().back();
		// WebElement rewards=driver.findElement(By.id("primary-header-rewards"));
		// rewards.click();
		// driver.navigate().back();
			//WebElement ttdo=driver.findElement(By.id("tab-activity-tab-hp"));
			// ttdo.click();
		
		
	 //WebElement tabflight=driver.findElement(By.id("tab-flight-tab-hp"));
	 //tabflight.click();
		// WebElement thotel=driver.findElement(By.id("tab-hotel-tab-hp"));
		// thotel.click();
		 //WebElement goingto=driver.findElement(By.id("gcw-hotel-form-hp-hotel"));
		// goingto.click();
		 //WebElement dest=driver.findElement(By.id("hotel-destination-hp-hotel"));
		// dest.click();
		//WebElement month=driver.findElement(By.id("hotel-checkin-hp-hotel"));
		// month.click();
		// WebElement month1=driver.findElement(By.id("hotel-checkout-hp-hotel"));
		// month1.click();
//		WebElement car=driver.findElement(By.xpath("//*[@id='tab-car-tab-hp']/span[2]"));
//		String cartext=car.getText();
//		System.out.println(cartext);
		 
		// System.out.println(driver.findElement(By.xpath("//*[@id='tab-car-tab-hp']/span[2]")).getText());
	 
	// WebElement cruises =driver.findElement(By.xpath("//*[@id='primary-header-cruise']"));
	// boolean cruisesd=cruises.isDisplayed();
	 //System.out.println(cruisesd);
	 
	//// WebElement thingstd=driver.findElement(By.xpath("//*[@id='primary-header-activity']"));
	// thingstd.click();
	/* 
	 String thingstdurl=driver.getCurrentUrl();
	 System.out.println(thingstdurl);
	 WebElement thingstodo=driver.findElement(By.xpath("//*[@id='activity-tabs']/h1"));
	 String things=thingstodo.getText();
	 System.out.println(things);
	 boolean athings=thingstodo.isDisplayed();
	 System.out.println(athings);*/
	 
	 WebElement flights =driver.findElement(By.xpath("//*[@id='hotel-add-flight-checkbox-hp-hotel']"));
	 flights.click();
	boolean cflights=flights.isSelected();
	System.out.println(cflights);
	
	 
	 
	 
	 
	 
	 
	 
	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
