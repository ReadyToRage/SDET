package SeleniumTests;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WaysToScreenshot {

	static WebDriver driver;
	
	public static void TakesScr() throws IOException {
		
		TakesScreenshot TS =  (TakesScreenshot)driver;
		
		File OP = TS.getScreenshotAs(OutputType.FILE);
		
		String DesF = "";
		
		File F = new File("");
		
		org.openqa.selenium.io.FileHandler.copy(OP, F);
			
	}
	
	public static void RoboScr() throws AWTException, IOException {
		
		Robot R = new Robot();
		
		Toolkit Di = Toolkit.getDefaultToolkit();
		
		Dimension Dim = Di.getScreenSize();
		
		Rectangle rect = new Rectangle(Dim);
		
		BufferedImage img =  R.createScreenCapture(rect);
		
		File fil = new File("");
		
		ImageIO.write(img, "png", fil);
			
	}
	
	
	
	
}
