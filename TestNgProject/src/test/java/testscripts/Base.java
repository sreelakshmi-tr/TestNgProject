package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void inititializeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreel\\eclipse-workspace\\TestNgProject\\src\\main\\resources\\Resources\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void driverQuit() {
		driver.quit();
	}

	

}
