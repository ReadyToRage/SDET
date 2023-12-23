package SeleniumTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaystoLaunchBrowser {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleWebdriver();

	}

	public static void SystemPath() {

		System.setProperty("webdriver.chrome.driver", "Path");

		WebDriver driver = new ChromeDriver();

		//driver.navigate().to("URL");

	}

	public static void usingWebdrivermanager() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/documentation/overview/");   

		driver.manage().window().maximize();


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
