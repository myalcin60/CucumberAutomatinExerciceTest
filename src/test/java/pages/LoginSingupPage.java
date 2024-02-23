package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginSingupPage {
    public LoginSingupPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='signup-form']//h2")
    public WebElement TEXT_newUserSingup;
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement name;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement email;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement BTN_signup;
    @FindBy(xpath = "//*[@id='form']/div/div/div[3]/div/form/p")
    public WebElement TEXT_emailAlreadyExist;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginemail;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginpassword;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement BTN_login;
    @FindBy(xpath = "//div[@class='login-form']//h2")
    public WebElement TEXT_loginToYourAccount;
    @FindBy(xpath = "//*[@id='form']/div/div/div[1]/div/form/p")
    public WebElement TEXT_emailOrPasswordIncorrect;


}
