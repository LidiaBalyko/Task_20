package selenium.luma;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.luma.page.LoginPage;

public class CreateAccountTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void goToSignInPage() {
        loginPage = homePage.clickSighInLink();
    }

    @Test
    public void testCreateAccountLink() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickCreateAccount();
    }
}
