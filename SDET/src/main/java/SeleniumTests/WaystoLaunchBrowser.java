package SeleniumTests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaystoLaunchBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		usingWebdrivermanager();

	}

	public static void SystemPath() {

		System.setProperty("webdriver.chrome.driver", "Path");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("URL");

	}

	public static void usingWebdrivermanager() throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.quit();
	}

	public static void SimpleWebdriver() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://mvnrepository.com/");  

	}

	public static void JSexecutor() {

		JavascriptExecutor JS = (JavascriptExecutor)driver;

		JS.executeScript("window.location.href","URL");
	}






}
