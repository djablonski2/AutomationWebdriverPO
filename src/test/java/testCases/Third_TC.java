package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Home_Page;
import actions.SignIn_Action;

import utility.Constant;

public class Third_TC {

    private static WebDriver driver = null;

    public static void main(String[] args) {
        //TODO wyciągnąc do parametrów
        String driverExecutablePath = "src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverExecutablePath);

        //TODO możliwość wybrania z wielu przeglądarek
        driver = new ChromeDriver();

        //TODO wyciągnięcie właściwości drivera do jednego miejsca
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Launch the Online Store Website using Constant Variable
        driver.get(Constant.URL);
        // Pass Constant Variables as arguments to Execute method
        SignIn_Action.Execute(driver, Constant.Username, Constant.Password);
        System.out.println("Login Successfully, now it is the time to Log Off buddy.");
        Home_Page.lnk_LogOut(driver).click();
        driver.quit();

    }

}

