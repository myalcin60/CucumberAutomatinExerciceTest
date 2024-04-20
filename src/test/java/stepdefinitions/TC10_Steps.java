package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.ProductPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Utilities;

import static org.junit.Assert.assertTrue;

public class TC10_Steps {
    HomePage hm =new HomePage();
    ProductPage pp = new ProductPage();
    Utilities utilities = new Utilities();
    @Given("Scroll down to footer")
    public void scroll_down_to_footer() {
    utilities.scrollToBottom();
    }
    @Given("Verify text SUBSCRIPTION")
    public void verify_text_subscrıptıon() {
        assertTrue(hm.subscription.isDisplayed());

    }
    @Given("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {
hm.subscriptionMail.sendKeys(Faker.instance().internet().emailAddress());
hm.subscriptionSend.click();
    }
    @Given("Verify success message You have been successfully subscribed! is visible")
    public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {

    }

}
