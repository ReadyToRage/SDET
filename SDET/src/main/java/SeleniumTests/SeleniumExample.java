package SeleniumTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumExample {
	
	public static void SystemPath() {

		System.setProperty("webdriver.chrome.driver", "Path");

		WebDriver driver = new ChromeDriver();

		driver.get("URL");     
		
		WebElement element = null ;
		
		
		
		//Dropdown

		Select select = new Select(element);
		
		select.selectByVisibleText(null);
		
		select.selectByValue(null);
		
		select.selectByIndex(0);
		
		//Alert
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys(null);
		
		//textBoxes
		element.isDisplayed();
		element.isEnabled();
		element.isSelected();
		
		element.getText().isBlank();
		
		element.getText().isEmpty();
		
		//getCSS
		
		element.getCssValue(null);
		
		//Iframes
		
		driver.switchTo().frame(0);
		driver.switchTo().frame("");
		driver.switchTo().frame(element);
		driver.switchTo().parentFrame();
		
	
		
		
		

	}

}
