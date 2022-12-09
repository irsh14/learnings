package tests;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment3 {
	// String str= "This#string%contains^special*characters&.";
	// str = str.replaceAll("[^a-zA-Z0-9]", " ");
	// String str = "Hello+-^Java+ -Programmer^ ^^-- ^^^ +!";
	// str = str.replaceAll("[-+^]*", " ");
	// str=str.replaceAll("\\W", " ") //we can also use this regular expression

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] itemstoadd = { "iphoneX", "Blackberry", "SamsungNote8", "NokiaEdge" };
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		getitems(driver, itemstoadd);
        driver.findElement(By.cssSelector("a[class*='btn-primary']")).click();
	}
	
	public static void getitems(WebDriver driver,String[] itemstoadd) {
		
		/*String sentence = driver.findElement(By.cssSelector("p.text-center.text-white")).getText();

		String [] splitOne = sentence.split(" ", 7);

		String user = splitOne [2];
		System.out.println(user);

		String [] splitTwo = splitOne [6].split("\\)");

		String passKey = splitTwo [0];

		driver.findElement(By.cssSelector("input#username")).sendKeys(user);

		driver.findElement(By.cssSelector("input#password")).sendKeys(passKey);*/
		
		String passcode = driver.findElement(By.cssSelector("p[class*='text-center']")).getText();
		String[] credentials = passcode.split(" ");
		String username = credentials[2];
		String password = credentials[6];
		String fp = password.replaceAll("\\W", " ").trim();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(fp);
		driver.findElement(By.xpath("//label[@class='customradio'][2]//span[@class='checkmark']")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.cssSelector("select.form-control")).click();
		WebElement type = driver.findElement(By.cssSelector("select.form-control"));
		Select stype = new Select(type);
		stype.selectByIndex(2);
		System.out.println(stype.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.card button.btn-info")));
		List<WebElement> list = driver.findElements(By.cssSelector("h4[class='card-title']"));
		/*for (int i = 0; i < items.size(); i++)

            {
              String item = items.get(i).getText();
              (item != null)
            {
            driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
            }

            }*/
		for (int i = 0; i < list.size(); i++) {
			String a = list.get(i).getText();
			String phoneind = a.replaceAll(" ", "").trim();
			System.out.println(phoneind);
			List<String> itemsadd = Arrays.asList(itemstoadd);
			if (itemsadd.contains(phoneind)) {
				driver.findElements(By.cssSelector("div.card button.btn-info")).get(i).click();
			}

		}
	}

}
