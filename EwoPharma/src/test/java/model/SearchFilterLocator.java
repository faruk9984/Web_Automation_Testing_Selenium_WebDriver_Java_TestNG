package model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFilterLocator {
    @FindBy(xpath = "//mat-icon[contains(.,'filter_list')]")
    public static WebElement clickfilterlist;
    @FindBy(xpath = "//mat-select[@formcontrolname='EmploymentLocation']")
    public static WebElement selectregion;
    @FindBy(xpath = "//span[normalize-space()='Poland']")
    public static WebElement selectregionpoland;
    @FindBy(xpath = "//mat-select[@formcontrolname='Designation']")
    public static WebElement selectaffilitedrole;
    @FindBy(xpath = "//span[normalize-space()='CM - Poland']")
    public static WebElement selectaffilitedrolecmpoland;
    @FindBy(xpath = "//button[normalize-space()='Apply Filter']")
    public static WebElement applyfilter;
}
