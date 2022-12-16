
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base {

	WebDriver driver;
	
	public void setupApplication()
	{
         driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://enterprise.demo.orangehrmlive.com/symfony/web/index.php/auth/login");
		
	}
	
}
