package QuickLoan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class QaClickAcademy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		/*
	// Find the total links on the page	
		System.out.println(driver.findElements(By.tagName("a")).size());
	// Find the footer links
		WebElement footer= driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		System.out.println(footer.findElements(By.tagName("a")).size());
	// Find the links under particular column under the footer section
		WebElement contactinfo= footer.findElement(By.xpath("//table/tbody/tr/td[3]/ul"));
		System.out.println(contactinfo.findElements(By.tagName("a")).size());
	// Click on each link in the column and check if the pages are open
		
		for(int i =1;i<contactinfo.findElements(By.tagName("a")).size();i++)
			
		{
			String clickOnLinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
			contactinfo.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);;
			
		}
		
		*/
		driver.findElement(By.id("checkBoxOption2")).click();
		String value = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(value);
		Thread.sleep(2000);
		WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
         Select s = new Select(dropdown);
         s.selectByVisibleText(value);
	
		
		driver.findElement(By.id("name")).sendKeys(value);
		Thread.sleep(2000); 
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		
		
	}

}
