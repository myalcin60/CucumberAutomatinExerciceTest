package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CookiesPage;
import pages.TestCasePage;

import java.time.Duration;

public class Utilities {
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    //    TestCasePage tp = new TestCasePage();
    CookiesPage cookiesPage = new CookiesPage();

    public void cookies(WebElement X_Button,WebElement closeButton) {
        if (cookiesPage.iframe1.isDisplayed()) {
            Driver.getDriver().switchTo().frame(cookiesPage.iframe1);
            System.out.println("iframe1 is displayed");
            if (X_Button.isDisplayed()) {
                X_Button.click();
                System.out.println("button x clicked");
                if (cookiesPage.iframe2.isDisplayed()) {
                    Driver.getDriver().switchTo().frame(cookiesPage.iframe2);
                    System.out.println("iframe2 is displayed");
                    if (closeButton.isDisplayed()) {
                        closeButton.click();
                        System.out.println("button close clicked");
                    }
                }

                Driver.getDriver().switchTo().defaultContent();
            }
            else if (cookiesPage.iframe2.isDisplayed()) {
                Driver.getDriver().switchTo().frame(cookiesPage.iframe2);
                System.out.println("iframe2 is displayed");
                if (closeButton.isDisplayed()) {
                    closeButton.click();
                    System.out.println("button close clicked");
                    Driver.getDriver().switchTo().defaultContent();

                }

            }
            Driver.getDriver().switchTo().defaultContent();
        }else {System.out.println("No cookies");}



    }


    public  void scrollIntoViewJS(WebDriver driver, WebElement element) {
        JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
        jsexecutor.executeScript("arguments[0].scrollIntoView();", element);
    }
}


