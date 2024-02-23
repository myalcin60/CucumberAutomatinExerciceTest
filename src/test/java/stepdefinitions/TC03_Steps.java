package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginSingupPage;
import utilities.ConfigReader;

import static org.junit.Assert.assertEquals;

public class TC03_Steps {
    LoginSingupPage ls = new LoginSingupPage();

    @Given("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        String expectedText = "Login to your account";
        assertEquals(expectedText, ls.TEXT_loginToYourAccount.getText());
    }

    @Given("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        ls.loginemail.sendKeys(ConfigReader.getProperty("email"));
        ls.loginpassword.sendKeys("12345hj");
    }

    @Given("Click login button")
    public void click_login_button() {
        ls.BTN_login.click();
    }

    @Given("Verify error Your email or password is incorrect! is visible")
    public void verify_error_your_email_or_password_is_incorrect_is_visible() {
        String expectedText = "Your email or password is incorrect!";
        assertEquals(expectedText, ls.TEXT_emailOrPasswordIncorrect.getText());
    }
}
