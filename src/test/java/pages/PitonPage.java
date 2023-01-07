package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PitonPage {

    public PitonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    public WebElement loginButton;

    @FindBy(css = "#mat-error-0")
    public WebElement usernameFail;

    @FindBy(css = "#mat-error-1")
    public WebElement passwordFail;


    @FindBy(xpath = "//strong[normalize-space()='Welcome Automation Test User']")
    public WebElement welcomeText;

    @FindBy(css = ".mat-button-wrapper")
    public WebElement eventCreateButton;

    @FindBy(xpath = "//h1[@class='section-title']")
    public WebElement createText;

    @FindBy(xpath = "//span[normalize-space()='Create New Event']")
    public WebElement createNeweventButton;

    @FindBy(css = "#mat-error-2")
    public WebElement eventNamefail;

    @FindBy(css = "#mat-error-3")
    public WebElement eventDatefail;

    @FindBy(css = "#mat-error-4")
    public WebElement firstNamefail;

    @FindBy(css = "#mat-error-5")
    public WebElement lastNamefail;

    @FindBy(css = "#mat-error-6")
    public WebElement contactFail;

    @FindBy(css = "#name")
    public WebElement eventNamebox;

    @FindBy(css = "#description")
    public WebElement description;

    @FindBy(css = "path")
    public WebElement date;

    @FindBy(css = "#mat-input-5")
    public WebElement firstNamebox;

    @FindBy(css = "#mat-input-6")
    public WebElement lastNamebox;

    @FindBy(css = "#mat-input-7")
    public WebElement contactBox;

    @FindBy(xpath = "//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']")
    public WebElement dateDay;

    @FindBy(xpath = "//mat-icon[normalize-space()='delete']")
    public WebElement deleteButton;

    @FindBy(css = ".mat-card-content")
    public WebElement deleteText;

    @FindBy(css = "#mat-input-11")
    public WebElement firstNamebox1;

    @FindBy(css = "#mat-input-12")
    public WebElement lastNamebox1;

    @FindBy(css = "#mat-input-13")
    public WebElement contactBox1;

    @FindBy(css = ".mat-snack-bar-container")
    public WebElement succesfulMessage;

    @FindBy(xpath = "//mat-icon[normalize-space()='edit']")
    public WebElement editButton;

    @FindBy(css = ".section-title")
    public WebElement editText;

    @FindBy(xpath = "//span[normalize-space()='Update Event']")
    public WebElement updateEventButton;


    @FindBy(css = "#mat-input-23")
    public WebElement firstNamebox2;

    @FindBy(css = "#mat-input-24")
    public WebElement lastNamebox2;

    @FindBy(css = "#mat-input-25")
    public WebElement contactBox2;


    @FindBy(css = ".mat-card-content")
    public WebElement noEventMesaj;

    @FindBy(css = "button[title='Participants'] mat-icon[role='img']")
    public WebElement viewEvent;

    @FindBy(css = ".mat-dialog-title")
    public WebElement zulemEvent;

    @FindBy(css = ".cdk-overlay-backdrop.cdk-overlay-dark-backdrop.cdk-overlay-backdrop-showing")
    public WebElement zulemDelete;




}
