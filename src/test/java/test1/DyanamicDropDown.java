//package test1;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.List;
//
//public class DyanamicDropDown {
//
//    @Test
//    public void dynamicDropDown() {
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Goibibo-Flight&utm_term=!SEM!DF!G!Brand!RSA&cmp=SEM|D|DF|G|Google-CPC-Brand|DF-Brand-EM|Goibibo-Flight|RSA%3e&gad_source=1&gad_campaignid=108599293&gbraid=0AAAAADrlxCdK5NEDTfVYEkajP9xF-crsV&gclid=EAIaIQobChMIttaArML1jwMVOqlmAh314RarEAAYASAAEgJ-mvD_BwE");
//        driver.manage().window().maximize();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("webpush-onsite")));
//        WebElement denyButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("deny")));
//        denyButton.click();
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//span[@class='sc-koXPp bDtzaf']")).click();
//        WebElement fromInput = driver.findElement(By.xpath("//span[text()='From']//following-sibling::p"));
//        fromInput.click();
//        WebElement input = driver.findElement(By.xpath("//span[@class='sc-12foipm-26 bIIzJX']//following-sibling::input"));
//        input.sendKeys("Hyderabad");
//        List<WebElement> suggestionElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='autoSuggest-list']/li")));
//        System.out.println(suggestionElements.size());
//        for(WebElement element : suggestionElements) {
//        	WebElement span = element.findElement(By.xpath(".//div/div/div/p/span"));
//        	System.out.println(span.getText());
//        }
//        Actions actions = new Actions(driver);
//        
//        
//        System.out.println("successfully clicked");
//    }
//}
