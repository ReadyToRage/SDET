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

		//driver.navigate().to("URL");

	}

	public static void usingWebdrivermanager() throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.theaa.com/breakdown-cover/broken-down/safety-advice");   

		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"truste-consent-button\"]")).click();

		WebElement element = driver.findElement(By.xpath("/html/body/rabo-root/main/div/rabo-safety-advice/aa-lib-container/section/div[1]/button"));

		File f = element.getScreenshotAs(OutputType.FILE);

		File fe = new File(".\\SDET\\SDET\\Screenshots\\img.png");

		FileUtils.copyFile(f,fe);

		System.out.println("getAccesibleName :"+element.getAccessibleName());

		System.out.println("getArialRole :"+element.getAriaRole());

		System.out.println("getAttribute :"+element.getAttribute("type"));

		System.out.println("getDomAttribute:"+element.getDomAttribute("class"));

		System.out.println("getDomProperty :"+element.getDomProperty("btn primary mb-1 mt-1"));

		element.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/rabo-root/main/div/rabo-immediate-danger/aa-lib-container/section/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/rabo-root/main/div/rabo-location-choice/aa-lib-container/section/div/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("PL11DE \n");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"countryFieldCtrl\"]")));
		
		select.selectByVisibleText("Saltrock");
		select.selectByValue("1: Object");
		
		
		System.out.println(select.getFirstSelectedOption().getAriaRole());
		
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
