package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotTest extends BaseTest {

    @Test
    public void test_ScreenshotTests() throws InterruptedException, IOException {
        ActionHelper action = new ActionHelper(driver);

        action.type(By.id("user"), "admin");
        action.type(By.id("pass"), "admin@1234");
        action.click(By.xpath("//button[@type='submit']"));

        action.takeScreenshot("login");

    }
}
