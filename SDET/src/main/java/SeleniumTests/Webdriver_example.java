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
		driver.getClass(); 	     	//return chrome driver class
		driver.getCurrentUrl();  	//return the url of current page 	
		driver.getPageSource();  	//return last modified page source	
		driver.getTitle(); 		 	 // return page title
		
		//Findelement
		driver.findElement(null);  		// find the element
		driver.findElements(null); 		// list of elements
		
		//Window
		driver.getWindowHandle();		//return String
		driver.getWindowHandles();	    //return Set<String> 
		
		//Navigate 
		driver.navigate().to("URL");    //Navigate to the page
		driver.navigate().forward();    //Go forward
		driver.navigate().refresh();    //refresh the page
		driver.navigate().back();       //going back
		
		//Active element - text box
		driver.switchTo().activeElement();			//get the active text box
		
		//Alert
		driver.switchTo().alert();					//Alert
				
		//Frames	
		driver.switchTo().frame(0);		//switch to frame
		driver.switchTo().frame("");	//switch to frame by frameName or frameId
		WebElement element = null;
		driver.switchTo().frame(element);	//switch to frame by Element	
		driver.switchTo().parentFrame();	//switch to Parent frame at top 
		driver.switchTo().defaultContent(); //switch to default control
		
		//cookies
		driver.manage().getCookies();			//get cookies with Set<Cookie>
		driver.manage().deleteAllCookies();		//delete cookies 
		
		//Windows functions
		driver.manage().window().fullscreen();		//Full screen 
		driver.manage().window().getSize();			//return dimension of size of window
		driver.manage().window().minimize();		//minimize the window
		driver.manage().window().setPosition(null);	//set the position of window from left corner
		driver.manage().window().setSize(null);		//set the size of window from left corner
		
		//driver closing	
		driver.close();			//close only driver focused window
		driver.quit();			//close all window

	}

}
