package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Home_Page;
import pages.LogIn_Page;
import utility.Constant;

public class Zero_TC {
    private static WebDriver driver = null;

    public static void main() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.HerokuApp);
        Home_Page.lnk_MyAccount(driver).click();
        LogIn_Page.txtbx_UserName(driver).sendKeys("testuser_1");
        LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");
        LogIn_Page.btn_LogIn(driver).click();
        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
        Home_Page.lnk_LogOut(driver).click();
        driver.quit();
    }
}