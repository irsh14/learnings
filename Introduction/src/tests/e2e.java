package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {//https://rahulshettyacademy.com/dropdownsPractise/ flight booking

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
	List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
     for (WebElement option :options)
     {
    	if(option.getText().equalsIgnoreCase("India"))
    	{
    		option.click();
    		break;
    	}
     }
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
		
		System.out.println("The checkbox1 is Selected " + driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println("The  checkbox1 is Selected " + driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		System.out.println("The total no of checkbox "+ driver.findElements(By.cssSelector("input[id*='ctl00_mainContent_chk']")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "1 Adult");
		// int i = 1;
		// while (i < 5) {
		// driver.findElement(By.id("hrefIncAdt")).click();
		// i++;
		// }
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");//div[id='divpaxinfo']
		driver.findElement(By.cssSelector("div[id='divChild'] span[id='hrefIncChd']")).click();
		driver.findElement(By.cssSelector("div[id='divInfant'] span[id='hrefIncInf']")).click();
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.id("hrefIncInf")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 WebElement dropdownselect = driver.findElement(By.cssSelector("select[name='ctl00$mainContent$DropDownListCurrency']"));
	        Select dropdown= new Select(dropdownselect);
	        dropdown.selectByIndex(2);
	        System.out.println(dropdown.getFirstSelectedOption().getText());
	    driver.findElement(By.cssSelector("*[value='Search']")).click();
	    Thread.sleep(2000);
	    driver.close();
	}

}
