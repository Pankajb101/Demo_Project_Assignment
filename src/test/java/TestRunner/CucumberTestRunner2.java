package TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/resources/Features/Suite2"},
glue= {"StepDefination/Suite2"})


public class CucumberTestRunner2 extends AbstractTestNGCucumberTests {
	
	@BeforeClass 
	public static void beforeClass()
	{
		
	}
	
	@AfterClass
	public static void afterClass()
	{
		
	}

}
