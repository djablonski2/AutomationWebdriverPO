package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class waitsImplict {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\basics.main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
        driver.get(baseUrl);

        //Implicit wait - used to set the default waiting time throughout the program
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement cookieActButton = driver.findElement(By.cssSelector("[data-cookiebanner=\"accept_button\"]"));
        cookieActButton.click();

        WebElement loginText = driver.findElement(By.id("email"));
        loginText.sendKeys("test@test.com");

        WebElement passText = driver.findElement(By.id("passXX"));
        passText.sendKeys("password");

        WebElement loginButton = driver.findElement(By.name("login"));


        String currentUrl = driver.getCurrentUrl(); //Fetches the string representing the current URL that the browser is looking at
        System.out.println(currentUrl);





        driver.close();
        System.exit(0);
    }
}