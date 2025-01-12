package selenium.tests;

import org.junit.jupiter.api.Test;
import pages.AddToCart;
import pages.LogInPage;
import pages.SignUpPage;
import step.definitions.Hooks;

public class ScenarioTest3 extends Hooks {
    SignUpPage signUpPage;
    LogInPage logInPage;
    AddToCart addToCart;


    @Test // krijojme llogarine
    public void registertest() {
        driver.get("https://www.automationexercise.com/");
        signUpPage = new SignUpPage(driver);
        signUpPage.enterGeneralities("Ergi", "ergihoxha224@gmail.com");
        signUpPage.ergi();

    }


    @Test // bejme log in dhe me pass bejm add to cart produktin dhe shohim nese produkti shtohet ne karte
    public void logintest () {
        driver.get("https://www.automationexercise.com/login");
        logInPage = new LogInPage(driver);
        logInPage.enterGeneralities("ergihoxha224@gmail.com", "Ergi1234");
        logInPage.logini();
        addToCart = new AddToCart(driver);
        addToCart.shtoneshport();
        addToCart.vazhdoblerjen();
        addToCart.karta();



    }

}

