package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.PitonPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class DashboardStepDefinitions {

    PitonPage pitonPage = new PitonPage();
    Actions actions = new Actions(Driver.getDriver());


    @When("user should redirect to login page if not authenticated {string} {string}")
    public void user_should_redirect_to_login_page_if_not_authenticated(String invalid_user, String invalid_password) {
        pitonPage.usernameBox.sendKeys(ConfigurationReader.getProperty(invalid_user));
        pitonPage.passwordBox.sendKeys(ConfigurationReader.getProperty(invalid_password));
        Driver.waitAndClick(pitonPage.loginButton, 1);
        pitonPage.usernameBox.clear();
        pitonPage.passwordBox.clear();
    }

    @And("user types valid {string} in username box and valid {string} in password box")
    public void userTypesValidInUsernameBoxAndValidInPasswordBox(String user, String pass) {
        pitonPage.usernameBox.sendKeys(user);
        pitonPage.passwordBox.sendKeys(pass);
        Driver.waitAndClick(pitonPage.loginButton, 1);
        ReusableMethods.waitFor(2);
    }

    @When("user should view notification message states no registered event found")
    public void user_should_view_notification_message_states_no_registered_event_found() {

        Driver.waitForVisibility(pitonPage.noEventMesaj, 1);
        ReusableMethods.waitFor(2);
    }

    @When("user should be able navigate edit event when click the edit event button")
    public void user_should_be_able_navigate_edit_event_when_click_the_edit_event_button() {
        Driver.waitAndClick(pitonPage.eventCreateButton, 1);
        Driver.waitAndSendText(pitonPage.eventNamebox, "zulem", 1);
        Driver.waitAndSendText(pitonPage.description, "berah", 1);
        Driver.waitAndClick(pitonPage.date, 1);
        Driver.waitAndClickElement(pitonPage.dateDay, 1);
        Driver.waitAndSendText(pitonPage.firstNamebox, "zulem", 1);
        Driver.waitAndSendText(pitonPage.lastNamebox, "berah", 1);
        Driver.waitAndSendText(pitonPage.contactBox, "zulkifergin26@gmail.com", 1);
        Driver.waitAndClick(pitonPage.createNeweventButton, 1);
        Driver.waitAndClick(pitonPage.editButton, 1);
        ReusableMethods.waitFor(4);
        pitonPage.firstNamebox1.clear();
        pitonPage.lastNamebox1.clear();
        Driver.waitAndSendText(pitonPage.firstNamebox1, "ZULEM", 1);
        Driver.waitAndSendText(pitonPage.lastNamebox1, "BERAH", 1);
        Driver.waitAndClick(pitonPage.updateEventButton, 1);
        Assert.assertTrue(pitonPage.succesfulMessage.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @When("user should be able to view event participants")
    public void user_should_be_able_to_view_event_participants() {
        Driver.waitAndClick(pitonPage.viewEvent,1);
        String actualText = pitonPage.zulemEvent.getText();
        String expectedText = "Zulem";
        Assert.assertTrue(actualText.contains(expectedText));
        ReusableMethods.waitFor(2);
    }

    @When("user should be able to delete event when click the delete button")
    public void user_should_be_able_to_delete_event_when_click_the_delete_button() {
        actions.sendKeys(Keys.ESCAPE).perform();
        Driver.waitAndClick(pitonPage.deleteButton,1);
        ReusableMethods.waitFor(2);
        Driver.waitForVisibility(pitonPage.noEventMesaj, 1);
    }


}
