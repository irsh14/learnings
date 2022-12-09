package tests;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		List<WebElement> link = driver.findElements(By.cssSelector("a"));
		for (int i = 0; i < link.size(); i++) {
			System.out.println(link.get(i).getText());
		}
		System.out.println("Total no link text present in this page " + link.size());
		WebElement footerdriver = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		WebElement column1 = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column1.findElements(By.tagName("a")).size());

		/*
		 * List<WebElement> column1l =
		 * column1.findElements(By.xpath("//table/tbody/tr/td[1]/ul")); for (int j = 0;
		 * j < column1l.size(); j++) { System.out.println(column1l.get(j).getText()); }
		 */

		for (int k = 0; k < column1.findElements(By.tagName("a")).size(); k++) {
			String ctrlclick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			System.out.println(column1.findElements(By.tagName("a")).get(k).getText());
			column1.findElements(By.tagName("a")).get(k).sendKeys(ctrlclick);
			Thread.sleep(5000l);
		}
			 Set <String>handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		
		

	}

}
