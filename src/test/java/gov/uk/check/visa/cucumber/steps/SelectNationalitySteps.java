package gov.uk.check.visa.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gov.uk.check.visa.pages.SelectNationalityPage;

public class SelectNationalitySteps {

    @Then("^I select my nationality \"([^\"]*)\"$")
    public void iSelectMyNationality(String text)  {
        new SelectNationalityPage().selectNationality(text);
    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new SelectNationalityPage().clickNextStepButton();
    }
}
