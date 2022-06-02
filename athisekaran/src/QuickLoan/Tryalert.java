package QuickLoan;

import java.util.concurrent.TimeUnit;





import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tryalert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://javascript.info/alert-prompt-confirm");
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement arrow =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[1]/div/div[1]/div[1]/a"));
		arrow.click();
		Alert sa = driver.switchTo().alert();
		String satext=sa.getText();
		System.out.println(satext);
		Thread.sleep(2500); 
		sa.dismiss();
        
	}

}
