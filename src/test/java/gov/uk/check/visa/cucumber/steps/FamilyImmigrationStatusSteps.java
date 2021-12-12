package gov.uk.check.visa.cucumber.steps;

import cucumber.api.java.en.And;
import gov.uk.check.visa.pages.FamilyImmigrationStatusPage;

public class FamilyImmigrationStatusSteps {

    @And("^I select my partner UK immigration status \"([^\"]*)\"$")
    public void iSelectMyPartnerUKImmigrationStatus(String status)  {
        new FamilyImmigrationStatusPage().selectYesOrNoOfImmigrationStatus(status);
    }

    @And("^I click on continue button in family immigration page$")
    public void iClickOnContinueButtonInFamilyImmigrationPage() {
        new FamilyImmigrationStatusPage().clickNextStepButton();
    }
}
