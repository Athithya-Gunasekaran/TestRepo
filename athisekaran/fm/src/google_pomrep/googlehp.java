package google_pomrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlehp {
	

	public static WebElement About(WebDriver driver) {
		System.out.println("asdasd");
		WebElement element = driver.findElement(By.xpath("//*[@id='hptl']/a[1]"));
		return element;

	}

}
