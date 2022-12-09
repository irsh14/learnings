package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//// div[@class='right-align']/fieldset/label [2]
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement value = driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label [2]"));
		
		/*
		 * List<WebElement> options = driver.findElements(By.xpath("//select/option"));
		 
		 * for (WebElement option: options)* 
		 * {
		 * if(option.getText().equalsIgnoreCase(checkbox))
		 * {
		 * option.click();
		    }*/
		
		driver.findElement(By.cssSelector("#checkBoxOption2")).click();
		String ovalue = value.getText();
		System.out.println(ovalue);
		WebElement selectbox = driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select dropdown = new Select(selectbox);
		dropdown.selectByVisibleText(ovalue);
		driver.findElement(By.cssSelector(".pull-right .inputs")).sendKeys(ovalue);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String text= driver.switchTo().alert().getText();
		  if(text.contains(ovalue))

		     {

		    System.out.println("Alert message success");

		     }

		     else

		    System.out.println("Something wrong with execution");

		 System.out.println(driver.switchTo().alert().getText());
		  driver.switchTo().alert().accept();
		 
			/*
			 * String grabtext = driver.switchTo().alert().getText(); 
			 * if(grabtext.equalsIgnoreCase("Hello Option2, share this practice page and share your knowledge"
			 * )) { System.out.println(" Alert Message success"); } else {
			 * System.out.println(" Alert Message Failed"); }
			 */
		
	}

}
