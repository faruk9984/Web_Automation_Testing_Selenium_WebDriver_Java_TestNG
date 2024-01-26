package model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IdeaCaptureLocator {
    @FindBy(xpath = "//span[contains(.,'Idea Capture')]")
    public static WebElement ideacapture;
    @FindBy(xpath = "//span[normalize-space()='My Idea']")
    public static WebElement myidea;
    @FindBy(xpath = "//span[normalize-space()='Create']")
    public static WebElement create;
    @FindBy(xpath = "//input[@formcontrolname='IdeaTitle']")
    public static WebElement ideatitle;
    @FindBy(xpath = "//mat-select[@formcontrolname='IdeaType']")
    public static WebElement ideatype;
    @FindBy(xpath = "//mat-option[contains(.,'Workplace Culture')]")
    public static WebElement ideatitleclick;
    @FindBy(xpath = "//mat-select[@formcontrolname='Region']")
    public static WebElement countryofemployee;
    @FindBy(xpath = "//span[normalize-space()='Poland']")
    public static WebElement countryofemployeepoland;
    @FindBy(xpath = "//mat-select[@formcontrolname='Department']")
    public static WebElement selectdepartment;
    @FindBy(xpath = "//mat-option[contains(.,'Business Support')]")
    public static WebElement selectdepartmentclick;
    @FindBy(xpath = "//textarea[@formcontrolname='Description']")
    public static WebElement descriptiondetails;
    @FindBy(id = "'inputButton'")
    public static WebElement dragandrop;
    @FindBy(xpath = "//span[normalize-space()='Submit']")
    public static WebElement clicksubmitbutton;

    @FindBy(xpath = "//span[normalize-space()='Idea List']")
    public static WebElement idealist;
    @FindBy(xpath = "//mat-select[contains(.,'Select Region')]")
    public static WebElement selectregion;
    @FindBy(xpath = "//span[normalize-space()='Poland']")
    public static WebElement selectpoland;
    @FindBy(xpath = "//mat-select[@formcontrolname='Department']")
    public static WebElement selectdepasrtment;
    @FindBy(xpath = "//span[normalize-space()='Business Support']")
    public static WebElement selectbs;

    @FindBy(xpath = "//mat-card[contains(.,'Type:')]")
    public static List<WebElement> selectdrag;
    @FindBy(xpath = "//div[contains(@ngxdroppable,'card')]")
    public static List<WebElement> selectdrop;
    @FindBy(xpath = "//div[contains(@ngxdroppable,'card')]")
    public static List<WebElement> selectdroplasr;

}
