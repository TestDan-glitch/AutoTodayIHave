package starter.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import navigation.NavigateToTodayIHave;
import net.thucydides.core.annotations.Steps;
import pages.NewUpdatePage;
import pages.HomePage;

public class HomePageSteps {
    @Steps
    NavigateToTodayIHave navigateToTodayIHave;
    HomePage homePage;

    @Given("I navigate to Today I have application")
    public void iNavigateToTodayIHave() {
        navigateToTodayIHave.theTodayIHaveHomePagePage();
    }

    @When("I click the Options button")
    public void iClickTheOptionsButton() throws InterruptedException {
        homePage.ClickOptionsBtn();
    }

    @And("I click the Add New Update button")
    public void iClickTheAddNewUpdateButton() throws InterruptedException {
        homePage.ClickAddNewUpdateBtn();
    }

    @When("I see the Home page")
    public void iSeeTheHomePage() throws InterruptedException {
        homePage.CheckHomePageDisplays();
    }

    @Then("I see Updates table")
    public void iSeeUpdatesTable() {
    }

    @When("I enter a Tag")
    public void iEnterATag() {
    }
}