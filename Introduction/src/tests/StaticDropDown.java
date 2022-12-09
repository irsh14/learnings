package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
        //drop down with select tag 
        //when tag name is Select it is Static Dropdown
        WebElement dropdownselect = driver.findElement(By.cssSelector("select[name='ctl00$mainContent$DropDownListCurrency']"));
        Select dropdown= new Select(dropdownselect);
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
