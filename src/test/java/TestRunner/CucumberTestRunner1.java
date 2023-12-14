package TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/resources/Features/Suite1"},
glue= {"StepDefination.Suite1"})


public class CucumberTestRunner1 extends AbstractTestNGCucumberTests {
	
	@BeforeClass 
	public static void beforeClass()
	{
		
	}
	
	@AfterClass
	public static void afterClass()
	{
		
	}

}
