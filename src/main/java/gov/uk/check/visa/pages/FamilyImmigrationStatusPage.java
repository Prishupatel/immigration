package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")   //div[@class='govuk-radios']//label
    List<WebElement> iStatusYesOrNoRadios;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label[contains(text(),'Yes')]")
    WebElement yesRadio;

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label[contains(text(),'No')]")
    WebElement noRadio;


    public void selectYesOrNoOfImmigrationStatus(String answer) {
        switch (answer){
            case "Yes":

                clickOnElement(yesRadio);
            log.info("selecting yes for immigration status of relative : " +yesRadio.toString());
                break;
            case "No":
                log.info("selecting yes for immigration status of relative : " +noRadio.toString());
                clickOnElement(noRadio);
                break;
        }
//        switch (answer.trim()) {
//            case "Yes":
//                clickOnElement(yesRadio);
//                break;
//            case "No":
//                clickOnElement(noRadio);
//                break;
       // }
    }

    public void selectToStateMyPartnerOrFamilyMemberHaveUkImmigrationStatus(String yesOrNoAnswer) {
        for (WebElement selection : iStatusYesOrNoRadios) {
            if (selection.getText().equals(yesOrNoAnswer)) {
                selection.click();
                log.info("selecting yes for immigration status of relative : " +iStatusYesOrNoRadios.toString());
                break;
            }
        }
    }

    public void clickNextStepButton() {
        clickOnElement(continueButton);
        log.info("selecting continue : " +continueButton.toString());
    }

}
