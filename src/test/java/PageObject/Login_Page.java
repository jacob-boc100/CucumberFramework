package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {


	
	  WebDriver localdriver;
	 
	 public Login_Page() {}
	 
	  
	  
	  @FindBy(name = "user_name") WebElement uname;
	  
	  
	  @FindBy(name = "user_password") WebElement upassword;
	  
	  
	  @FindBy(name = "Login") WebElement loginbutton;
	  
	  public void enterusername(String usernme) { uname.sendKeys(usernme); }
	  
	  public void enteruserpassword(String userpwd) { upassword.sendKeys(userpwd);
	  } public void click() { loginbutton.click(); }
	  
	 
















}
