package gov.uk.check.visa.cucumber.steps;

import cucumber.api.java.en.And;
import gov.uk.check.visa.pages.ResultPage;

public class ResultPageSteps {
    @And("^I see result page$")
    public void iSeeResultPage() {
        new ResultPage().getResultMessage();
    }
}
