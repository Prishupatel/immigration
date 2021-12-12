package gov.uk.check.visa.cucumber.steps;

import cucumber.api.java.en.And;
import gov.uk.check.visa.pages.DurationOfStayPage;

public class DurationOfStaySteps {
    @And("^I duration of stay \"([^\"]*)\"$")
    public void iDurationOfStay(String stay) {
        new DurationOfStayPage().selectDurationOfStayBySwitch(stay);

    }

    @And("^I clicked continue$")
    public void iClickedContinue() {
        new DurationOfStayPage().clickNextStepButton();
    }
}
