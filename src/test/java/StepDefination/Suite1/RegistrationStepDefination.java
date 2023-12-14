package StepDefination.Suite1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class RegistrationStepDefination {
	
	static WebDriver driver;

	@Given("User is on Amazon Home Page")
	public void user_is_on_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	}
	    	    
	    @When("User Click on Start here Button")
	    public void user_click_on_Start_here_button() throws InterruptedException 
	    {
	        driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/div/a")).click();
	        Thread.sleep(1000);
	    }

	
   @When("User enters valid Your name and Mobile number and Email and Password")
	public void user_enters_valid_your_name_and_mobile_number_and_email_and_password()  throws InterruptedException 
   {
	    driver.findElement(By.xpath("//*[@id='ap_customer_name']")).sendKeys("Pooja Borude");
	    driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")).sendKeys("9665007897");
	    driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("borudepankaj01@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Borudep@18");
	    Thread.sleep(500);
	}

	@When("Click on Verify mobile number Button")
	public void click_on_verify_mobile_number_button() {
	    driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	    
	    String parent = driver.getWindowHandle(); 
		  Set<String> windows = new HashSet<String>(); 
		  windows=(driver.getWindowHandles()); 
		   //driver.switchTo().window(windows.); 
		   // 
		   
		                   Iterator<String> itr=windows.iterator(); 
		                   while(itr.hasNext()) 
		                   { 
		                    String childwindow=itr.next(); 
		               
		              if(!parent.equalsIgnoreCase(childwindow)) 
		              { 
		               driver.switchTo().window(childwindow); 
		               //System.out.println("current page title  "+driver.getCurrentUrl()); 
		              } 
		                   }
	   	}

	@When("User enter the OTP")
	public void user_enter_the_otp() {
	   driver.findElement(By.xpath("//*[@id=\"auth-pv-enter-code\"]")).sendKeys("");
	}
	
	@And("User click on Create and new Account Button")
	public void user_click_on_create_and_new_account_button() {
	    driver.findElement(By.xpath("//*[@id=\"auth-verify-button\"]")).click();
	}
	
	@Then("User is Navigated to Home page")
	public void user_is_navigated_to_home_page() {
	    Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"nav-logo-sprites\"]")).size()>0);
	}
}
