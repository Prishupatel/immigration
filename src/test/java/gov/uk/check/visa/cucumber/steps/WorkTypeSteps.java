package gov.uk.check.visa.cucumber.steps;

import cucumber.api.java.en.And;
import gov.uk.check.visa.pages.WorkTypePage;

public class WorkTypeSteps {
    @And("^I select work type \"([^\"]*)\"$")
    public void iSelectWorkType( String type)  {
        new WorkTypePage().selectWorkType(type);

    }

    @And("^I clicked on continue in work type page$")
    public void iClickedOnContinueInWorkTypePage() {
        new WorkTypePage().clickNextStepButton();
    }
}
