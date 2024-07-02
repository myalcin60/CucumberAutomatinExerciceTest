package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class  HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//div[@class='col-sm-6']//h1")
    public WebElement LOGO_HomePage;

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement BTN_SignupLogin;

    @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[8]/a")
    public WebElement BTN_ContactUs;

  @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[5]/a")
    public WebElement BTN_TestCase;
 @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    public WebElement BTN_Products;

 @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement subscription;
    @FindBy(id="susbscribe_email")
    public WebElement subscriptionMail;
    @FindBy(id="subscribe")
    public WebElement subscriptionSend;
    @FindBy(xpath = "")
    public WebElement subscriptionMessage;




}
