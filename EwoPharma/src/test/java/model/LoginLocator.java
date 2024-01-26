package model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocator {
    @FindBy(xpath = "//input[@name='email']")
    public static WebElement emailname;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement passwordname;
    @FindBy(xpath = "//mat-icon[contains(.,'visibility')]")
    public static WebElement iconvisible;
    @FindBy(xpath = "//span[contains(@class,'mat-button-wrapper')]")
    public static WebElement loginclick;
    @FindBy(xpath = "//h1[contains(.,'HR & Directory')]")
    public static WebElement clickthehrdirectory;

}
