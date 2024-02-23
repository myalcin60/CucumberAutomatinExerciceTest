package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginSingupPage;
import utilities.ConfigReader;

import static org.junit.Assert.assertEquals;

public class TC02_Steps {
    LoginSingupPage ls = new LoginSingupPage();

    @Given("Enter name and already registered email address")
    public void enter_name_and_already_registered_email_address() {
        ls.name.sendKeys(ConfigReader.getProperty("name"));
        ls.email.sendKeys(ConfigReader.getProperty("email"));
    }

    @Given("Verify error Email Address already exist! is visible")
    public void verify_error_email_address_already_exist_is_visible() {
        String expectedText="Email Address already exist!";
        assertEquals(expectedText,ls.TEXT_emailAlreadyExist.getText());
    }

}
