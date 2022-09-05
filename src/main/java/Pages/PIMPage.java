package Pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class PIMPage {
    WebDriver driver = Browser.driver;

    @FindBy(css = "input[class=\"oxd-input oxd-input--active\"]")
    private WebElement searchBox;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]/div[3]/div")
    private WebElement firstNameElement;

    @FindBy(xpath = "//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]/div[4]/div")
    private WebElement lastNameElement;

    @FindBy(linkText = "Recruitment")
    private WebElement recruitmentLink;

    public PIMPage searchEmployeeID(String ID) {
        List<WebElement> elements = driver.findElements(By.cssSelector("input[class='oxd-input oxd-input--active']"));
        elements.get(1).sendKeys(ID);
        searchButton.click();

        return this;
    }

    public PIMPage validateFirstAndLastName(String firstName, String lastName) {
        Assert.assertEquals(firstNameElement.getText(), firstName);
        Assert.assertEquals(lastNameElement.getText(), lastName);

        return this;
    }

    public RecruitmentPage navigateToRecruitmentPage() {
        recruitmentLink.click();

        return PageFactory.initElements(driver, RecruitmentPage.class);
    }
}
