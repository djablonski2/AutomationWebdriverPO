package testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import actions.SignIn_Action;
import pages.Home_Page;
import utility.Constant;

public class Second_TC {
    private static WebDriver driver = null;
    public static void main() {
        System.setProperty("webdriver.chrome.driver", Constant.DriverExecutablePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.HerokuApp);
        SignIn_Action.Execute(driver, "testuser_1","Test@123");
        System.out.println("Login Successfully, now it is the time to Log Off buddy.");
        Home_Page.lnk_LogOut(driver).click();
        driver.quit();

    }

}