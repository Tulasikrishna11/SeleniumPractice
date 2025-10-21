package test1;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeSuite;
//
//public class BaseClass {
//	public static WebDriver driver;
//	
//	@BeforeSuite
//	public void setup() {
//		System.out.println("this is base");
//		driver = new ChromeDriver();
//	}
//}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
 
public class BaseClass {
 
	WebDriver driver;;
 
    @BeforeClass
    public void setUp(ITestContext conext) {
        driver = new ChromeDriver();   
        driver.get("https://training-support.net/webelements/login-form/");
        conext.setAttribute("drivername", driver);
    }
 
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}