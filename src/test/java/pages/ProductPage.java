package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/h2")
    public WebElement TEXT_AllProducts;
    @FindBy(xpath = "//div[@class='brands-name']//ul")
    public List<WebElement> List_AllProducts;
    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul")
    public WebElement vievProduct1;
    @FindBy(xpath = "//*[@id='dismiss-button']/div/span")
    public WebElement BTN_Close;
    @FindBy(xpath = "/html/body/div/div/div[1]/div[1]/div")
    public WebElement BTN_X;
}
