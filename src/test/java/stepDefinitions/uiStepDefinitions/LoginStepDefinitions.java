package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.Given;
import pages.PitonPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;
import org.junit.Assert;
public class LoginStepDefinitions {

    PitonPage pitonPage = new PitonPage();

    @Given("user go to {string} page")
    public void user_go_to_page(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty(url));
    }

    @Given("confirms that the username box is visible")
    public void confirms_that_the_username_box_is_visible() {
        pitonPage.usernameBox.isDisplayed();
    }

    @Given("confirms that the password box is visible")
    public void confirms_that_the_password_box_is_visible() {
        pitonPage.passwordBox.isDisplayed();
    }

    @Given("confirms that the login button is visible")
    public void confirms_that_the_login_button_is_visible() {
        pitonPage.loginButton.isDisplayed();
    }

    @Given("user clicks login button")
    public void user_clicks_login_button() {
        Driver.waitAndClick(pitonPage.loginButton, 1);
    }

    @Given("confirms that the there is a validation error below the user name box")
    public void confirms_that_the_there_is_a_validation_error_below_the_user_name_box() {
        pitonPage.usernameFail.isDisplayed();
    }

    @Given("confirms that the there is a validation error below the password box")
    public void confirms_that_the_there_is_a_validation_error_below_the_password_box() {
        ReusableMethods.waitFor(1);
        pitonPage.passwordFail.isDisplayed();
    }

    @Given("user fills the username box")
    public void user_fills_the_username_box() {
        ReusableMethods.waitFor(1);
        Driver.waitAndSendText(pitonPage.usernameBox,"automationtest");
    }

    @Given("user fills the password box")
    public void user_fills_the_password_box() {
        Driver.waitAndSendText(pitonPage.passwordBox,"123456789");
    }

    @Given("user clicks the login button")
    public void user_clicks_the_login_button() {
        pitonPage.loginButton.click();
    }

    @Given("user should got to the panel and see the welcome text")
    public void user_should_got_to_the_panel_and_see_the_welcome_text() {
        String actualText = pitonPage.welcomeText.getText();
        String expectedText = "Welcome";

        Assert.assertTrue(actualText.contains(expectedText));
    }
}
