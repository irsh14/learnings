package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		cwindow(driver);
		
	}
	
	public static void cwindow( WebDriver driver  ) {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> nextwindow = windows.iterator();
		String parent = nextwindow.next();
		String child =  nextwindow.next();
		driver.switchTo().window(child);
		String s= driver.findElement(By.cssSelector("p.im-para:nth-child(2) a[href='mailto:mentor@rahulshettyacademy.com']")).getText();
	    String[] s1=  s.split("@");
	    String[] s2=   s1[1].split("\\W");
	    String password = s2[0];
	    driver.switchTo().window(parent);
	    driver.findElement(By.id("password")).sendKeys(password);
	}

}
