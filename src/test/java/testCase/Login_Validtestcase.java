package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pom.Login_Pom;

public class Login_Validtestcase extends CommonFunction{
	
	@Test
	public void Login_invalidtc() {
	
	PageFactory.initElements(d, Login_Pom.class);
	sendkey(Login_Pom.user_username, "Abdul");
	sendkey(Login_Pom.user_Pwd, "rahulshettyacademy");
	clickingwebelement(Login_Pom.user_remember_checkbox, 4);
	clickingwebelement(Login_Pom.user_terms_condition_checkbox, 4);
	clickingwebelement(Login_Pom.user_signin_btn, 4);
	System.out.println(Login_Pom.user_valid_msg.getText());
	}

}
