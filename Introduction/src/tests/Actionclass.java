package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a= new Actions(driver);
		WebElement r=driver.findElement(By.cssSelector("#nav-link-accountList"));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("slime").doubleClick().build().perform();
	    a.moveToElement(r).contextClick(r).build().perform();
	    driver.findElement(By.cssSelector("input[id*='nav-search']")).click();
	    
	}
	

}
