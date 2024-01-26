package model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddEmployeeLocator {
    @FindBy(xpath = "//span[.='Add Employee']")
    public static WebElement clickaddemployee;

    @FindBy(id ="attachment")
    public static WebElement imageUpload;



    @FindBy(xpath = "//label[@class='attachment-button']")
    public static WebElement clickimage;
    @FindBy(xpath = "//mat-select[@formcontrolname='Salutation']")
    public static WebElement salutation;
    @FindBy(xpath = "//input[@formcontrolname='FirstName']")
    public static WebElement firstname;
    @FindBy(xpath = "//input[@formcontrolname='LastName']")
    public static WebElement lastname;
    @FindBy(xpath = "//mat-select[@placeholder='Select Gender']")
    public static WebElement gender;
    @FindBy(xpath = "//input[@formcontrolname='DateOfBirth']")
    public static WebElement dateofbirth;
    @FindBy(xpath = "//mat-select[@formcontrolname='EmploymentLocation']")
    public static WebElement countryofemployment;
    @FindBy(xpath = "//mat-select[@formcontrolname='Department']")
    public static WebElement department;
    @FindBy(xpath = "//input[@formcontrolname='Designation']")
    public static WebElement designation;
    @FindBy(xpath = "//mat-select[@formcontrolname='Nationality']")
    public static WebElement nationality;
    @FindBy(xpath = "//input[@formcontrolname='BranchName']")
    public static WebElement brance;
    @FindBy(xpath = "//mat-select[@formcontrolname='LanguagePreference']")
    public static WebElement languagepreferences;
    @FindBy(xpath = "//span[contains(text(),'English')]")
    public static WebElement languagepreferencesenglish;
    @FindBy(xpath = "//span[contains(text(),'German')]")
    public static WebElement languagepreferencesgerman;
    @FindBy(xpath = "//mat-select[contains(@formcontrolname,'Nationality')]")
    public static WebElement nationality1;
    @FindBy(xpath = "//span[contains(.,'Next')]")
    public static WebElement nextbutton1;







    @FindBy(xpath = "//input[@formcontrolname='Email']")
    public static WebElement emailbusiness;
    @FindBy(xpath = "//label[contains(.,'Show On Directory')]")
    public static WebElement showondirectory;
    @FindBy(xpath = "//input[@formcontrolname='PrivateEmail']")
    public static WebElement emailprivate;
    @FindBy(xpath = "//input[@placeholder='Telephone Number']")
    public static List<WebElement> telephonenumber;
    @FindBy(xpath = "//input[@formcontrolname='Address']")
    public static WebElement streetaddress;
    @FindBy(xpath = "//mat-select[@formcontrolname='Country']")
    public static WebElement country;
    @FindBy(xpath = "//mat-select[@formcontrolname='Canton']")
    public static WebElement canton;
    @FindBy(xpath = "//input[@formcontrolname='ZipCode']")
    public static WebElement zipcode;
    @FindBy(xpath = "//input[@formcontrolname='City']")
    public static WebElement city;
    @FindBy(xpath = "//input[@formcontrolname='EmergencyContactName']")
    public static WebElement emergencycontactname;
    @FindBy(xpath = "//input[@placeholder='Telephone Number *']")
    public static WebElement telephonenumbermain;
    @FindBy(xpath = "//button[@type='button']")
    public static List<WebElement> telephonenumberclick;
    @FindBy(xpath = "//a[.='Bangladesh + 880']")
    public static WebElement telephonenumbercountrycode;
    @FindBy(xpath = "//input[@formcontrolname='EmergencyContactRelationship']")
    public static WebElement emergencycontractrelationship;
    @FindBy(xpath = "//span[.='Email (business)']")
    public static WebElement sendnotiemail;







    @FindBy(xpath = "//span[.=' Monday ']")
    public static WebElement mondayy;
    @FindBy(xpath = "//span[normalize-space()='Sunday']")
    public static WebElement sundayy;
    @FindBy(xpath = "//span[normalize-space()='Wednesday']")
    public static WebElement wednesdayy;
    @FindBy(xpath = "//span[normalize-space()='Friday']")
    public static WebElement fridayy;
    @FindBy(xpath = "//mat-form-field[contains(.,'1')]")
    public static List<WebElement> hourtime;
    @FindBy(xpath = "//mat-form-field[contains(.,'0')]")
    public static List<WebElement> minutetime;
    @FindBy(xpath = "//span[normalize-space()='6']")
    public static WebElement hourtimeselect1;
    @FindBy(xpath = "//span[normalize-space()='7']")
    public static WebElement hourtimeselect2;
    @FindBy(xpath = "//span[normalize-space()='8']")
    public static WebElement hourtimeselect3;
    @FindBy(xpath = "//span[normalize-space()='9']")
    public static WebElement hourtimeselect4;
    @FindBy(xpath = "//span[normalize-space()='30']")
    public static WebElement minutetimeselect1;
    @FindBy(xpath = "//span[normalize-space()='40']")
    public static WebElement minutetimeselect2;
    @FindBy(xpath = "//span[normalize-space()='50']")
    public static WebElement minutetimeselect3;
    @FindBy(xpath = "//span[normalize-space()='20']")
    public static WebElement minutetimeselect4;
    @FindBy(xpath = "//label[contains(.,'import_contacts')]")
    public static WebElement leavetype01;
    @FindBy(xpath = "//label[contains(.,'pregnant_woman')]")
    public static WebElement leavetype02;




    @FindBy(xpath = "//div[contains(text(),'Ewopharma Admin')]")
    public static WebElement ewopharmaAdmin;
    @FindBy(xpath = "//div[contains(text(),'Poland')]")
    public static WebElement polandAdmin;
    @FindBy(xpath = "//label[contains(.,'Hr Admin')]")
    public static WebElement selecthradmin;
    @FindBy(xpath = "//span[text()=' Director ']")
    public static WebElement directorselect;
    @FindBy(xpath = "//label[contains(.,'CM - Poland')]")
    public static WebElement cmpolandselect;






    @FindBy(xpath = "//mat-select[@formcontrolname='DefaultCurrency']")
    public static WebElement defaultcurrency;
    @FindBy(xpath = "//span[normalize-space()='RON']")
    public static WebElement selectcurrency;
    @FindBy(xpath = "//input[@formcontrolname='GrossSalary']")
    public static WebElement fixedsalarygross;
    @FindBy(xpath = "//input[@formcontrolname='YearlySalary']")
    public static WebElement yearlyy;
    @FindBy(xpath = "//input[@formcontrolname='MonthlySalary']")
    public static WebElement monthlysalary;
    @FindBy(xpath = "//mat-checkbox[contains(.,'Education fees or days (yearly)')]")
    public static WebElement bonus1;
    @FindBy(xpath = "//mat-checkbox[contains(.,'Regular agreement')]")
    public static WebElement bonus2;
    @FindBy(xpath = "//input[@formcontrolname='AHVNumber']")
    public static WebElement ahvno;
    @FindBy(xpath = "//input[@formcontrolname='TaxAmount']")
    public static WebElement sourcetax;
    @FindBy(xpath = "//mat-checkbox[contains(.,'Child Benefit')]")
    public static WebElement childbenefit;
    @FindBy(xpath = "//mat-checkbox[contains(.,'Child Education Fee')]")
    public static WebElement childeducationfee;
    @FindBy(xpath = "//input[@formcontrolname='BankName']")
    public static WebElement banknam;
    @FindBy(xpath = "//input[@formcontrolname='BankAddress']")
    public static WebElement bankaddress;
    @FindBy(xpath = "//input[@formcontrolname='BankAccountNumber']")
    public static WebElement bankaccnumber;

    @FindBy(xpath = "//span[normalize-space()='Finish']")
    public static WebElement finishedaddemployeebutton;




    @FindBy(xpath = "//input[@class='ycptinput']")
    public static WebElement selectyopmailinput;
    @FindBy(xpath = "//i[contains(.,'\uE5C8')]")
    public static WebElement clickarrow;
    @FindBy(xpath = "//a[contains(text(),'Hr Admin-Ewopharma Admin, Director-Ewopharma Admin')] ")
    public static WebElement accessewolution;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement setpassword;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    public static WebElement setconfirmPassword;
    @FindBy(xpath = "//span[contains(.,'Activate')]")
    public static WebElement activebuttonclick;
    @FindBy(xpath = "//span[contains(.,'Login')]")
    public static WebElement loginbuttonclick;



    @FindBy(xpath = "//input[@name='email']")
    public static WebElement emailname1;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement passwordname1;
    @FindBy(xpath = "//mat-icon[contains(.,'visibility')]")
    public static WebElement iconvisible1;
    @FindBy(xpath = "//span[contains(@class,'mat-button-wrapper')]")
    public static WebElement loginclick1;



}
