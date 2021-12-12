package gov.uk.check.visa.cucumber.steps;

import cucumber.api.java.en.Given;
import gov.uk.check.visa.pages.StartPage;

public class StartPageStep {
    @Given("^I am on start page$")
    public void iAmOnStartPage() {
        new StartPage().clickOnStartNow();
    }
}
