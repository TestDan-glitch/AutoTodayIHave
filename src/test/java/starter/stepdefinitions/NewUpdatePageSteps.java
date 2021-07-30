package starter.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.NewUpdatePage;

public class NewUpdatePageSteps {
    @Steps
    NewUpdatePage homepage;

    @Then("there will be a Title: a headline for the update")
    public void thereWillBeATitleAHeadlineForTheUpdate() {
        homepage.CheckTitleField();
    }

    @And("there will be a Text: the main body of the update")
    public void thereWillBeATextTheMainBodyOfTheUpdate() {
        homepage.CheckTextField();
    }

    @And("there will be a Tag: user-defined labels that can be used to filter updates")
    public void thereWillBeATagUserDefinedLabelsThatCanBeUsedToFilterUpdates() {
        homepage.CheckTagsField();
    }
}