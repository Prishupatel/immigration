package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public WorkTypePage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")   //div[@class='govuk-radios']//label
    List<WebElement> workTypeRadios;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public void selectWorkType(String workType){
        for (WebElement work : workTypeRadios){
            if(work.getText().equalsIgnoreCase(workType)){
                work.click();
                log.info("selecting work type : " +workTypeRadios.toString());
                break;

            }
        }
    }

    public void clickNextStepButton(){
        clickOnElement(continueButton);
        log.info("clicking on continue " +continueButton.toString());
    }


}
