package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CookiesPage {
    public CookiesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="/html/ins/div/iframe")
    public WebElement iframe1;
    @FindBy(xpath ="/html/body/div/div/div[2]/iframe")
    public WebElement iframe2;

    @FindBy(xpath = "//*[@id='dismiss-button']/div/span")
    public WebElement BTN_Close;
    @FindBy(xpath = "/html/body/div/div/div[1]/div[1]/div")
    public WebElement BTN_X;

}
