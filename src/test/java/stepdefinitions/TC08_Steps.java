package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.ProductPage;
import pages.Product_1_Page;
import pages.TestCasePage;
import utilities.Driver;
import utilities.Utilities;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TC08_Steps {

    HomePage hm = new HomePage();
    ProductPage pp = new ProductPage();
    Product_1_Page p1 = new Product_1_Page();
    Utilities utilities = new Utilities();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Click on Products button")
    public void click_on_products_button() {
        hm.BTN_Products.click();
    }

    @Given("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        assertTrue(pp.TEXT_AllProducts.isDisplayed());
    }

    @Given("The products list is visible")
    public void the_products_list_is_visible() {

        assertTrue(!pp.List_AllProducts.isEmpty());
    }

    @Given("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
       // utilities.cookies(pp.BTN_X,pp.BTN_Close);
        utilities.scrollIntoViewJS(Driver.getDriver(),pp.vievProduct1);
        pp.vievProduct1.click();

    }

    @Given("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
       // utilities.cookies(pp.BTN_X,pp.BTN_Close);
        assertTrue(p1.productImage.isDisplayed());
    }

    @Given("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        assertTrue(p1.productName.isDisplayed()
                && p1.category.isDisplayed()
                && p1.price.isDisplayed()
                && p1.availability.isDisplayed()
                && p1.condition.isDisplayed()
                && p1.brand.isDisplayed());

    }


}