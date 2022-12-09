import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//assertion 
public class Locators_2 {
//method for extracting password string value from rest password
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Name = "Abdul";
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String Password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(Name);
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + Name + ",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}

	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String Passwordtext = driver.findElement(By.cssSelector("form p")).getText();
		String[] Passwordarray = Passwordtext.split("'");
		String[] Password = Passwordarray[1].split("'");
		return Password[0];
	}

}
