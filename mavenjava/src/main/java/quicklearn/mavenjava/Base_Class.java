package quicklearn.mavenjava;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class implements baseinterface{

 public	WebDriver driver;
	
	public void setupApplication()
	{
//		 driver = WebDriverManager.chromedriver().create();
		 WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void screenshot() {
		// TODO Auto-generated method stub
		
	}
	
}
