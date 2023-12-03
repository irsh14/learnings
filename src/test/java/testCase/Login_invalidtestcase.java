package testCase;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pom.Login_Pom;

public class Login_invalidtestcase extends CommonFunction {

	
	@Test
	public void login_invalid() {
		
		PageFactory.initElements(d, Login_Pom.class);
		sendkey(Login_Pom.user_username, "Abdul");
		sendkey(Login_Pom.user_Pwd, "12345678");
		clickingwebelement(Login_Pom.user_remember_checkbox, 3);
		clickingwebelement(Login_Pom.user_terms_condition_checkbox, 3);
		clickingwebelement(Login_Pom.user_signin_btn, 3);
		System.out.println(Login_Pom.user_invalid_errormsg.getText());
	}
}
