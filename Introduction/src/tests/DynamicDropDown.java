package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     //dynnamic Dropdown(Location)
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();//xpath for dynamic dropdown with index 
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='DEL']")).click();
		//
		//Return date is Enabled on Round-trip and Disabled on Single-way trip
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		System.out.println(driver.findElement(By.cssSelector("#Div1")).getAttribute("style"));
		if(driver.findElement(By.cssSelector("#Div1")).getAttribute("style").contains("0.5"))
		{
		System.out.println("Return Date is disabled");	
		Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);	
		}
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		System.out.println(driver.findElement(By.cssSelector("#Div1")).getAttribute("style"));
		if(driver.findElement(By.cssSelector("#Div1")).getAttribute("style").contains("1"))
		{
		System.out.println("Return Date is Enabled");	
		Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);	
		}
	}

}
