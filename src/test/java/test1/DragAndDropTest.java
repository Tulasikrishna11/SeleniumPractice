//package test1;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class DragAndDropTest {
//
//    @Test
//    public void dragAndDrop() {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://training-support.net/webelements/drag-drop");
//
// 
//        WebElement ball = driver.findElement(By.id("ball"));
//        WebElement dropZone1 = driver.findElement(By.id("dropzone1"));
//        WebElement dropZone2 = driver.findElement(By.id("dropzone2"));
//
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(ball, dropZone1).pause(2000).dragAndDrop(ball,dropZone2).perform();
////        actions.dragAndDrop(ball,dropZone2).perform();
//
//   
//        driver.quit();
//    }
//}
//
////
////public class DragAndDropTest {
////	@Test
////	public void dragAndDrop() {
////		WebDriver driver = new ChromeDriver();
////		driver.manage().window().maximize();
////		driver.get("https://training-support.net/webelements/drag-drop");
////		WebElement ball = driver.findElement(By.id("ball"));
////		WebElement targetOne = driver.findElement(By.id("dropzone1"));
////		WebElement targetTwo = driver.findElement(By.id("dropzone2"));
////		int widthOfTargetOne = targetOne.getLocation().getX();
////		int heightOfTargetOne = targetOne.getLocation().getY();
////		int ballWidth = ball.getLocation().getX();
////		int ballHeight = ball.getLocation().getY();
////		
////		int widthOfTargetTwo = targetTwo.getLocation().getX();
////		int heightOfTargetTwo = targetTwo.getLocation().getY();
////		
////		int widthOffSetX = widthOfTargetOne - ballWidth;
////		int heightOffSetY = heightOfTargetOne - ballHeight;
////		
////		int w = widthOfTargetTwo - widthOfTargetOne;
////		int h = heightOfTargetTwo - heightOfTargetOne;
////		
////		Actions actions = new Actions(driver);
////		
////		actions.clickAndHold(ball).moveByOffset(widthOffSetX, heightOffSetY).release().perform();
////		actions.clickAndHold(ball).moveByOffset(w, h).release().perform();
////	}
////}