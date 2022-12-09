package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		System.out.println(driver.findElement(By.xpath("//p [text() ='Drag me to my target']")).getText());
		Actions a=new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//p [text() ='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Accept']")).click();
	}

}
