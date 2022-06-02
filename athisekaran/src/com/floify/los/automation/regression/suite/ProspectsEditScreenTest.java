package com.floify.los.automation.regression.suite;

import java.io.File;
import java.io.FileWriter;
import java.time.Duration;
import java.time.Instant;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.floify.los.automation.regression.util.UIMap;
import com.github.javafaker.Faker;

public class ProspectsEditScreenTest {

	private UIMap uimap;
	private UIMap datafile;
	private String workingDir;
	public static void main(String[] args) throws Exception {
		
		String startId = args[0];
		String count = args[1];
		
		String startId2 = args[2];
		String count2 = args[3];
		
		String startId3 = args[4];
		String count3 = args[5];
		
		String startId33 = args[6];
		String count33 = args[7];
		
		String startId4 = args[8];
		String count4 = args[9];
		
		String startId5 = args[10];
		String count5 = args[11];
		
		String startId6 = args[12];
		String count6 = args[13];
		
		String startId7 = args[14];
		String count7 = args[15];
		
		String startId8 = args[16];
		String count8 = args[17];
		
		String startId9 = args[18];
		String count9 = args[19];
		
		
		ProspectsEditScreenTest flofiyLOS = new ProspectsEditScreenTest();
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		//
		
		 System.setProperty("webdriver.chrome.silentOutput", "true");
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		executorService.execute(new Runnable() {
		    public void run() {
		    	try {
		    		
					flofiyLOS.enroll(Integer.parseInt(startId), Integer.parseInt(count));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		});
		
		executorService.execute(new Runnable() {
		    public void run() {
		    	try {
		    		
					flofiyLOS.enroll(Integer.parseInt(startId2), Integer.parseInt(count2));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		});
		
		executorService.execute(new Runnable() {
		    public void run() {
		    	try {
		    		
					flofiyLOS.enroll(Integer.parseInt(startId3), Integer.parseInt(count3));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		});
		
		executorService.execute(new Runnable() {
		    public void run() {
		    	try {
		    		
					flofiyLOS.enroll(Integer.parseInt(startId33), Integer.parseInt(count33));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		});
		
		executorService.execute(new Runnable() {
		    public void run() {
		    	try {
		    		
					flofiyLOS.enroll(Integer.parseInt(startId4), Integer.parseInt(count4));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		});
		
		executorService.execute(new Runnable() {
		    public void run() {
		    	try {
		    		
					flofiyLOS.enroll(Integer.parseInt(startId5), Integer.parseInt(count5));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		});
		
		executorService.execute(new Runnable() {
		    public void run() {
		    	try {
		    		
					flofiyLOS.enroll(Integer.parseInt(startId6), Integer.parseInt(count6));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		});
		
		executorService.execute(new Runnable() {
		    public void run() {
		    	try {
		    		
					flofiyLOS.enroll(Integer.parseInt(startId7), Integer.parseInt(count7));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		});
		
		executorService.execute(new Runnable() {
		    public void run() {
		    	try {
		    		
					flofiyLOS.enroll(Integer.parseInt(startId8), Integer.parseInt(count8));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		});
		
		executorService.execute(new Runnable() {
		    public void run() {
		    	try {
		    		
					flofiyLOS.enroll(Integer.parseInt(startId9), Integer.parseInt(count9));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		});

		executorService.shutdown();
		
		
		//flofiyLOS.doLogin();
	//	flofiyLOS.navigateToProspectsLink();
	//flofiyLOS.openFirstProspectsEditDetailsPage();
	//flofiyLOS.fillBorrowerPersonalInfo();
//		flofiyLOS.fillCoBorrowerPersonalInfo();
//		flofiyLOS.fillAssetInfo();
//		flofiyLOS.fillRealEstateInfo();
//		flofiyLOS.fillAssetInfo();
//		flofiyLOS.close();
	}
	

	private void enroll(int startId, int endId) throws Exception {
		Instant outerTimeStart = Instant.now();
		Faker faker = new Faker();
		 WebDriver driver = initialize();
		 StringBuilder sbr = new StringBuilder();
		 UUID uuid = UUID.randomUUID();
		 File myObj = new File(uuid.toString()+".csv");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	      FileWriter myWriter = new FileWriter(myObj);
		for(int i=startId;i<=endId;i++)
		{
			try {
				driver.navigate().to("https://programs.commerce.maryland.gov/ReliefRegistration");
				Instant start = Instant.now();
				String firstName = faker.name().firstName();
				WebElement Username_field= driver.findElement(uimap.getLocator("Username_field"));
				Username_field.sendKeys(firstName +Integer.toString(i));
			
				WebElement FirstName_field= driver.findElement(uimap.getLocator("FirstName_field"));
				FirstName_field.sendKeys(firstName);
				
				WebElement LastName_field= driver.findElement(uimap.getLocator("LastName_field"));
				LastName_field.sendKeys(faker.name().lastName());
			
				WebElement Email_field= driver.findElement(uimap.getLocator("Email_field"));
				Email_field.sendKeys("stsample.test0000+"+i+"@gmail.com");
				
				
				Instant onlyReqStart = Instant.now();
				
				WebElement checkbox= driver.findElement(uimap.getLocator("Login_button"));
				checkbox.click();
				
				Instant finish = Instant.now();
				long timeElapsed = Duration.between(start, finish).toMillis();
				
				Instant onlyReqStop = Instant.now();
				long timeElapsedOnly = Duration.between(onlyReqStart, onlyReqStop).toMillis();

				sbr.append(timeElapsedOnly + "ms,"+firstName +Integer.toString(i) + ","+timeElapsed+","+start+","+finish+","+ driver.findElement(By.id("ctl00_ctl35_g_9a8e4873_600b_498f_a641_31418a7142f5_FBACreateUserWizard_CompleteStepContainer_CompleteSuccess")).getText()+"\n");
				
			}
			catch(Exception ex)
			{
				System.out.println("Error, " +ex.getMessage());
			}
			
			
			
		}
		
		 myWriter.write(sbr.toString());
	      myWriter.close();
		driver.close();
		driver.quit();
		Instant outerTimeEnd = Instant.now();
		long timeElapsed = Duration.between(outerTimeStart, outerTimeEnd).toMillis();
		System.out.println(Thread.currentThread().getName() + "ms,"+outerTimeStart+","+outerTimeEnd+","+timeElapsed);
		
	}


//	private void close() {
//		driver.close();		
//	}
//
//
//	private void fillRealEstateInfo() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	private void fillAssetInfo() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	private void fillCoBorrowerPersonalInfo() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	private void fillBorrowerPersonalInfo() {
//		driver.findElement(By.id("borrower.personalInfo.legalFullName.firstName")).sendKeys("DONALD");
//		driver.findElement(By.id("borrower.personalInfo.legalFullName.lastName")).sendKeys("TRUMP");
//		System.out.println("Data Validation 1:"+ driver.findElement(By.id("borrower.personalInfo.legalFullName.firstName")).getText());
//		System.out.println("Data Validation 2:"+ driver.findElement(By.id("borrower.personalInfo.legalFullName.firstName")).getAttribute("value"));
//
//		Actions actions = new Actions(driver);
//		actions.moveToElement(driver.findElement(By.id("borrower.personalInfo.legalFullName.lastName"))).perform();
//	}
//	
//
//	private void openFirstProspectsEditDetailsPage() {
//		 driver.findElement(By.xpath("//a[@href='/prospects/1003?id=1113113']")).click();
//	}
//
//	private void navigateToProspectsLink() {
//		 driver.findElement(By.xpath("//a[@href='/prospects']")).click();
//	}
//
//	private void doLogin() throws Exception {
//		WebElement loginname= driver.findElement(uimap.getLocator("Username_field"));
//		loginname.sendKeys(datafile.getData("Username_field"));
////		
//		WebElement password= driver.findElement(uimap.getLocator("Password_field"));
//		password.sendKeys(datafile.getData("Password_field"));
////		
//		WebElement checkbox= driver.findElement(uimap.getLocator("Login_button"));
//		checkbox.click();
//		
//		WebElement firstPage= driver.findElement(uimap.getLocator("First_Page"));
//		firstPage.click();
//		
//		WebElement secondPage= driver.findElement(uimap.getLocator("second_page"));
//		secondPage.click();
//		
//		WebElement individualInvetor= driver.findElement(uimap.getLocator("individual_investor"));
//		individualInvetor.click();
//		
//		WebElement nameOfApplicant= driver.findElement(uimap.getLocator("nameOfApplicant"));
//		nameOfApplicant.sendKeys(datafile.getData("nameOfApplicant"));
//		
////		WebElement accountField= driver.findElement(uimap.getLocator("Account_field"));
////		System.out.println("Account name:"+ accountField.getText());
////		
////		if(datafile.getData("Username_field").equals(accountField.getText()))
////		{
////			System.out.println("Test case passed");
////		}
//	}

	private WebDriver initialize() throws Exception {
		workingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",workingDir+"/driver/chromedriver.exe");
		uimap = new UIMap(workingDir + "/resources/locator.properties");
		datafile = new UIMap(workingDir + "/resources/prospects_datafile.properties");
		//System.out.println("ÜIMAP:"+ uimap.getLocator("Username_field"));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--headless");
		//options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
		WebDriver driver = new ChromeDriver(options);
		driver.get(uimap.getData("application.url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        return driver;
	}
	

}
