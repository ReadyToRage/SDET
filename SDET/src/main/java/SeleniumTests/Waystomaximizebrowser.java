package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waystomaximizebrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("URL");   
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(null);
		
		

	}

}
