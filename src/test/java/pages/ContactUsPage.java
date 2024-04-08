package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {
    public ContactUsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//input[@data-qa='name']")
    public WebElement name;
   @FindBy(xpath ="//input[@data-qa='email']")
    public WebElement email;
   @FindBy(xpath ="//input[@data-qa='subject']")
    public WebElement subject;
   @FindBy(xpath ="//*[@id='contact-us-form']/div[5]/input")
    public WebElement BTN_updateFile;
   @FindBy(xpath ="//input[@type='submit']")
    public WebElement BTN_submit;
    @FindBy(xpath ="//div[@class='status alert alert-success']")
    public WebElement TEXT_messageSuccess;

    @FindBy(xpath ="//*[@id='form-section']/a")
    public WebElement BTN_home;

     @FindBy(xpath ="//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2")
    public WebElement TEXT_getInTouch;



}
