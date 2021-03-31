package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import actions.SignIn_Action;
import org.testng.annotations.Test;
import pages.Home_Page;
import utility.Constant;

public class First_TC {

    private static WebDriver driver = null;
    @Test
    public static void main() {
        //TODO możliwość wybrania z wielu przeglądarek
        //TODO wyciągnięcie właściwości drivera do jednego miejsca
        System.setProperty("webdriver.chrome.driver", Constant.DriverExecutablePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.HerokuApp);
        SignIn_Action.Execute(driver);
        System.out.println("Login Successfully, now it is the time to Log Off buddy.");
        Home_Page.lnk_LogOut(driver).click();
        driver.quit();

    }

}