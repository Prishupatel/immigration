package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")      //select[@id='response']
    WebElement nationality;

    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")   //button[normalize-space()='Continue']
    WebElement continueButton;

    public void selectNationality(String text) {

        selectByVisibleTextFromDropDown(nationality,text);
        log.info("Selecting nationality : " +nationality.toString());


    }

    public void clickNextStepButton() {


        clickOnElement(continueButton);
        log.info("selecting continue : " +continueButton.toString());


    }

}
