package SeleniumTests;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class WindowHandle {

static WebDriver driver;
	
	public static void Window() {
		
		String ParentWindow = driver.getWindowHandle();
		
		driver.switchTo().window(ParentWindow);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> str = driver.getWindowHandles();
		
		for (String string : str) {
			
			if(!string.equals(str)) {
				
				driver.switchTo().window(string);
			}
		}
		
		driver.quit();
		// Keys.CONTROL+"t" will open new window.
	}
}
