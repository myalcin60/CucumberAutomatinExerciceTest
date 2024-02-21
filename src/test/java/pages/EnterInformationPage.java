package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class EnterInformationPage {
    public EnterInformationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='login-form']//h2/b")
    public WebElement TEXT_EnterAccountInformation;
    @FindBy(id = "id_gender1")
    public WebElement RDBTN_Gender;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "days")
    public WebElement days;
    @FindBy(xpath = "//select[@id='months']")
    public WebElement months;
    @FindBy(id = "years")
    public WebElement years;
    @FindBy(xpath = "//label[@for='newsletter']")
    public WebElement CBox_uniformNewsletter;
    @FindBy(xpath = "//label[@for='optin']")
    public WebElement CBox_uniformOptin;
    @FindBy(id = "first_name")
    public WebElement first_name;
    @FindBy(id = "last_name")
    public WebElement last_name;
    @FindBy(id = "company")
    public WebElement company;
    @FindBy(id = "address1")
    public WebElement address1;
    @FindBy(id = "country")
    public WebElement country;
    @FindBy(id = "state")
    public WebElement state;
    @FindBy(id = "city")
    public WebElement city;
    @FindBy(id = "zipcode")
    public WebElement zipcode;
    @FindBy(id = "mobile_number")
    public WebElement mobile_number;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement BTN_createAccount;

    public void selectDate(WebElement element, String date) {
        Select select = new Select(element);
        select.selectByValue(date);
    }


}
