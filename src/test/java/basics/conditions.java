package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class conditions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\basics.main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
        driver.get(baseUrl);

        WebElement cookieActButton = driver.findElement(By.cssSelector("[data-cookiebanner=\"accept_button\"]"));
        cookieActButton.click();

        WebElement loginText = driver.findElement(By.id("email"));
        if (loginText.isEnabled()){
            loginText.sendKeys("test@test.com");
        }

        WebElement passText = driver.findElement(By.id("pass"));
        if (passText.isEnabled() ){
            passText.sendKeys("password");
        }


        if (passText.isEnabled()) {
            passText.sendKeys("password");
        } else {
            System.out.println("Test Failed");
        }

        WebElement loginButton = driver.findElement(By.name("login"));

//        isEnabled()
//        isDisplayed()
//        isSelected()
//        alertIsPresent()
//        elementToBeClickable() - Waits until an element is visible and, at the same time, enabled. The sample Selenium Code below will wait until the element with id="username" to become visible and enabled first before assigning that element as a WebElement variable named "txtUserName".
//        frameToBeAvailableAndSwitchToIt() - Waits until the given frame is already available, and then automatically switches to it.

        driver.close();
        System.exit(0);
    }
}