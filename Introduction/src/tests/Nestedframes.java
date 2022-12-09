package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frameset[frameborder='1']")));
		//driver.switchTo().frame(1);
		//Actions a= new Actions(driver);
	   driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
	   System.out.println(driver.findElement(By.cssSelector("#content")).getText());
	}

}
