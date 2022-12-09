package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/angularpractice/");
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
      driver.manage().window().maximize();
      String Name = "Jannat";
      driver.findElement(By.xpath("//input[@name='name']")).sendKeys(Name);
      driver.findElement(By.cssSelector("input[name='email']")).sendKeys("janshad1401@gmail.com");
      driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("jannat");
      driver.findElement(By.xpath("//div[@class='form-check']//input[contains(@class,'form')]")).click();
      WebElement gender = driver.findElement(By.xpath("//div[@class='form-group']//select[@class='form-control']"));
      Select dropdown = new Select(gender);
      dropdown.selectByIndex(1);
      driver.findElement(By.cssSelector("#inlineRadio1")).click();
      //driver.findElement(By.xpath("//input[@name='bday']")).click();
      
      driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("12-23-1998");
      driver.findElement(By.xpath("//input[@value='Submit']")).click();
      Thread.sleep(1000);
     String message = driver.findElement(By.cssSelector("div[class*='alert-dismissible']")).getText();
     String[] s = message.split("×");
    System.out.println(s[1]); 
	}
     
}
