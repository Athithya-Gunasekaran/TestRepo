package javaLessons;

public class ChromeDriver implements WebDriver {

	public ChromeDriver() 
	{
		System.out.println("Launch Google Chrome");
		
	}
		

	@Override
	public void get(String url) {
		
	System.out.println("Launch url" + url);	
	}

	@Override
	public void find(String locator) {
		
		System.out.println("Element locator" + locator);
	}

	@Override
	public void close() {
		System.out.println("Close the browser");
		
	}

	@Override
	public void quit() {
		System.out.println("Quit all the browser");
		
	}

}
