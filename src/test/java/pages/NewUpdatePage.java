package pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewUpdatePage extends UIInteractionSteps{

    @FindBy(how = How.NAME, using = "title")
    public WebElement titleField;

    @FindBy(how = How.NAME, using = "text")
    public WebElement textField;

    @FindBy(how = How.NAME, using = "tags")
    public WebElement tagsField;

    public void CheckTitleField() {
        titleField.isDisplayed();
    }

    public void CheckTextField() {
        textField.isDisplayed();
    }

    public void CheckTagsField() {
        tagsField.isDisplayed();
    }
}
