package SeleniumTests;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_example {

	public static void main(String[] args) {
		// WebDriver Interface
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.extentreports.com/docs/versions/5/java/index.html");
		
		//Get methods
		driver.getClass(); 	
		driver.getCurrentUrl(); 	
		driver.getPageSource(); 	
		driver.getTitle(); 
		
		//Findelement
		driver.findElement(null);
		driver.findElements(null); 
		//Window
		driver.getWindowHandle();
		driver.getWindowHandles(); 
		
		//Navigate 
		driver.navigate().to("URL");
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
		
		//Active element - text box
		driver.switchTo().activeElement();
		
		//Alert
		driver.switchTo().alert();
		
		
		//Frames	
		driver.switchTo().frame(0);
		driver.switchTo().frame("");
		WebElement element = null;
		driver.switchTo().frame(element);		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		//cookies
		driver.manage().getCookies();
		driver.manage().deleteAllCookies();
		
		//Windows functions
		driver.manage().window().fullscreen();
		driver.manage().window().getSize();
		driver.manage().window().getSize();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().setPosition(null);
		driver.manage().window().setSize(null);
		
		//driver closing	
		driver.close();
		driver.quit();

	}

}
