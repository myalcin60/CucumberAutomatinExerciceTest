package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage {
    public CartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
