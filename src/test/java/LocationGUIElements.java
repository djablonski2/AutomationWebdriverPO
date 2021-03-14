import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;

public class LocationGUIElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName;

        driver.get(baseUrl); //It automatically opens a new browser window and fetches the page that you specify inside its parentheses.
        //get a field type
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        tagName = driver.findElement(By.name("login")).getTagName();
        System.out.println(tagName);

        WebElement cookieActButton = driver.findElement(By.cssSelector("[data-cookiebanner=\"accept_button\"]"));
        WebElement loginText = driver.findElement(By.id("email"));
        WebElement passText = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));

        cookieActButton.click();

        String currentUrl = driver.getCurrentUrl(); //Fetches the string representing the current URL that the browser is looking at
        System.out.println(currentUrl);

        loginText.sendKeys("test@test.com");
        passText.sendKeys("password");
        loginButton.click();





        driver.close();
        System.exit(0);
    }
}