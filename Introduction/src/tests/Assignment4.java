package tests;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Set<String> s =driver.getWindowHandles();
		Iterator<String> npage= s.iterator();
		String parent=npage.next();
		String child= npage.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		driver.navigate().back();
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	}

}

/*public class WindowHandlesPractice {



public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver",

"C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.manage().window().maximize();



driver.get("https://the-internet.herokuapp.com/");



driver.findElement(By.xpath("//*[text()[contains(.,'Multiple Windows')]]")).click();



WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()[contains(.,'Click Here')]]")));



driver.findElement(By.xpath("//*[text()[contains(.,'Click Here')]]")).click();



// Declare a variable to hold the original window

String originalWindow = driver.getWindowHandle();



// Switch to new window using for loop

for (String secondWindow : driver.getWindowHandles()) {

driver.switchTo().window(secondWindow);

}



wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3")));



System.out.println(driver.findElement(By.xpath("//h3")).getText());



// Go back to the original window

driver.switchTo().window(originalWindow);



wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3")));



System.out.println(driver.findElement(By.xpath("//h3")).getText());

driver.quit();



}



}

*/
