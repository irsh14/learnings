import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelfIntroduction {
  // Url called using  Web_driver of different browser
	//basic web page functions
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();  
		System.setProperty("webdriver.gecko.driver","F:\\chromedriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
	}

}
 