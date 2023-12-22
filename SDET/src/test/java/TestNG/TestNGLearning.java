package TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeoutException;

import org.testng.ITestListener;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGLearning implements ITestListener{


	@Test(description = "", enabled=true,alwaysRun = true,invocationCount = 3,timeOut = 1000,groups = "SMOKETEST",priority = -1,successPercentage = 90,singleThreaded = true)
	public static void TestNGSample() {

		System.out.println(" This is TestNg class...");
	}
	
	@Test(enabled=true,dependsOnGroups = "SMOKETEST",dependsOnMethods = "TestNGSample",priority = 1,expectedExceptions = TimeoutException.class,dataProvider = "",dataProviderClass = TestNGLearning.class)
	@Parameters
	public static
	void TestNGSample2() {

		System.out.println(" This is 2nd class...");
		
		//assert.assertEquals(false, true);
		
		SoftAssert sf = new SoftAssert();
		sf.assertAll();
		
	}

}
