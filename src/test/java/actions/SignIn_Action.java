package actions;

import org.openqa.selenium.WebDriver;
import pages.Home_Page;
import pages.LogIn_Page;
import utility.Constant;

public class SignIn_Action{
    public static void Execute(WebDriver driver){
        Home_Page.lnk_SignIn(driver).click();
        LogIn_Page.txtbx_UserName(driver).sendKeys(Constant.UsernameHerokuEmail);
        LogIn_Page.txtbx_Password(driver).sendKeys(Constant.PasswordHerokuEmail);
        LogIn_Page.btn_LogIn(driver).click();
    }

    public static void Execute(WebDriver driver, String sUsername, String sPassword){
        Home_Page.lnk_SignIn(driver).click();
        LogIn_Page.txtbx_UserName(driver).sendKeys(sUsername);
        LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
        LogIn_Page.btn_LogIn(driver).click();
    }

}