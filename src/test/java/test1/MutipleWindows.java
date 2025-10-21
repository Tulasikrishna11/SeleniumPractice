package test1;

import java.time.Duration;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MutipleWindows {
	
	@Test
	public void multipleWindows() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		WebElement inputField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		inputField.sendKeys("laptops");
		inputField.sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-index='3']"))).click();
		String mainPage = driver.getWindowHandle();
		Set<String> multipleHandles = driver.getWindowHandles();
		System.out.println(multipleHandles.size());
		for(String handle:multipleHandles) {
			if(!handle.equals(mainPage)) {
				driver.switchTo().window(handle);
				Thread.sleep(1000);
				System.out.println(driver.getTitle());
			}
		}
	}

}
