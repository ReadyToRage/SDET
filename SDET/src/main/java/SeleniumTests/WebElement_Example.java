package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Example {

	public static void main(String[] args) {
		// WebElement Interface
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =  new ChromeDriver();
		
		WebElement webelement = driver.findElement(null);
		
		//Get properties
		webelement.getText();
		webelement.getTagName();
		webelement.getAttribute(null);
		webelement.getAccessibleName();
		webelement.getAriaRole();
		webelement.getCssValue(null);
		webelement.getDomAttribute(null);
		webelement.getDomProperty(null);
		webelement.getLocation();
		webelement.getRect();
		webelement.getScreenshotAs(null);
		webelement.getShadowRoot();
		webelement.getSize();
		webelement.getClass();
		
		webelement.clear();
		webelement.click();
		webelement.sendKeys(args);
		webelement.submit();
		
		webelement.isDisplayed();
		webelement.isEnabled();
		webelement.isSelected();
	

	}

}
