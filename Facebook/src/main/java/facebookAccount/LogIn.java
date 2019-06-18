package facebookAccount;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends CommonAPI {

    @FindBy(xpath = "//*[@name='firstname']")
    WebElement firstname;

    public void setAccount(){


    }
}
