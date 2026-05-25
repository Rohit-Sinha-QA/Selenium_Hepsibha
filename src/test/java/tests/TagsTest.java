package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TagsTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void test_smoke() throws InterruptedException {
        ActionHelper action = new ActionHelper(driver);
        action.type(By.id("user"), "admin");
        action.type(By.id("pass"), "admin@1234");
        action.click(By.xpath("//button[@type='submit']"));
    }

    @Test(groups = {"regression"})
    public void test_regression() throws InterruptedException {
        ActionHelper action = new ActionHelper(driver);
        action.type(By.id("user"), "admin");
        action.type(By.id("pass"), "admin@1234");
        action.click(By.xpath("//button[@type='submit']"));
    }

    @Test(groups = {"smoke", "regression"})
    public void test_smoke_regression() throws InterruptedException {
        ActionHelper action = new ActionHelper(driver);
        action.type(By.id("user"), "admin");
        action.type(By.id("pass"), "admin@1234");
        action.click(By.xpath("//button[@type='submit']"));
    }
}
