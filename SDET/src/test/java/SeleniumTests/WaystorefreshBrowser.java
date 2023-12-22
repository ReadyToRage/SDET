package SeleniumTests;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaystorefreshBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void Webdrivermanager() throws AWTException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
//Type 1
		driver.get("URL");
		
		driver.get(driver.getCurrentUrl());
//Type 2
		driver.navigate().to("URL");
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		driver.navigate().back();
//Type 3 
		Robot R = new Robot();
		//Keys.F5;

	}

}
