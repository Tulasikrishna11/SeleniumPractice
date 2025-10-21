//package test1;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class select {
//	
//	
//	@Test
//	public void select() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://training-support.net/webelements/selects");
//		WebElement seOptions = driver.findElement(By.xpath("//option[@value='rust']/parent::select"));
//		Select s =new  Select(seOptions);
////		s.selectByValue("rust");
////		s.selectByValue("html");
////		s.selectByValue("css");
////		s.selectByValue("react");
//		s.deselectByIndex(0);
//		s.selectByVisibleText("JavaScript");
//		s.selectByIndex(3);
//		s.selectByIndex(4);
//		s.selectByIndex(5);
//		s.selectByValue("nodejs");
//		s.deselectByIndex(5);
//		
//		driver.close();
//		
//	}
//	
//
//}
