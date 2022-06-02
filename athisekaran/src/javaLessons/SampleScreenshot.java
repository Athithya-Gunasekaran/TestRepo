package javaLessons;

public class SampleScreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajekra.000\\eclipse-workspace\\athisekaran\\driver\\chromedriver.exe" );
        WebDriver driver= new ChromeDriver();
        System.out.println("Launch Chrome");
	}

}
