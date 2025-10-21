package test1;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MiniProject {

    @Test
    public void navigationCommands() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement inputField = driver.findElement(By.xpath("//textarea[@aria-label='Search']"));
        inputField.sendKeys("Orange HRM demo");
        inputField.sendKeys(Keys.ENTER);

        // Explicit wait for search results to appear
        WebDriverWait a = new WebDriverWait(driver, Duration.ofMinutes(1));
        a.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#search")));

        driver.navigate().back();
        driver.navigate().forward();
        
        driver.navigate().to("https://www.orangehrm.com/");
        driver.findElement(By.xpath("//div[@id='CybotCookiebotDialogHeader']/button")).click();
        a.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Contact Sales']"))).click();
        
        WebElement fName = driver.findElement(By.id("Form_getForm_FullName"));
        fName.sendKeys("Vikram Rathode");
        
        WebElement eMail = driver.findElement(By.id("Form_getForm_Email"));
        eMail.sendKeys("rathodeitsolutions.test@test.com");
        
        WebElement contact = driver.findElement(By.id("Form_getForm_Contact"));
        contact.sendKeys("1234567890");
        
        WebElement jobTitle = driver.findElement(By.id("Form_getForm_JobTitle"));
        jobTitle.sendKeys("Fresher");
        
        WebElement country = driver.findElement(By.id("Form_getForm_Country"));
        Select select = new Select(country);
        select.selectByValue("India");
        
        WebElement companyName = driver.findElement(By.id("Form_getForm_CompanyName"));
        companyName.sendKeys("ABC");
        
        driver.findElement(By.id("Form_getForm_NoOfEmployees")).sendKeys("11-50");
        
        System.out.println("Handling reCAPTCHA...");
        a.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
        WebElement d = a.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(), 'not a robot')]")));
        d.click();
        driver.switchTo().parentFrame();
        
        System.out.println("Submitting the form...");
        driver.findElement(By.id("Form_getForm_action_submitForm")).click();
        
        System.out.println("Taking screenshot...");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Path p = Paths.get("C:\\Users\\2440652\\Desktop\\SeleniumPractice\\seleniumPractice\\screenshot.png");
        Files.copy(screenshot.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
        
        Thread.sleep(10000);
        
        System.out.println("Adding comment...");
        driver.findElement(By.id("Form_getForm_Comment")).sendKeys("HI this is the message sent to the message box");
        driver.switchTo().parentFrame();
        
        System.out.println("Resubmitting the form...");
        a.until(ExpectedConditions.visibilityOfElementLocated(By.id("Form_getForm_action_submitForm"))).click();
        Thread.sleep(3000);
        
        System.out.println("Navigating to OrangeHRM homepage...");
        driver.navigate().to("https://www.orangehrm.com/");
        
        System.out.println("Test execution completed.");
        
        driver.quit();

    }
}
