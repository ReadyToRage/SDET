package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Example {

	public static void main(String[] args) throws InterruptedException {
		// WebElement Interface
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://mvnrepository.com/");

		WebElement webelement = driver.findElement(By.xpath("//*[@value='Search']"));
		
		//Get properties
		
		System.out.println(webelement.getAttribute("Value"));
		System.out.println(webelement.getTagName());
		System.out.println(webelement.getAccessibleName());
		System.out.println(webelement.getAriaRole());
		System.out.println(webelement.getDomAttribute("Value"));	
		System.out.println(	webelement.getCssValue("color"));
		System.out.println(webelement.getLocation());
		System.out.println(webelement.getRect());
		System.out.println(webelement.getSize());
		System.out.println(webelement.getClass());
		
		webelement.getDomProperty(null);		//similar to get attribute		
		webelement.getScreenshotAs(null);
		webelement.getShadowRoot();	
		
		webelement.clear();			//clear the text box
		webelement.click();			//click
		webelement.sendKeys(args);  //Send the keys
		webelement.submit(); 		//works for Form element
		
		webelement.isDisplayed();   //return true
		webelement.isEnabled();  	//return true
		webelement.isSelected();    //return true	

		driver.quit();
	}

}
