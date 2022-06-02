/**
 * 
 */
package javaLessons;

/**
 * @author rajekra
 *
 */

// WebDriver is an interface and so object cannot be created and method cannot be defined



public interface WebDriver {
	
	public void get(String url);
	
	public void find(String locator);
	
	public void close();
	
	public void quit();
	
 
}
