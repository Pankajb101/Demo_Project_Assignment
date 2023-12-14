package StepDefination.Suite2;


import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	static WebDriver driver;
	
	@Given("User is on Sign In Button")
	public void user_is_on_sign_in_button() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");		
	    driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	    Thread.sleep(2000);  
	}

	@When("User enters valid Email Id") 
	public void user_enters_valid_email_id() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("Pankajborude18@gmail.com");
	    Thread.sleep(1000);
	}

	@And("Click on Continue Button")
	public void click_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	}

	@When("User enter valid Password")
	public void user_enter_valid_password() {
	    driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Pankaj@18");
	}

	@And("User click on Sign Button")
	public void user_click_on_sign_button() {
	    driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	}
	
	@Then("User is Navigated to Amazon Home page")
	public void user_is_navigated_to_amazon_home_page() throws InterruptedException {
	    AssertJUnit.assertTrue(driver.findElements(By.xpath("//*[@id=\"nav-logo-sprites\"]")).size()>0);
	    Thread.sleep(1000);
	}
	
		
	@Given("User Click on Search product Box")
	public void user_click_on_search_product_box() {
	    driver.findElement(By.xpath("//*[@id=\"nav-search\"]")).click();
	}

	@When("User is Search Iphone Product")
	public void user_is_search_iphone_product() {
	    driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Iphone");
	}

	@And("Click on Search Icon Button")
	public void click_on_search_icon_button() {
	    driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
	
	@And("User Click on Iphone details")
	public void user_click_on_iphone_details() {
	    driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	    
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
	
		        @When("User Click on Add to Cart Button")
		        public void user_click_on_add_to_cart_button() {
		           driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();		                   }
		       
		       @Then("User is landed into add to cart page")
		       public void user_is_landed_into_add_to_cart_page() {
		    	   driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
		                   }
	

}
	





