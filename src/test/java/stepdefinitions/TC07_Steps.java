package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContactUsPage;
import pages.HomePage;
import pages.TestCasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Utilities;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TC07_Steps {

    HomePage hm = new HomePage();
    TestCasePage tp = new TestCasePage();
    Utilities utilities = new Utilities();



    @Given("Click on Test Cases button")
    public void click_on_test_cases_button() {
        hm.BTN_TestCase.click();
    }

    @Given("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
      //  utilities.cookies(tp.BTN_X, tp.BTN_Close);
        String expectedText = "TEST CASES";
        assertEquals(expectedText, tp.TEXT_TestCases.getText());
    }

}