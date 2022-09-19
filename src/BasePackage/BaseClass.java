package BasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	static WebDriver driver;
	
	
	public static  WebDriver Browser(String BrowserType) {
		if(BrowserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",   
					"C:\\Users\\bglag\\Desktop\\selenium hood\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://vbiz-dev.vfdbank.com/");
			return driver;
		}
		else if(BrowserType.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", 
					"C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://vbiz-dev.vfdbank.com/");
			return driver;
		}
		return driver;
		
	}
	
	
	
	public static WebDriver SetUp() {
		return Browser("chrome");
	}
	
	
	public static void Login(WebDriver driver)  {
		driver.findElement(By.xpath("(//div/div[text()='Log in'])")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mkparuchisom@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password@1");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Log In']")));
		driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
	}
	
	
	public static void TearDown(WebDriver driver) {
		driver.quit();
	}
	
	
	
	
}
