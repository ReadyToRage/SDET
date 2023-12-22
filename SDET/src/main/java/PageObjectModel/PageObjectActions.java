package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectActions {
	
	static ChromeOptions options;
	static WebDriver webdrivers;
	
	@Test
	public static void LoadDriver() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		options = new ChromeOptions();

		options.addArguments("--remote-allow-origins");

		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});

		options.addArguments("--incognito");

		webdrivers=new ChromeDriver(options);

		webdrivers.get("https://www.theaa.com/breakdown-cover/broken-down/safety-advice");
		
		Thread.sleep(1000);
		
		PageObjects PO = new PageObjects(webdrivers);
		
		PageObjects.clickAccept();
		
		
		
	}

}
