package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class simpleTest extends BaseTest {

    @Test
    public void test_SimpleTests() throws InterruptedException {
        driver.findElement(By.id("user")).sendKeys("admin");
        driver.findElement(By.id("pass")).sendKeys("admin@1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}

// Hello One