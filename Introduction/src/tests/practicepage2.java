package tests;




import java.time.Duration;
import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practicepage2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] productList= {"Cucumber" , "Tomato", "Banana"};
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		addmethod(driver, productList);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector("div[class='action-block'] button")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
	
	
	
	public static void addmethod(WebDriver driver,String[] productList) {
		int j=0;
		List<WebElement> product =driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<product.size();i++) 
		{
		String pname = product.get(i).getText();
		String[] itemName=pname.split(" ");
		
		// used to trim spaces to the right and left of splitted text
	    String formatItem =itemName[0].trim();
	    
		List<String> itemsNeeded = Arrays.asList(productList);
		
		if( itemsNeeded.contains(formatItem) ) {
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
		if(j==productList.length)
		  {	
			break;
		  }
		
	    }
	  }
	}

}
