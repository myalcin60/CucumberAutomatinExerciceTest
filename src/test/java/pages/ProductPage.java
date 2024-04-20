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

    @FindBy(id="search_product")
    public WebElement searchBar;

    @FindBy(id="submit_search")
    public WebElement BTN_searc;

    @FindBy(xpath="//h2[text()='Searched Products']")
    public WebElement TEXT_SEARCHEDPRODUCTS;

    @FindBy(xpath = "//p[text()='Cotton Mull Embroidered Dress']")
    public WebElement urunName;

}
