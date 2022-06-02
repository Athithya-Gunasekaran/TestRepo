package com.floify.los.automation.regression.suite;

import java.io.File;
import java.io.FileWriter;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import com.floify.los.automation.regression.util.UIMap;
import com.github.javafaker.Faker;

public class ProspectsEditScreenTest2 {

	private UIMap uimap;
	private UIMap datafile;
	private String workingDir;
	
	private static int count =1;
	public static void main(String[] args) throws Exception {
		
		
		
		ProspectsEditScreenTest2 flofiyLOS = new ProspectsEditScreenTest2();
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		//
		
		 System.setProperty("webdriver.chrome.silentOutput", "true");
		 
			while (true) {
				try {
					System.out.println("Attempt:" + count + ", at: " + new Date());
					flofiyLOS.enroll();
					count++;
					Thread.sleep(180 * 1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		 


		
		
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
	
private static void makeSound()
{
	 byte[] buf = new byte[2];
	    int frequency = 44100; //44100 sample points per 1 second
	    AudioFormat af = new AudioFormat((float) frequency, 16, 1, true, false);
	    SourceDataLine sdl;
		try {
			sdl = AudioSystem.getSourceDataLine(af);
		
	    sdl.open();
	    sdl.start();
	    int durationMs = 30000;
	    int numberOfTimesFullSinFuncPerSec = 441; //number of times in 1sec sin function repeats
	    for (int i = 0; i < durationMs * (float) 44100 / 1000; i++) { //1000 ms in 1 second
	      float numberOfSamplesToRepresentFullSin= (float) frequency / numberOfTimesFullSinFuncPerSec;
	      double angle = i / (numberOfSamplesToRepresentFullSin/ 2.0) * Math.PI;  // /divide with 2 since sin goes 0PI to 2PI
	      short a = (short) (Math.sin(angle) * 32767);  //32767 - max value for sample to take (-32767 to 32767)
	      buf[0] = (byte) (a & 0xFF); //write 8bits ________WWWWWWWW out of 16
	      buf[1] = (byte) (a >> 8); //write 8bits WWWWWWWW________ out of 16
	      sdl.write(buf, 0, 2);
	    }
	    sdl.drain();
	    sdl.stop();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	
	private void enroll() {
		WebDriver driver = null;
		try {
			Instant outerTimeStart = Instant.now();
			Faker faker = new Faker();
			driver = initialize("application.url");
			 
			 
			 String locator = uimap.getPropertyValue("soldout");
			 for(int i=2;i<=24;i++)
			 {
				 String val = locator.replaceAll("#REPLACE#", String.valueOf(i));
				 By bb = uimap.getLocator2(val);
				 
				 WebElement checkbox= driver.findElement(bb);
				 
				 String mcText = checkbox.getText();
					if(!"Sold Out".equals(mcText))
					{
						System.out.println("3090 is avail in BB list");
						makeSound();
					}
					
				 if(i==9)
				 {
					 i = 11;
				 }
			 }
		//driver.close();
			driver.quit();
			//  Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
			
			 driver = initialize("ind.application.url");
			 WebElement soldout3090 = driver.findElement(uimap.getLocator("3090soldout"));
			String bb= soldout3090.getText();
			 
			 if(!"Sold Out".equals(bb))
				{
					System.out.println("3090 is avail in BB ind");
					makeSound();
				}
			//driver.close();
		//	  Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
			driver.quit();
			
			 driver = initialize("mc.application.url");
			 WebElement mcsoldout3090 = driver.findElement(uimap.getLocator("mcsoldout"));
			String mcText = mcsoldout3090.getText();
			if(!"UNAVAILABLE ONLINE".equals(mcText))
			{
				System.out.println("3090 ia avail in ROCKVILLe");
				makeSound();
			}
			//driver.close();
		//	  Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
			driver.quit();
			Instant outerTimeEnd = Instant.now();
			long timeElapsed = Duration.between(outerTimeStart, outerTimeEnd).toMillis();
			//System.out.println(outerTimeStart+","+outerTimeEnd+","+timeElapsed);
		}
		catch(Exception ex)
		{
			System.out.println("ERROR:" + ex.getMessage());
			driver.quit();
		}
		
	}


	private WebDriver initialize(String url) throws Exception {
		workingDir = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver",workingDir+"/driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",workingDir+"/driver/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		uimap = new UIMap(workingDir + "/resources/locator.properties");
		datafile = new UIMap(workingDir + "/resources/prospects_datafile.properties");
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		FirefoxOptions options = new FirefoxOptions();
		
		options.setBinary(firefoxBinary);
		options.setHeadless(true);  // <
		WebDriver driver = new FirefoxDriver(options);
		driver.get(uimap.getData(url));
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.manage().window().maximize();
        return driver;
	}
	

}
