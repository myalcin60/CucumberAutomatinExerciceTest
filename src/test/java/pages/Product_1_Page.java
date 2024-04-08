package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Product_1_Page {
    public Product_1_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[1]/div/img")
    public WebElement productImage;
@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2")
    public WebElement productName;
@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]")
    public WebElement category;
@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span")
    public WebElement price;
@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b")
    public WebElement availability;
@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b")
    public WebElement condition;
@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]/b")
    public WebElement brand;


}
