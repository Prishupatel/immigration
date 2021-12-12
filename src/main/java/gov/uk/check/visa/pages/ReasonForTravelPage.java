package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")                //div[@class='govuk-radios']//label
    List<WebElement> reasonForTravelRadios;

    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")   //button[normalize-space()='Continue']
    WebElement continueButton;

    public void clickNextStepButton() {
        clickOnElement(continueButton);
        log.info("clicking on continue button " +continueButton.toString());
    }

    public void selectReasonForTravel(String reasonForTravel) {
        for (WebElement reason : reasonForTravelRadios) {
            if (reason.getText().equalsIgnoreCase(reasonForTravel)) {

                clickOnElement(reason);
                log.info("Reason for travel " +reasonForTravelRadios.toString());
            }
        }

        for (WebElement reason : reasonForTravelRadios) {
            if (reason.getText().equals(reasonForTravel))

                clickOnElement(reason);
            Reporter.log("Select reason for travel '" + reasonForTravelRadios.toString() +"<br>");
                break;
            }
        }
    }



