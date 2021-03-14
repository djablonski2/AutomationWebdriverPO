import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.List;

public class findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://demoqa.com/automation-practice-form";
        driver.get(baseUrl);

        WebElement elementName = driver.findElement(By.id("userEmail"));
        System.out.println("userEmail = " + elementName.toString());

        List<WebElement> listOfElements = driver.findElements(By.name("gender"));
        System.out.println("gender = " + listOfElements.size());

        for (int i=0; i< listOfElements.size(); i++) {
            System.out.println("element "+(i+1)+" gender: "+ listOfElements.get(i).getAttribute("value"));
        }

        driver.close();
        System.exit(0);
    }
}