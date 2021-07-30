package navigation;

import net.thucydides.core.annotations.Step;

public class NavigateToTodayIHave {

    TodayIHaveHomePage todayIHaveHomePage;

    @Step("Open the Today I Have home page")
    public void theMWLHomePage() {
        todayIHaveHomePage.open();
    }

    @Step("Open the Today I Have home page")
    public void theTodayIHaveHomePagePage() {
        todayIHaveHomePage.open();
    }
}
