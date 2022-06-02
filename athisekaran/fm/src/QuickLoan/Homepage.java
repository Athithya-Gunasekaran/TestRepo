package QuickLoan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.get("https://www.quickenloans.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
String title=driver.getTitle();
System.out.println(title);
String etitle="Quicken Loans | America’s Largest Mortgage Lender"; 
if(etitle.equals(title)){
	System.out.println("Test case is pass");
}
else{
	
	System.out.println("Test case is fail");
}

//WebElement logo =driver.findElement(By.xpath("/html/body/header/div/div/div[1]/a"));
//logo.click();
//String slogo=logo.getText();
//System.out.println(slogo);
//boolean blogo=logo.isDisplayed();
//System.out.println(blogo);
//WebElement search =driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[1]/div/a[1]/svg/path"));
//search.click();
WebElement lang =driver.findElement(By.linkText("Español"));
//lang.click();
String slang=lang.getText();
System.out.println(slang);
boolean blang=lang.isDisplayed();
System.out.println(blang);
WebElement num =driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/nav/ul/li[2]/span"));
String snum=num.getText();
System.out.println(snum);
boolean bnum=num.isDisplayed();
System.out.println(bnum);
//WebElement apply =driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/nav/ul/li[3]/a"));
//apply.click();
//driver.navigate().back();
//WebElement signin =driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/nav/ul/li[4]/a"));
//signin.click();
//driver.navigate().back();
WebElement lcenter =driver.findElement(By.xpath("/html/body/header/nav[1]/ul/li[1]/a"));
lcenter.click();





//driver.navigate().back();





}

}	


