package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By username_textbox = By.id("user");
    By password_textbox = By.id("pass");
    By login_button = By.xpath("//button[@type='submit']");

    public void typeInUsername(){
        driver.findElement(username_textbox).sendKeys("admin");
    }

    public void typeInPassowrd(){
        driver.findElement(password_textbox).sendKeys("admin@1234");
    }

    public void clickOnLoginButton(){
        driver.findElement(login_button).click();
    }
}
