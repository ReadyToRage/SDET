package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	private WebDriver driver;
	
	
	@FindBy(xpath = "//button[@type='button']")
	public static WebElement ReportButton;
	
	@FindBy(xpath="//*[@id='truste-consent-button']")
	public static WebElement AcceptButton;
	// Default constructor
    public PageObjects() {
        // Empty constructor
    }
	public PageObjects(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver,PageObjects.class);
	}
	
	public static void clickAccept() {	
		AcceptButton.click();
	}
}
