package QuickLoan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Atep 1");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\eclipse-workspace\\athisekaran\\driver\\chromedriver.exe" );
		
		//ChromeOptions options = new ChromeOptions();
		//options.setProxy(null);
		
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome criver loaded");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		System.out.println("Page opened");
		Thread.sleep(1000);
        String books= gettext(driver);
		driver.findElement(By.xpath("//a[text()='Registry']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(books);
		Thread.sleep(1000);
		driver.findElement(By.className("nav-search-submit")).click();
		Thread.sleep(1000);
		driver.close();
		driver.quit();
		
		

		//img[contains(@src,'https://images-na.ssl-images-amazon.com/images/G/01/gno/sprites/nav-sprite-global-1x-hm-dsk-reorg._CB405937547_.png')]
		////div[@class='gr-header gr-header--xxsm gr-find-stripe__header aok-inline-block']
		//Actions a= new Actions(driver);
		//a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		}
	
	
	public static String gettext(WebDriver driver) // method to grab text and parse the string in Java using split
	{
		driver.get("https://www.amazon.com/");
		System.out.println("Page opened");
		driver.findElement(By.xpath("//a[text()='Registry']")).click();
		String registrytext= driver.findElement(By.xpath("//div[@class='gr-header gr-header--xxsm gr-find-stripe__header aok-inline-block']")).getText();
	    System.out.println(registrytext);
	    String[] registryarray= registrytext.split(" ");
	    String password= registryarray[1];
	    return password;

	  
	    
	}

}
