package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountCreatedPage {
    public AccountCreatedPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[@id='form']/div/div/div/h2/b")
    public WebElement TEXT_AccountCreated;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement BTN_Continue;
}
