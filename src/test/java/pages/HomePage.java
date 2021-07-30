package pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;

public class HomePage extends UIInteractionSteps{

    @FindBy(how = How.XPATH, using = "(.//*[normalize-space(text()) and normalize-space(.)='Today I have...'])[1]/preceding::*[name()='svg'][1]")
    public WebElement btnOptions;

    @FindBy(how = How.XPATH, using = "//div[@id='root']/div/div/div/div[2]/div/button")
    public WebElement btnAddNewUpdate;

    @FindBy(how = How.XPATH, using = "(.//*[normalize-space(text()) and normalize-space(.)='Today I have...'])[1]/preceding::*[name()='svg'][1]")
    public WebElement homePageHeader;

    @FindBy(how = How.XPATH, using = "//div[@id='root']/div/div/div[2]/div/table")
    public WebElement updatesTable;

    public void ClickOptionsBtn() throws InterruptedException {
        btnOptions.click();
    }

    public void ClickAddNewUpdateBtn() throws InterruptedException {
        btnAddNewUpdate.click();
    }

    public void CheckHomePageDisplays() throws InterruptedException {
        homePageHeader.isDisplayed();
    }

    public void CheckUpdatesTableDisplays() throws InterruptedException {
        updatesTable.isDisplayed();
    }
}
