package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.Home_Page;
import actions.SignIn_Action;

import utility.Constant;

public class Third_TC {

    private static WebDriver driver = null;
    @Test
    public static void main() {
        System.setProperty("webdriver.chrome.driver", Constant.DriverExecutablePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.HerokuApp);
        SignIn_Action.Execute(driver);
        System.out.println("Login Successfully, now it is the time to Log Off buddy.");
        Home_Page.lnk_LogOut(driver).click();
        driver.quit();

    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Starting Test On Chrome Browser");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Finished Test On Chrome Browser");
    }

}

