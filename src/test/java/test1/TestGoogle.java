//package test1;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
////import org.testng.annotations.Test;
//
//public class TestGoogle {
//	
//	@Test
//	public void openGoogleTest() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		WebElement input = driver.findElement(By.name("q"));
//		input.sendKeys("youtube");
////		input.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		WebElement staySignOut = driver.findElement(By.xpath("//span[contains(text(),'Stay signed out')]/parent::span/parent::div/parent::div/parent::div"));
//		staySignOut.click();
//	}
//
//}
