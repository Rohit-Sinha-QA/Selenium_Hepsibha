package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.ExcelUtils;
import utils.JsonUtils;

import java.io.IOException;

public class ExcelTests extends BaseTest {
    @Test
    public void test_ExcelTest() throws InterruptedException, IOException {
        ActionHelper action = new ActionHelper(driver);

        ExcelUtils.setExcelFile("./src/test/java/data/TestData.xlsx", "Sheet1");

        action.type(By.id("user"), ExcelUtils.getCellData(1, 0));
        action.type(By.id("pass"), ExcelUtils.getCellData(1, 1));
        action.click(By.xpath("//button[@type='submit']"));

        ExcelUtils.closeWorkbook();

    }
}
