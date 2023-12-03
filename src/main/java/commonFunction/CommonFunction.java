package commonFunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import pom.Login_Pom;

public class CommonFunction {

	
	public static WebDriver d=null;
	public static Properties property = null ;
	
	public Properties loadfile() throws IOException {
		FileInputStream file = new FileInputStream("config.properties");
		property = new Properties();
		property.load(file);
		return property;
	}
		
	@BeforeSuite
	public void launchbrowser() throws IOException {
		loadfile();
		String url = property.getProperty("url");
		String driverlocation1 = property.getProperty("Location");
		String browser = property.getProperty("browser");
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions option =new  ChromeOptions();
			option.addArguments("remote-allow-origin=*");
			System.setProperty("webdriver.chrome.driver", driverlocation1);
			d= new ChromeDriver(option);
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.geko.driver", driverlocation1);
			d= new FirefoxDriver();
		}
		
		d.get(url);
		d.manage().window().maximize();                          
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	
	//click action
	public void clickingwebelement(WebElement element, long waitTimesec)  {
		WebDriverWait webwait = new WebDriverWait(d, Duration.ofSeconds(waitTimesec));
		WebElement elements = null;
		elements = webwait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
	}
	//sendKeys
	public void sendkey(WebElement element, String text) {
		element.sendKeys(text);
		//Logger logger = LoggerFactory.getLogger(this Page.class);
	}
	//dropdown list
	public void selectbyvisibletext(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectbyindex(WebElement element, int number) {
		Select select1 = new Select(element);
		select1.selectByIndex(number);
	}
	public void selectbyValue(WebElement element, String txt) {
		Select select2 = new Select(element);
		select2.selectByValue(txt);
	}
	
	// accept alert
	public void acceptAlert(WebDriver d) {
		d.switchTo().alert().accept();
	}
	
	public void dismissAlert(WebDriver d) {
		d.switchTo().alert().dismiss();
	}
	
	public void mouseHoverandClick(WebElement element) {
		Actions action = new Actions(d);
		action.moveToElement(element).click().build().perform();
	}
	
	//get window handle 
	public String getcurrentWindowID() {
		return d.getWindowHandle();
	}
	
	//Action class
	public void AltEnter(WebElement element) {
		 Actions actions = new Actions(d);
		 
		 org.openqa.selenium.interactions.Action seriesofaction ;
		seriesofaction = actions.sendKeys(element).keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).build();
		seriesofaction.perform();
	}
	
	public void getwindowhandles(int i) {
		
		ArrayList<String> newTb = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(newTb.get(i));
	}
	public void ScrollyByWebElement( int x, int y) {
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0, 700)");
		
	}	
	
	public void Elementtobeclick(WebElement webelement) {
		WebDriverWait element = new WebDriverWait(d, Duration.ofSeconds(6));
		element.until(ExpectedConditions.elementToBeClickable(webelement));
	}
}
	
	
