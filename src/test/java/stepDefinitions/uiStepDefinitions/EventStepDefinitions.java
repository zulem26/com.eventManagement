package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.When;
import pages.PitonPage;
import utilities.Driver;
import utilities.ReusableMethods;
import org.junit.Assert;

public class EventStepDefinitions {

    PitonPage pitonPage = new PitonPage();

    @When("user types {string} in username box and {string} in password box")
    public void user_types_in_username_box_and_in_password_box(String username, String password) {
        pitonPage.usernameBox.sendKeys(username);
        pitonPage.passwordBox.sendKeys(password);
        ReusableMethods.waitFor(1);
        Driver.waitAndClick(pitonPage.loginButton,1);
    }

    @When("user creates an event and displays the event form")
    public void user_creates_an_event_and_displays_the_event_form() {
        Driver.waitAndClick(pitonPage.eventCreateButton,1);
        String actualText = pitonPage.createText.getText();
        String expectedText = "Create";

        Assert.assertTrue(actualText.contains(expectedText));
    }

    @When("displays errors when the user clicks the create button without filling out the event form")
    public void displays_errors_when_the_user_clicks_the_create_button_without_filling_out_the_event_form() {
        Driver.waitAndClick(pitonPage.createNeweventButton,1);
        Assert.assertTrue(Driver.waitForVisibility(pitonPage.eventNamefail,1).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(pitonPage.eventDatefail, 1).isDisplayed());
        Assert.assertTrue((Driver.waitForVisibility(pitonPage.firstNamefail,1).isDisplayed()));
        Assert.assertTrue((Driver.waitForVisibility(pitonPage.lastNamefail,1).isDisplayed()));
        Assert.assertTrue((Driver.waitForVisibility(pitonPage.contactFail,1).isDisplayed()));

    }

    @When("user should be able to add new participant when click the Add participant button")
    public void user_should_be_able_to_add_new_participant_when_click_the_add_participant_button() {
        Driver.waitAndSendText(pitonPage.eventNamebox,"zulem",1);
        Driver.waitAndSendText(pitonPage.description,"berah",1);
        Driver.waitAndClick(pitonPage.date,1);
        Driver.waitAndClickElement(pitonPage.dateDay,1);
        Driver.waitAndSendText(pitonPage.firstNamebox,"zulem",1);
        Driver.waitAndSendText(pitonPage.lastNamebox,"berah",1);
        Driver.waitAndSendText(pitonPage.contactBox,"zulkifergin26@gmail.com",1);
        Driver.waitAndClick(pitonPage.createNeweventButton,1);

    }

    @When("user should view error mesage if removes all participants")
    public void user_should_view_error_mesage_if_removes_all_participants() {
        Driver.waitAndClick(pitonPage.deleteButton,1);
        Assert.assertTrue(Driver.waitForVisibility(pitonPage.deleteText,1).isDisplayed());
    }

    @When("user should be able to create new event if fills all required fields and redirect to dashboard page with create succesful message")
    public void user_should_be_able_to_create_new_event_if_fills_all_required_fields_and_redirect_to_dashboard_page_with_create_succesful_message() {

        Driver.waitAndClickElement(pitonPage.eventCreateButton,1);
        Driver.waitAndSendText(pitonPage.eventNamebox,"zulem",1);
        Driver.waitAndSendText(pitonPage.description,"berah",1);
        Driver.waitAndClick(pitonPage.date,1);
        Driver.waitAndClickElement(pitonPage.dateDay,1);
        Driver.waitAndSendText(pitonPage.firstNamebox1,"zulem",1);
        Driver.waitAndSendText(pitonPage.lastNamebox1,"berah",1);
        Driver.waitAndSendText(pitonPage.contactBox1,"zulkifergin26@gmail.com",1);
        Driver.waitAndClick(pitonPage.createNeweventButton,1);
        Assert.assertTrue(pitonPage.succesfulMessage.isDisplayed());
    }

    @When("user should be able to edit event when user click the edit button all event fields must be filled according to editing event")
    public void user_should_be_able_to_edit_event_when_user_click_the_edit_button_all_event_fields_must_be_filled_according_to_editing_event() {
        Driver.waitAndClick(pitonPage.editButton,1);
        String actualText = pitonPage.editText.getText();
        String expectedText = "Edit Event";
        Assert.assertTrue(actualText.contains(expectedText));

        ReusableMethods.waitFor(3);
        Driver.waitAndSendText(pitonPage.firstNamebox2,"zulem",1);
        Driver.waitAndSendText(pitonPage.lastNamebox2,"BERAH",1);
        Driver.waitAndSendText(pitonPage.contactBox2,"vbaafad@gmail.com",1);
        Driver.waitAndClick(pitonPage.updateEventButton,1);



    }

    @When("user should be able to update event if required fields filled and redirect to dashboard page with update succesful message")
    public void user_should_be_able_to_update_event_if_required_fields_filled_and_redirect_to_dashboard_page_with_update_succesful_message() {
        Driver.waitAndClick(pitonPage.updateEventButton,1);
        Assert.assertTrue(pitonPage.succesfulMessage.isDisplayed());
    }


}
