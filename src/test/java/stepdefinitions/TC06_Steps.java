package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ContactUsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.LoginSingupPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TC06_Steps {
    HomePage hm = new HomePage();
    ContactUsPage contactUs = new ContactUsPage();
    Actions actions = new Actions(Driver.getDriver());
     @Given("Click on Contact Us button")
    public void click_on_contact_us_button() {
         hm.BTN_ContactUs.click();

    }

    @Given("Verify GET IN TOUCH is visible")
    public void verify_get_ın_touch_is_visible() {
        String expectedText ="GET IN TOUCH";
        assertEquals(expectedText,contactUs.TEXT_getInTouch.getText());
    }

    @Given("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
         contactUs.name.sendKeys(ConfigReader.getProperty("name"));
         contactUs.email.sendKeys(ConfigReader.getProperty("email"));
         contactUs.subject.sendKeys("AutomationTest");

    }

    @Given("Upload file")
    public void upload_file()  {
        String path = System.getProperty("user.home")+"/Desktop/Flower.bmp";
        contactUs.BTN_updateFile.sendKeys(path);
        actions.sendKeys(Keys.PAGE_DOWN);

    }

    @Given("ClickSubmit button")
    public void click_submit_button() {

         contactUs.BTN_submit.click();

    }

    @Given("Click OK button")
    public void click_ok_button() {
        Driver.getDriver().switchTo().alert().accept();

    }

    @Given("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
        assertTrue(contactUs.TEXT_messageSuccess.isDisplayed());
    }

    @Given("Click Home button")
    public void click_home_button() {
         contactUs.BTN_home.click();

    }

    @And("verify that landed to home page successfully")
    public void verifyThatLandedToHomePageSuccessfully() {
        assertTrue(hm.LOGO_HomePage.isDisplayed());
    }
}