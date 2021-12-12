package gov.uk.check.visa.cucumber.steps;

import cucumber.api.java.en.And;
import gov.uk.check.visa.pages.ReasonForTravelPage;

public class ReasonForTravelSteps {


    @And("^I select purpose of trip \"([^\"]*)\"$")
    public void iSelectPurposeOfTrip(String reason)  {
        new ReasonForTravelPage().selectReasonForTravel(reason);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new ReasonForTravelPage().clickNextStepButton();
    }
}
