import Pages.LoginPage;
import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = Browser.getDriver();
        driver.navigate().to(Info.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public LoginPage startLoginPage() {
        return PageFactory.initElements(Browser.driver, LoginPage.class);
    }
}