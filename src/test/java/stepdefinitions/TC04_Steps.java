package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import pages.LoginSingupPage;
import utilities.ConfigReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TC04_Steps {
    LoginSingupPage ls = new LoginSingupPage();
    LoginPage lp = new LoginPage();

    @Given("Enter email address and password")
    public void enter_email_address_and_password() {
        ls.loginemail.sendKeys(ConfigReader.getProperty("email"));
        ls.loginpassword.sendKeys(ConfigReader.getProperty("password"));
    }

    @Given("Click Logout button")
    public void click_logout_button() {
        lp.BTN_logout.click();
    }

    @Given("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
      assertTrue(ls.TEXT_loginToYourAccount.isDisplayed());
    }
}
