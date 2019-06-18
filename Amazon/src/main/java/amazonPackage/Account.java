package amazonPackage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Account extends CommonAPI {

    @FindBy(id = "nav-link-accountList")
    WebElement clickSignIn;

    public void signIn(){
        Actions actions = new Actions(driver);
        actions.moveToElement(clickSignIn).build().perform();

    }
}
