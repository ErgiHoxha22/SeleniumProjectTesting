package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

    WebDriver driver;

    @FindBy (xpath = " //div[@class='features_items']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]")
    WebElement addtocart;

    @FindBy (xpath = " //button[@class='btn btn-success close-modal btn-block']")
    WebElement continueshopping;

    @FindBy (xpath = " /html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    WebElement cart;



    public AddToCart (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void shtoneshport () {
        addtocart.click();
    }

    public void vazhdoblerjen (){
        continueshopping.click();
    }

    public void karta () {
        cart.click();
    }
}
