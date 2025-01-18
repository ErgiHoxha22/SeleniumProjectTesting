package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    WebDriver driver;

    @FindBy (xpath= " //a[normalize-space()='Signup / Login']")
    WebElement login;

    @FindBy (xpath = " //input[@data-qa='login-email']")
    WebElement emaili;

    @FindBy (xpath= " //input[@placeholder='Password']")
    WebElement pass;

    @FindBy (xpath = " //button[normalize-space()='Login']")
    WebElement login1;

    public LogInPage (WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver, this);
    }

    public void logini () {
        login.click();
    }

    public void enterGeneralities(String email, String password) {
        this.emaili.sendKeys(email);
        this.pass.sendKeys(password);
    }



    public void login1() {
        login1.click();
    }
}
