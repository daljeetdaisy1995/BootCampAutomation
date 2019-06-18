package testAmazonPackage;

import amazonPackage.Account;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAccount extends CommonAPI {

    Account account;

    @BeforeMethod
    public void initialization(){
        account = PageFactory.initElements(driver,Account.class);
    }
    @Test(enabled = false)
    public void testSignIn(){
        account.signIn();
    }
}
