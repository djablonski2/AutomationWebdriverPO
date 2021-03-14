import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tryCatch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demoqa.com/automation-practice-form";
        driver.get(baseUrl);


        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.sendKeys("Dominik");

        WebElement city = driver.findElement(By.id("city"));
        try {
     //       if (city.isEnabled()) {
                city.sendKeys("password");
     //       }
        } catch (ElementNotInteractableException nsee) {
            System.out.println("################ Wyjątek ElementNotInteractableException:\n"+nsee.toString());
        }



        driver.close();
        System.exit(0);
    }
}