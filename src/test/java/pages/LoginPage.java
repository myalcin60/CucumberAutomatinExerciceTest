package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a/b")
    public WebElement TEXT_userName;
    @FindBy(xpath ="//*[@id='form']/div/div/div/h2/b")
    public WebElement TEXT_AccountDeleted;
    @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[5]/a/i")
    public WebElement BTN_DeleteAccount;

    @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a")
    public WebElement BTN_logout;
}
