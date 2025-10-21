//package test1;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class KeyBoardActions {
////	@Test
//	public void keyBoardActionsTest() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://training-support.net/webelements/dynamic-attributes");
//		WebElement fNameInput = driver.findElement(By.xpath("//input[contains(@placeholder,'Full name')]"));
//		fNameInput.sendKeys("Tulasi Krishna");
//		fNameInput.sendKeys(Keys.CONTROL,"a");
//		fNameInput.sendKeys(Keys.CONTROL,"c");
//		WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
//		email.sendKeys(Keys.CONTROL,"v");
//		email.sendKeys("@gmail.com");
//		WebElement textArea = driver.findElement(By.xpath("//textarea"));
//		textArea.sendKeys("My name is ");
//		textArea.sendKeys(Keys.CONTROL,"v");
//		
//	}
//	
//	@Test
//	public void ActionKeys() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://training-support.net/webelements/dynamic-attributes");
//		WebElement fNameInput = driver.findElement(By.xpath("//input[contains(@placeholder,'Full name')]"));
//		WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
//		WebElement textArea = driver.findElement(By.xpath("//textarea"));
//		WebElement btn = driver.findElement(By.xpath("//button[text()='Submit']"));
//		fNameInput.sendKeys("Tulasi Krishna");
//		Actions actions = new Actions(driver);
//		
//		actions.keyDown(fNameInput,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
//		
//		actions.keyDown(email,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//		
//		textArea.sendKeys("My name is ");
//		actions.keyDown(textArea,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//		
//		actions.click(btn).perform();
//		
//		driver.close();
//		
//		
//	}
//
//}
