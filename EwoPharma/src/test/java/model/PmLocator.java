package model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PmLocator {
    @FindBy(xpath = "//span[contains(.,'Performance Management')]")
    public static WebElement clickpm;
    @FindBy(xpath = "//span[normalize-space()='Function Manager']")
    public static WebElement clickfunctionmanager;
    @FindBy(xpath = "//mat-select[@placeholder='Select Region']")
    public static WebElement roleselect;
    @FindBy(xpath = "//span[normalize-space()='Poland']")
    public static WebElement clickpoland;
    @FindBy(xpath = "//mat-icon[normalize-space()='edit']")
    public static WebElement edit;
    @FindBy(xpath = "//textarea[@formcontrolname='description']")
    public static WebElement description;
    @FindBy(xpath = "//input[contains(@autocomplete,'off')]")
    public static WebElement clicksearchoption;
    @FindBy(xpath = "//span[normalize-space()='Done']")
    public static WebElement clickdone;



    @FindBy(xpath = "//span[normalize-space()='Assessments']")
    public static WebElement assessment;
    @FindBy(xpath = "//span[normalize-space()='Create']")
    public static WebElement create;
    @FindBy(xpath = "//input[@formcontrolname='Title']")
    public static WebElement titlename;
    @FindBy(xpath = "//button[contains(@type,'button')]")
    public static WebElement clickdateline;
    @FindBy(xpath = "//span[contains(text(),'2023')]")
    public static WebElement clickdateline1;
    @FindBy(xpath = "//div[normalize-space()='2024']")
    public static WebElement clickdateline2;
    @FindBy(xpath = "//div[normalize-space()='NOV']")
    public static WebElement clickdateline3;
    @FindBy(xpath = "//div[normalize-space()='12']")
    public static WebElement clickdateline4;

    @FindBy(xpath = "//mat-select[@formcontrolname='AssessorRegion']")
    public static List<WebElement> selectregion;
    @FindBy(xpath = "//span[normalize-space()='Poland']")
    public static WebElement selectpoland;
    @FindBy(xpath = "//div[text()=' CM - Poland ']")
    public static WebElement clcikcmpoland;
    @FindBy(xpath = "//mat-select[@formcontrolname='AssesseeRegion']")
    public static List<WebElement> selectregion1;
    @FindBy(xpath = "//span[normalize-space()='Slovakia']")
    public static WebElement clcikcslovakia;
    @FindBy(xpath = "//div[contains(text(),'CM - Slovakia')]")
    public static WebElement clcikcslovakias;
    @FindBy(xpath = "//span[contains(text(),'Publish')]")
    public static WebElement clicksubmitbutton;




}
