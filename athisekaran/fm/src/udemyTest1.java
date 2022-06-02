import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class udemyTest1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.get("http://www.airindia.in/online-booking-faqs.htm");
Thread.sleep(2000);
int links = driver.findElements(By.xpath("//a[@class='menuFirstNode']")).size();
System.out.println(links);
//driver.findElement(By.id("aMnu1")).click();
boolean returndate = driver.findElement(By.id("_retdateeu1")).isEnabled();
System.out.println(returndate);
driver.close();

}
}