package Pages;

import browser.Browser;
import browser.Info;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(css = "input[name=\"username\"]") private WebElement userName;
    @FindBy(css = "input[name=\"password\"]") private WebElement password;
    @FindBy(className = "orangehrm-login-button") private WebElement loginButton;

    public PIMPage loginToPIMPage() {
        userName.sendKeys(Info.USER_NAME);
        password.sendKeys(Info.PASSWORD);
        loginButton.click();

        return PageFactory.initElements(Browser.driver, PIMPage.class);
    }
}
