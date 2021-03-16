package basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tryCatch2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demoqa.com/automation-practice-form";
        driver.get(baseUrl);


        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.sendKeys("Dominik");


        WebDriverWait myWaitVar = new WebDriverWait(driver,5);
        try {
            myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            driver.findElement(By.id("email")).sendKeys("tutorial");
        } catch (TimeoutException toute) {
            System.out.println("################ Wyjątek TimeoutException:\n"+toute.toString());
        }


        driver.close();
        System.exit(0);
    }
}