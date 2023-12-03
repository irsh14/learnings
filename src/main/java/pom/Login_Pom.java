package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Pom {
	
	@FindBy (id="inputUsername")
	public static WebElement user_username;
	
	@FindBy (name="inputPassword")
	public static WebElement user_Pwd;
	
	@FindBy (id="chkboxOne")
	public static WebElement user_remember_checkbox;
	
	@FindBy (id="chkboxTwo")
	public static WebElement user_terms_condition_checkbox;	
	
	
	@FindBy (xpath="//button[contains(text(),'Sign In')]")
	public static WebElement user_signin_btn;	
	
	@FindBy (xpath="//p[@class='error']")
	public static WebElement user_invalid_errormsg;
	
	@FindBy (xpath="//p[contains(text(),'successfully')]")
	public static WebElement user_valid_msg;
	
	@FindBy (xpath="//a[contains(text(),'Forgot your password')]")
	public static WebElement user_forgetpswd_button;
	
	//Forget Password Form
	
	@FindBy (xpath="//input[@placeholder='Name']")
	public static WebElement user_Fpform_name;
	
	@FindBy (xpath="//input[@placeholder='Email']")
	public static WebElement user_Fpform_Email;
	
	@FindBy (xpath="//input[@placeholder='Phone Number']")
	public static WebElement user_Fpform_Number;
	
	@FindBy (xpath="//button[@class='reset-pwd-btn']")
	public static WebElement user_Fpform_resetLoginbtn;
	
	
	@FindBy (xpath="//p[@class='infoMsg']")
	public static WebElement user__Fpform_resetpwd_message;
	
	
	@FindBy (xpath="//button[@class='go-to-login-btn']")
	public static WebElement user_Fpform_GotoLoginbtn;
	
	//logut out button
	
	@FindBy (xpath="//button[contains(text(),'Log Out')]")
	public static WebElement user_logoutbtn;
	
	
}
