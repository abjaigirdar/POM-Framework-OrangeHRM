package Pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RecruitmentPage {
    WebDriver driver = Browser.driver;

    @FindBy(css = "div[class=\"oxd-select-text--after\"]")
    private WebElement dropDownArrow;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement searchButton;

    @FindBy(css = "div[role='option']>span")
    private List <WebElement> jobTitles;

    public RecruitmentPage selectJobTitleFromDropDown(String title) {
        dropDownArrow.click();

        for (WebElement element : jobTitles) {
            if (element.getText().equalsIgnoreCase(title)) {
                element.click();
                break;
            }
        }
        searchButton.click();
        return this;
    }

    public RecruitmentPage selectCheckBox(String name) {
        List<WebElement> allRows = driver.findElements(By.cssSelector(".oxd-table-row"));
        for (WebElement row : allRows) {
            String candidateName = row.findElement(By.xpath("div[3]")).getText();
            if (candidateName.equalsIgnoreCase(name)) {
                row.findElement(By.xpath("div[1]")).click();
            }
        }
        return this;
    }
}
