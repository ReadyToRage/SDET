package SeleniumTests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptions {

	public static void main(String[] args) {
		//ChromeOptions
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins");
		
		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
		
		options.addArguments("--incognito");
		
		options.addArguments("-start-fullscreen");
		
		options.addArguments("-start-maximized");
	}

}
