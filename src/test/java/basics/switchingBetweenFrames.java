package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class switchingBetweenFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\basics.main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/selenium/deprecated.html";

        driver.get(baseUrl); //It automatically opens a new browser window and fetches the page that you specify inside its parentheses.

        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();


        driver.close();
        System.exit(0);
    }
}