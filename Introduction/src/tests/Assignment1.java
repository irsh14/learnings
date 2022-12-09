package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver",  "F:\\chromedriver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
    Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
    System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
    driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
  Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
    System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
