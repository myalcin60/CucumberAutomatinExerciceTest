package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class CommonStepDefinitions {
    @Given("Navigate to url")
    public void navigateToUrl() {

        Driver.getDriver().get(ConfigReader.getProperty("automationTestUrl"));
    }

    @Then("Close browser")
    public void close_browser() {
        Driver.getDriver().close();
    }

}
