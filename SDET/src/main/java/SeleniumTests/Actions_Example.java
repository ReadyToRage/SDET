package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Example {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver =  new ChromeDriver();
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(null, null);
		act.dragAndDropBy(null, 0, 0);
		act.sendKeys(args);
		act.click();
		act.click(null);
		act.clickAndHold().build();
		act.clickAndHold(null);
		act.contextClick();
		act.doubleClick();
		act.doubleClick(null);
		act.getActiveKeyboard();
		act.getActivePointer();
		act.getActiveWheel();
		act.moveToElement(null);
		
		//Lot to learn in Actions etc .....................................
	}

}
