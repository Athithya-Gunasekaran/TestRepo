package javaLessons;

public class GoogleTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver(); // ChromeDriver class is implementing the webdriver methods

		driver.get("http://google.com");
		driver.close();
		driver.quit();
	}

}
