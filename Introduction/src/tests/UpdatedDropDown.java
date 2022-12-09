package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		System.out.println("The checkbox1 is Selected " + driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println("The  checkbox1 is Selected " + driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		System.out.println("The total no of checkbox "+ driver.findElements(By.cssSelector("input[id*='ctl00_mainContent_chk']")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "1 Adult");
		// int i = 1;
		// while (i < 5) {
		// driver.findElement(By.id("hrefIncAdt")).click();
		// i++;
		// }
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");//div[id='divpaxinfo']
		driver.findElement(By.cssSelector("div[id='divChild'] span[id='hrefIncChd']")).click();
		driver.findElement(By.cssSelector("div[id='divInfant'] span[id='hrefIncInf']")).click();
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.id("hrefIncInf")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
