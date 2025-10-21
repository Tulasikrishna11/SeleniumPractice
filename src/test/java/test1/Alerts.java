package test1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	@Test
	public void alerts() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/alerts");
		WebElement btn = driver.findElement(By.id("prompt"));
		btn.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hi this is Krishna");
		alert.accept();
		
	}

}
