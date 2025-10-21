package test1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ShadowRoot {
	@Test
	public void shadowRoot() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.polymer-project.org/");
//		WebElement parent = driver.findElement(By.xpath("//shop-app[@page='home']"));
//		SearchContext firstShadowRoot =  parent.getShadowRoot();
//		WebElement ironPages = firstShadowRoot.findElement(By.cssSelector("iron-pages > shop-home"));
//		SearchContext secondShadowRoot = ironPages.getShadowRoot();
//		WebElement targetElement = secondShadowRoot.findElement(By.cssSelector("div:nth-of-type(1) > shop-button"));
//		targetElement.click();  
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement targetElement = (WebElement) js.executeScript("return document.querySelector('shop-app')"
				+ ".shadowRoot.querySelector('iron-pages').querySelector('shop-home')"
				+ ".shadowRoot.querySelector('div:nth-of-type(1) > shop-button ')");
		targetElement.click();
		
		
		
		
	}

}
