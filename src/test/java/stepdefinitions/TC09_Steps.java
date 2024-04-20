package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.ProductPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.Utilities;

import static org.junit.Assert.assertTrue;

public class TC09_Steps {
    ProductPage pp = new ProductPage();
    Utilities utilities = new Utilities();

    @Given("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
      //  utilities.cookies(pp.BTN_X,pp.BTN_Close);
        pp.searchBar.sendKeys(ConfigReader.getProperty("urunName"));
        pp.BTN_searc.click();
    }
    @Given("Verify SEARCHED PRODUCTS is visible")
    public void verify_searched_products_is_visible() {
        pp.TEXT_SEARCHEDPRODUCTS.isDisplayed();
        utilities.scrollIntoViewJS(Driver.getDriver(),pp.TEXT_SEARCHEDPRODUCTS);

    }
    @Given("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {
       pp.urunName.isDisplayed();

    }
}
