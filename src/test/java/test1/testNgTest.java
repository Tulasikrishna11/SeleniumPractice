//package test1;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//
//public class testNgTest {
//
//	WebDriver driver;
//	
//	@BeforeClass
//	public void createDriver() {
//		driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//	
//	@Test
//	public void login() throws InterruptedException {
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		System.out.println("Login Successfully");
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[1]")));
//Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
//		driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[1]")).click();
//	}
//	
////	@AfterClass
////	public void quitDriver() {
////		driver.quit();
////	}
//}
