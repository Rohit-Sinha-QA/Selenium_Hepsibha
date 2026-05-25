package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class actionHelperTesting extends BaseTest {

    @Test
    public void test_ActionHelperTests() throws InterruptedException {
        ActionHelper action = new ActionHelper(driver);

        action.type(By.id("user"), "admin");
        action.type(By.id("pass"), "admin@1234");
        action.click(By.xpath("//button[@type='submit']"));

    }
}
