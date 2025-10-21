package test1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	
	@Test
	public void iFrame() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/iframes");
		driver.manage().window().maximize();
		
		WebElement firstIFrame = driver.findElement(By.xpath("//iframe[@title='Frame1']"));
		
		driver.switchTo().frame(firstIFrame);
		WebElement body = driver.findElement(By.tagName("body"));
		System.out.println(body.getTagName());
		
//		WebElement btn = firstIFrame.findElement(By.xpath("//body/button[text()='Click me!']"));
//		btn.click();
//		
//		driver.switchTo().parentFrame();
//		
//		WebElement secondIFrame = driver.findElement(By.xpath("//iframe[@title='Frame2']"));
//		
//		driver.switchTo().frame(secondIFrame);
//		WebElement sBtn = driver.findElement(By.xpath("//button[@class='bg-emerald-200 mx-4 svelte-12f6vku']"));
//		sBtn.click();
//		
//		driver.switchTo().defaultContent();
//		
//		Thread.sleep(3000);
//		driver.quit();
				
		
				
	}

}
