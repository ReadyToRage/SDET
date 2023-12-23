package SeleniumTests;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandle {

static WebDriver driver;
	
	public static void Window() {
		
		String ParentWindow = driver.getWindowHandle();
		
		driver.switchTo().window(ParentWindow);
		
		Set<String> str = driver.getWindowHandles();
		
		for (String string : str) {
			
			if(!string.equals(str)) {
				
				driver.switchTo().window(string);
			}
		}
		
		driver.quit();
		
	}
}
