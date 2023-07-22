package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepClass {


	public WebDriver driver;
	
	@Given("^user launch chrome browser$")
	public void user_launch_chrome_browser() throws Throwable {
		
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
	}

	@When("^user opens \"([^\"]*)\"$")
	public void user_opens(String url) throws Throwable {

driver.get(url);

	}

	@When("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String uname, String upassword) throws Throwable {
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(upassword);
		



		
	}

	@When("^user press on login button$")
	public void user_press_on_login_button() throws Throwable {

		driver.findElement(By.xpath("//input[@name=\"Login\"]")).click();;

		
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String expectedTitle) throws Throwable {

		String actual=driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actual);


		
	}

	@Then("^user clicks on logout link$")
	public void user_clicks_on_logout_link() throws Throwable {


		driver.findElement(By.linkText("Logout")).click();

		
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {

driver.close();


		
	}





















}
