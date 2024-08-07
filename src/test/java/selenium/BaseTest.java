package selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.config.TestConfig;
import selenium.driver.DriverManager;
import selenium.page.HomePage;

public class BaseTest {

    private static final String BASE_URL = TestConfig.get("url.home");

    protected HomePage homePage;

    @BeforeMethod
    public void init() {
        DriverManager.getDriver().get(BASE_URL);
        homePage = new HomePage();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.tearDown();
    }
}
