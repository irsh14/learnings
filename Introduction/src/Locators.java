import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\chromedriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Abdul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy/");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jannath");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jannath1314@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("04622342531");
		// Driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());// css parent to child
		// Driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); // customized xpath
		Thread.sleep(3000);
		// Driver.findElement(By.xpath("//form/input[1]")).sendKeys("Nazriya");
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Nazriya");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");// css regular
																									// expression
		driver.findElement(By.cssSelector("#chkboxOne")).click(); // css usig tagname
		driver.findElement(By.xpath("//input[contains(@name,'Two')]")).click();// regular Expression xpath
		driver.findElement(By.cssSelector("button[class*='signInBtn']")).click();
	}

}
