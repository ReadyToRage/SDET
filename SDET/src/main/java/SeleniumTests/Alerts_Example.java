package SeleniumTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_Example {

	public static void main(String[] args) {
		// Alert

		WebDriverManager.chromedriver().setup();

		WebDriver driver =  new ChromeDriver();

		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys(null);

	}

}
