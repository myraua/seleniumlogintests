package pages;

import drivers.WebDrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AfterLogOutPage extends WebDrivers {
    private static final By LOG_IN2 = By.cssSelector("[data-qa-id=login]");

    public AfterLogOutPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLogIn2() {
        WebElement logIn2 = driver.findElement(LOG_IN2);
        logIn2.click();
        return new LoginPage(driver);
    }
}
