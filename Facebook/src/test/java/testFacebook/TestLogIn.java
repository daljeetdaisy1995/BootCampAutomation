package testFacebook;

import base.CommonAPI;
import facebookAccount.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class TestLogIn extends CommonAPI {

    LogIn logIn;

    @BeforeMethod
    public void initialization(){
        logIn= PageFactory.initElements(driver,LogIn.class);
    }


}
