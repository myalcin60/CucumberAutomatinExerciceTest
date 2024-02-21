package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class CommonStepDefinitions {
    @Given("Navigate to url {string}")
    public void navigateToUrl(String url) {
        Driver.getDriver().get(url);
    }
    @Then("Close browser")
    public void close_browser() {
        Driver.getDriver().close();
    }

}
