package selenium.tests;

import org.junit.jupiter.api.Test;
import pages.SignUpPage;
import step.definitions.Hooks;


import static step.definitions.Hooks.driver;

public class TestRegister extends Hooks {
    SignUpPage signUpPage;
    @Test // krijojme llogarine
    public void registertest() {
        driver.get("https://www.automationexercise.com/");
        signUpPage = new SignUpPage(driver);
        signUpPage.enterGeneralities("Ergi", "ergihoxha224@gmail.com");
        signUpPage.ergi(); }

}
