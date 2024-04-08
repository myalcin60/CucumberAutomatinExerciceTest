package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestCasePage {
    public TestCasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//section[@id='form']//div/div/div/h2/b")
    public WebElement TEXT_TestCases;
    @FindBy(xpath ="/html/ins/div/iframe")
    public WebElement iframe1;
    @FindBy(xpath ="/html/body/div/div/div[2]/iframe")
    public WebElement iframe2;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]")
    public WebElement BTN_Close;
     @FindBy(xpath = "/html/body/div/div/div[1]/div[1]/div")
    public WebElement BTN_X;

}
