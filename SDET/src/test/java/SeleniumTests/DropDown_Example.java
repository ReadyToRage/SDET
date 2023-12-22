package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver =  new ChromeDriver();
		
		Select select = new Select(driver.findElement(null));
		
		select.selectByIndex(0);
		select.selectByVisibleText(null);
		select.selectByValue(null);
		
		select.deselectByIndex(0);
		select.deselectByValue(null);
		select.deselectByVisibleText(null);
		
		select.deselectAll();
		
		select.getOptions();
		select.getFirstSelectedOption();
		select.getAllSelectedOptions();
		
		select.getWrappedElement();
		
		select.isMultiple();
		
		select.hashCode();
		
		
	}

}
