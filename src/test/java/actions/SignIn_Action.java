package actions;

import org.openqa.selenium.WebDriver;
import pages.Home_Page;
import pages.LogIn_Page;

public class SignIn_Action{
    public static void Execute(WebDriver driver){
        Home_Page.lnk_SignIn(driver).click();
        LogIn_Page.txtbx_UserName(driver).sendKeys("testuser_1");
        LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");
        LogIn_Page.btn_LogIn(driver).click();
    }

    public static void Execute(WebDriver driver, String sUsername, String sPassword){
        Home_Page.lnk_SignIn(driver).click();
        LogIn_Page.txtbx_UserName(driver).sendKeys(sUsername);
        LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
        LogIn_Page.btn_LogIn(driver).click();
    }

}