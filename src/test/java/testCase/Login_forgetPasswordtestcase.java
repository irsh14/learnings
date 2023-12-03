package testCase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pom.Login_Pom;

public class Login_forgetPasswordtestcase {

	public class Login_forgetpasswordtestcase extends CommonFunction {

		@Test(priority = '1')
		public void Login_invalidtc() throws InterruptedException {

			PageFactory.initElements(d, Login_Pom.class);
			clickingwebelement(Login_Pom.user_forgetpswd_button, 4);
			sendkey(Login_Pom.user_Fpform_name, "Abdul");
			sendkey(Login_Pom.user_Fpform_Email, "aeroirsh@gmail.com");
			sendkey(Login_Pom.user_Fpform_Number, "9994155005");
			clickingwebelement(Login_Pom.user_Fpform_resetLoginbtn, 4);
			String s = Login_Pom.user__Fpform_resetpwd_message.getText();
			String[] sp = s.split(" ");
			String sr = sp[4].replaceAll("'", "");
			System.out.println(sr);
			clickingwebelement(Login_Pom.user_Fpform_GotoLoginbtn, 4);
			sendkey(Login_Pom.user_username, "Abdul");
			sendkey(Login_Pom.user_Pwd, sr);
			WebDriverWait element = new WebDriverWait(d, Duration.ofSeconds(6));
			element.until(ExpectedConditions.elementToBeClickable(Login_Pom.user_remember_checkbox));
			clickingwebelement(Login_Pom.user_remember_checkbox, 10);
			element.until(ExpectedConditions.elementToBeClickable(Login_Pom.user_terms_condition_checkbox));
			clickingwebelement(Login_Pom.user_terms_condition_checkbox, 10);
			clickingwebelement(Login_Pom.user_signin_btn, 10);
			//clickingwebelement(Login_Pom.user_logoutbtn, 10);

		}
		
		
		@Test(priority = '2')
		public void Log_outtc()  {
			clickingwebelement(Login_Pom.user_logoutbtn, 10);
			
		}

	}
}
