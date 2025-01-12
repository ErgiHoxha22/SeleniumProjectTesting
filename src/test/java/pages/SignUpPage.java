package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage {

    WebDriver driver;

    @FindBy(xpath= "//input[@placeholder='Name']")
    WebElement name;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement email;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement signup2;


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterGeneralities (String name, String email){
        this.name.sendKeys(name);
        this.email.sendKeys(email);

    }

    public void ergi() {
        signup2.click();
    }
}
