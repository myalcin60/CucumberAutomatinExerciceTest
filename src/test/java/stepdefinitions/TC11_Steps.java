package stepdefinitions;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class TC11_Steps {
    HomePage homePage =new HomePage();
    @Given("Click Cart button")
    public void click_cart_button() {
        homePage.cart.click();
    }

}
