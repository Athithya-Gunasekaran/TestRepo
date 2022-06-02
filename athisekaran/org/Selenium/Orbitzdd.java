package org.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orbitzdd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.orbitz.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    WebElement cruise = driver.findElement(By.xpath("//*[@id='primary-header-cruise']"));
    cruise.click();
    
    WebElement sdestn = driver.findElement(By.xpath("//*[@id='cruise-destination-cruiselp']"));
    sdestn.click();
    Select sd=new Select(sdestn);
    sd.selectByVisibleText("Mexico");
   List<WebElement>   sdm    =sd.getOptions();
   for(WebElement w : sdm)
	   System.out.println(w.getText());
   
 List<WebElement> links  =driver.findElements(By.tagName("a"));
 int li=links.size();
 System.out.println(li);
 for(WebElement we : links)
	 System.out.println(we.getAttribute("href"));
 
 
	 
   
   
    
	}

}
