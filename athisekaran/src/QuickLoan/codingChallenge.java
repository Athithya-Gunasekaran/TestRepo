package QuickLoan;

import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class codingChallenge {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajekra.000\\eclipse-workspace\\athisekaran\\driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        WebElement username= driver.findElement(By.id("user-name"));
        username.click();
        String usercredential= driver.findElement(By.xpath("//*[text()='standard_user']")).getText();
       
       // System.out.println(usercredential);
        
        StringTokenizer str = new StringTokenizer(usercredential, "\n");
        String myUsername = null;
        
        while(str.hasMoreTokens())
        {
        	String userName = str.nextToken();
        	if(userName.endsWith("_user"))
        	{
        		myUsername = userName;
        		break;
        	}
        }
        
        System.out.println("My final eleigible user name is: " + myUsername);
        
        username.sendKeys(myUsername);
//        String usercredential= driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/br[3]")).getText();
//        System.out.println(usercredential);
     //   username.sendKeys(usercredential);
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
