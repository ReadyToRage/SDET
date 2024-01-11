package SeleniumTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor_Example {

	public static void main(String[] args) { 
		
		// Javascript executore
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.location.href = 'https://www.extentreports.com/docs/versions/5/java/index.html';");
		
		js.executeScript("window.scrollTo(0,0);");		//Scroll up
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");	//Scroll to bottom
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(null)); 	//Scroll to Element		
		js.executeScript("arguments[0].click();", driver.findElement(null));   //Click button		
		js.executeScript("window.close();");

		
	}

}
