package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class pomModelTesting extends BaseTest {

    @Test
    public void test_PomModelTests() throws InterruptedException {

        LoginPage login = new LoginPage(driver);

        login.typeInUsername();
        login.typeInPassowrd();
        login.clickOnLoginButton();

    }
}
