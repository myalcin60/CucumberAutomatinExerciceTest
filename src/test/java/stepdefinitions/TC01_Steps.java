package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TC01_Steps {
    HomePage hm = new HomePage();
    LoginSingupPage ls = new LoginSingupPage();
    EnterInformationPage ip = new EnterInformationPage();
    AccountCreatedPage acp = new AccountCreatedPage();
    LoginPage lp = new LoginPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());


    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        assertTrue(hm.LOGO_HomePage.isDisplayed());
    }

    @Then("Click on Signup Login button")
    public void click_on_signup_login_button() {
        hm.BTN_SignupLogin.click();
    }

    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        assertTrue(ls.TEXT_newUserSingup.isDisplayed());
    }

    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        ls.name.sendKeys(ConfigReader.getProperty("name"));
        ls.email.sendKeys(faker.internet().emailAddress());
    }

    @Then("Click Signup button")
    public void click_signup_button() {
        ls.BTN_signup.click();

    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {
        String expectedResult = "ENTER ACCOUNT INFORMATION";
        assertEquals(expectedResult, ip.TEXT_EnterAccountInformation.getText());

    }

    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        ip.RDBTN_Gender.click();
        actions.sendKeys(ip.password).sendKeys(Keys.PAGE_DOWN)
                .sendKeys(faker.internet().password()).perform();

        ip.selectDate(ip.days, "22");
        ip.selectDate(ip.months, "5");
        ip.selectDate(ip.years, "2015");

    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        ip.CBox_uniformNewsletter.click();
    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        ip.CBox_uniformOptin.click();
    }

    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        ip.first_name.sendKeys(faker.name().firstName());
        ip.last_name.sendKeys(faker.name().lastName());
        ip.company.sendKeys(faker.company().name());
        ip.address1.sendKeys(faker.address().fullAddress());
        ip.selectDate(ip.country, "Canada");
        ip.state.sendKeys(faker.address().state());
        ip.city.sendKeys(faker.address().city());
        ip.zipcode.sendKeys(faker.address().zipCode());
        ip.mobile_number.sendKeys(faker.phoneNumber().cellPhone());

    }

    @Then("Click Create Account button")
    public void click_create_account_button() {
        ip.BTN_createAccount.click();

    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        assertTrue(acp.TEXT_AccountCreated.isDisplayed());

    }

    @Then("Click Continue button")
    public void click_continue_button() {
        acp.BTN_Continue.click();
        Driver.getDriver().navigate().refresh();
        acp.BTN_Continue.click();


    }

    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {

        assertTrue(lp.TEXT_userName.isDisplayed());
    }

    @Then("Click Delete Account button")
    public void click_delete_account_button() {

        lp.BTN_DeleteAccount.click();

    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        assertTrue(lp.TEXT_AccountDeleted.isDisplayed());
        acp.BTN_Continue.click();

    }

}
