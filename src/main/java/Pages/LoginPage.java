package Pages;

import browser.Browser;
import browser.Info;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(css = "input[name='username']")
    private WebElement usernameElement;

    @FindBy(css = "input[name=\"password\"]")
    private WebElement passwordElement;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement loginButton;

    public PIMPage loginToPIMPage() {
        usernameElement.sendKeys(Info.userName);
        passwordElement.sendKeys(Info.password);
        loginButton.click();

        return PageFactory.initElements(Browser.driver, PIMPage.class);
    }


}
