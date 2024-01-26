package model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaveBuilderLocator {
    @FindBy(xpath = "//span[contains(.,'Leave Management')]")
    public static WebElement clickleavemanagement;
    @FindBy(xpath = "//span[normalize-space()='Leave Builder']")
    public static WebElement clickleavebuilder;
    @FindBy(xpath = "//p[normalize-space()='Poland']")
    public static WebElement clickpoland;
    @FindBy(xpath = "//span[contains(text(),'Create Leave')]")
    public static WebElement creatrleave;
    @FindBy(xpath = "//input[@formcontrolname='Title']")
    public static WebElement titleleave;
    @FindBy(xpath = "//input[@formcontrolname='LeaveLimit']")
    public static WebElement defaukltsamount;
    @FindBy(xpath = "//span[contains(.,'Select Color')]")
    public static WebElement selectcolour;
    @FindBy(xpath = "//span[contains(text(),'Blueberry')]")
    public static WebElement selectcolourBlueberry;
    @FindBy(xpath = "//span[contains(.,'Select Icon')]")
    public static WebElement selecticon;
    @FindBy(xpath = "//span[normalize-space()='Study Leave']")
    public static WebElement selecticonstudyleave;
    @FindBy(xpath = "//span[normalize-space()='Create']")
    public static WebElement clickcreatebutton;

}
