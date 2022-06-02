package QuickLoan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Herokuapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

	}

}
