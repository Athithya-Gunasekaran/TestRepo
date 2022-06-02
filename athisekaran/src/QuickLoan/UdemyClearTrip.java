package QuickLoan;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class UdemyClearTrip {

	//private static final WebElement  = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\workspace\\athisekaran\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		//driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	// ***AutoSuggestive Dropdown***
		
		WebElement country=driver.findElement(By.id("autocomplete"));
		country.click();
		country.sendKeys("Uni");
		Thread.sleep(2000);
		
		List<WebElement> options= driver.findElements(By.xpath("//input[@class='inputs ui-autocomplete-input']"));
		System.out.println("Options displayed");
		System.out.println(options.size());
		
		for(WebElement option:options)
		{
		if(option.getText().equalsIgnoreCase("United States (USA)"))
			
			
		{
			
			option.click();
			break;
			
		}
		
		
		
		
		
		}
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
	/*	
	// ***Table Grid***	
		
		
	 List<WebElement> rows= driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr"));
	 int rowcount= rows.size();
	 System.out.println(rowcount);
	 
	 List<WebElement> columns= driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr/th"));
	 int columncount= columns.size();
	 System.out.println(columncount);
	 
	WebElement instructor= driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr[3]/td[1]"));
	String value1= instructor.getText();
	System.out.println("Instructor:" + value1 );
	 
	WebElement course= driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr[3]/td[2]"));
	String value2= instructor.getText();
	System.out.println("Course:" + value2 );
	
	WebElement price= driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr[3]/td[3]"));
	String value3= instructor.getText();
	System.out.println("Price:" + value3 );
		
		//List<WebElement> tablevalues= (driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")));
		//System.out.println(tablevalues);
		 
		 */

		/*
		 //** Sum of table values**
		List<WebElement> values= (driver.findElements(By.xpath("//div[@class= 'left-align']/fieldset/table[@id='product']/tbody/tr/td[3]")));
		//System.out.println(values);
		int sum=0;
		
		for(int i=0; i<values.size();i++)
		{
			System.out.println(values.get(i).getText());
			sum= sum+ Integer.parseInt(values.get(i).getText());
			System.out.println(sum);
			
		}
			*/	
			
		
		
		
		/*
		 // ** Window handling**
		 
		
		WebElement mw= driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
		mw.click();

		Thread.sleep(1000);
		WebElement clickhere= driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		
		
		//Window handling
		Set<String> windows= driver.getWindowHandles();//parent window, child window
		 Iterator<String> it= windows.iterator();
		 String parent=it.next();
		 String child=it.next();
		 driver.switchTo().window(child);
		 
		 //Child window title check
		 String expectedtitle= "https://the-internet.herokuapp.com/windows/new";
		 String childtitle=driver.getTitle();
		 System.out.println(childtitle);
		if(childtitle==expectedtitle) {
			
		System.out.println("Status: In right Child Window");
		
		}
		 
		 WebElement childtext=driver.findElement(By.cssSelector(".example"));
		 String text= childtext.getText();
		 System.out.println(text);
         
		 driver.switchTo().window(parent);
		 WebElement parenttext= driver.findElement(By.xpath("//div[@id='content']/div/h3"));
		 String maintext= parenttext.getText(); 
		 System.out.println(maintext);
		 driver.close();
			
			*/
		
	
		
	/*	
	 // ** Explicit Wait**
		//username
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("rahulshettyacademy");
		
		//password
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("learning");
		
		//radiobutton
		WebElement user= driver.findElement(By.xpath("(//span[@class='checkmark'])[2]"));
		user.click();
		
		
		//Explicit wait
		WebDriverWait w= new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("okayBtn")))).click();
		
		//dd
		WebElement dd = driver.findElement(By.xpath("//select[@class='form-control']"));
		dd.click();
		Select consultant= new Select(dd);
		consultant.selectByValue("consult");
		
		//checkbox
		WebElement checkbox= driver.findElement(By.id("terms"));
		checkbox.click();
		
		//Signin
		WebElement signin= driver.findElement(By.id("signInBtn"));
		signin.click();
		
		WebDriverWait wt= new WebDriverWait(driver, 10);
		
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++)

		{

		products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();
		
		
		Thread.sleep(1000);
		System.out.println("Product added");
		driver.close(); */
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	
		//Name
		WebElement name= driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Robinson");
		Thread.sleep(1000);
		
		WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Robinson@gmail.com");
		Thread.sleep(1000);
		
		WebElement password= driver.findElement(By.xpath("//input[@id='exampleInputPassword1']"));
		password.sendKeys("abcdef");
		Thread.sleep(1000);
		
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='exampleCheck1']"));
		checkbox.click();
		Thread.sleep(1000);
		
		WebElement dd= driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		dd.click();
		Thread.sleep(1000);
		
		Select dd1= new Select(dd);
		dd1.selectByVisibleText("Male");
		Thread.sleep(1000);
		
		WebElement radiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radiobutton.click();
		Thread.sleep(1000);
		
		WebElement date= driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
		date.sendKeys("12-34-6575");
		Thread.sleep(1000);
	
		WebElement submit= driver.findElement(By.xpath("//input[@class='btn btn-success']"));
		submit.click();
		
		Thread.sleep(1000);
		
		String msg=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println(msg);
		*/
		
		
	
		
		
		
		
		
		
		
		
		
		
		/*driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//WebElement calender = driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected DayPicker-Day--today']"));
		//calender.click();
		
		WebElement adult= driver.findElement(By.xpath("(//Select[@class='bc-neutral-100 bg-transparent'])[1]"));
		adult.click();
		Select adults= new Select(adult);
		adults.selectByValue("3");
		Thread.sleep(2000);
		
		WebElement children= driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[2]"));
		children.click();
		Select childrendd= new Select(children);
		childrendd.selectByValue("6");
		Thread.sleep(2000);
		
		WebElement infant= driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[3]"));
		infant.click();
		Select infantdd= new Select(infant);
		infantdd.selectByValue("2");
		Thread.sleep(2000);
		
		WebElement search= driver.findElement(By.xpath("//button[text()='Search flights']"));
		search.click();
		String errorMsg= driver.findElement(By.xpath("//span[text()='Select Departure and Arrival airports/cities.']")).getText();
		System.out.println(errorMsg);
		driver.close();
		
		*/
		

}


}

