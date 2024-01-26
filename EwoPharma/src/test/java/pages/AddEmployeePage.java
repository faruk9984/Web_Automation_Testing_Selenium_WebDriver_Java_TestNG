package pages;

import model.AddEmployeeLocator;
import model.LoginLocator;
import model.Timeout;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LoginCredential;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;

public class AddEmployeePage extends AddEmployeeLocator {
    WebDriver driver;
    Timeout waitTime=new Timeout();

    public AddEmployeePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void CreateEmployee() throws InterruptedException{
        System.out.println("Start Create Employee");
        waitTime.timeout(4000);
        AddEmployeeLocator.clickaddemployee.click();
        waitTime.timeout(3000);

        File fileToUpload = new File("src/test/resources/"+"6.jpg");
        AddEmployeeLocator.imageUpload.sendKeys(fileToUpload.getAbsolutePath());
        waitTime.timeout(3000);

//        AddEmployeeLocator.imageUpload.sendKeys("6.png");
//        waitTime.timeout(4000);
//        WebElement uploadElement = AddEmployeeLocator.imageUpload;
//        //File file = new File("6.png");
//        File fileToUpload = new File("resources/6.png");
//        System.out.println(fileToUpload.getAbsolutePath());
//        uploadElement.sendKeys(fileToUpload.getAbsolutePath());
//        Thread.sleep(5000);



//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='attachment-button']")));
//        AddEmployeeLocator.clickimage.sendKeys("7.png");
//        waitTime.timeout(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement contactNameElem = driver.findElement(By.xpath("//mat-select[@formcontrolname='Salutation']"));
        js.executeScript("arguments[0].scrollIntoView(true);",contactNameElem);
        waitTime.timeout(2000);
        AddEmployeeLocator.salutation.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.salutation.sendKeys(Keys.ARROW_DOWN);
        AddEmployeeLocator.salutation.sendKeys(Keys.ENTER);
        waitTime.timeout(2000);
        AddEmployeeLocator.firstname.sendKeys("Faruk_QA_001");
        waitTime.timeout(2000);
        AddEmployeeLocator.lastname.sendKeys("Selise_001");
        waitTime.timeout(2000);
        AddEmployeeLocator.gender.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.gender.sendKeys(Keys.ARROW_DOWN);
        AddEmployeeLocator.gender.sendKeys(Keys.ARROW_DOWN);
        AddEmployeeLocator.gender.sendKeys(Keys.ARROW_DOWN);
        AddEmployeeLocator.gender.sendKeys(Keys.ENTER);
        waitTime.timeout(2000);
        AddEmployeeLocator.dateofbirth.sendKeys("11/09/1997");
        waitTime.timeout(2000);
        AddEmployeeLocator.countryofemployment.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.countryofemployment.sendKeys(Keys.ARROW_DOWN);
        AddEmployeeLocator.countryofemployment.sendKeys(Keys.ARROW_DOWN);
        AddEmployeeLocator.countryofemployment.sendKeys(Keys.ENTER);
        waitTime.timeout(2000);
        AddEmployeeLocator.department.click();
        waitTime.timeout(1000);
//        AddEmployeeLocator.department.sendKeys(Keys.ARROW_DOWN);
        AddEmployeeLocator.department.sendKeys(Keys.ENTER);
        waitTime.timeout(2000);
        AddEmployeeLocator.nationality1.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.nationality1.sendKeys(Keys.ARROW_DOWN);
        AddEmployeeLocator.nationality1.sendKeys(Keys.ENTER);
        waitTime.timeout(2000);
        AddEmployeeLocator.brance.sendKeys("Selise Office");
        waitTime.timeout(2000);
        AddEmployeeLocator.designation.sendKeys("CSE Engineer");
        waitTime.timeout(2000);
        AddEmployeeLocator.languagepreferences.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.languagepreferencesenglish.click();
        AddEmployeeLocator.languagepreferencesgerman.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.languagepreferences.sendKeys(Keys.ESCAPE);
        waitTime.timeout(2000);

//        JavascriptExecutor js1 = (JavascriptExecutor) driver;
//        WebElement contactNameElem1 = driver.findElement(By.xpath("//h3[normalize-space()='Contact Information']"));
//        js1.executeScript("arguments[0].scrollIntoView(true);",contactNameElem1);

        AddEmployeeLocator.nextbutton1.click();
        waitTime.timeout(5000);






        System.out.println("Step 2 Start");
        AddEmployeeLocator.emailbusiness.sendKeys("a00001@yopmail.com");
        waitTime.timeout(2000);
        AddEmployeeLocator.telephonenumberclick.get(1).click();
        waitTime.timeout(2000);
        AddEmployeeLocator.telephonenumbercountrycode.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.telephonenumber.get(0).sendKeys(" 1658789545");
        waitTime.timeout(2000);
        AddEmployeeLocator.showondirectory.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.emailprivate.sendKeys("seliseqa1@yopmail.com");
        waitTime.timeout(2000);
        AddEmployeeLocator.telephonenumberclick.get(2).click();
        waitTime.timeout(2000);
        AddEmployeeLocator.telephonenumbercountrycode.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.telephonenumber.get(1).sendKeys(" 1658789549");
        waitTime.timeout(2000);
        AddEmployeeLocator.streetaddress.sendKeys("Dhanmondhi 27");
        waitTime.timeout(2000);
        AddEmployeeLocator.country.click();
        waitTime.timeout(1000);
//        AddEmployeeLocator.country.sendKeys(Keys.ARROW_DOWN);
        AddEmployeeLocator.country.sendKeys(Keys.ENTER);
        waitTime.timeout(2000);
        AddEmployeeLocator.canton.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.canton.sendKeys(Keys.ENTER);
        waitTime.timeout(2000);
        AddEmployeeLocator.zipcode.sendKeys("1209");
        waitTime.timeout(2000);
        AddEmployeeLocator.city.sendKeys("Dhaka");
        waitTime.timeout(2000);
        AddEmployeeLocator.emergencycontactname.sendKeys("bossess");
        waitTime.timeout(2000);
        AddEmployeeLocator.telephonenumberclick.get(3).click();
        waitTime.timeout(2000);
        AddEmployeeLocator.telephonenumbercountrycode.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.telephonenumbermain.sendKeys(" 1987455662");
        waitTime.timeout(2000);
        AddEmployeeLocator.emergencycontractrelationship.sendKeys("Team Mate");
        waitTime.timeout(2000);
        AddEmployeeLocator.sendnotiemail.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.nextbutton1.click();
        waitTime.timeout(5000);





        AddEmployeeLocator.mondayy.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.hourtime.get(0).click();
        waitTime.timeout(2000);
        AddEmployeeLocator.hourtimeselect1.click();
        waitTime.timeout(3000);
        AddEmployeeLocator.minutetime.get(0).click();
        waitTime.timeout(2000);
        AddEmployeeLocator.minutetimeselect1.click();
        waitTime.timeout(3000);

        AddEmployeeLocator.wednesdayy.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.hourtime.get(1).click();
        waitTime.timeout(2000);
        AddEmployeeLocator.hourtimeselect2.click();
        waitTime.timeout(3000);
        AddEmployeeLocator.minutetime.get(2).click();
        waitTime.timeout(2000);
        AddEmployeeLocator.minutetimeselect2.click();
        waitTime.timeout(2000);

        AddEmployeeLocator.fridayy.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.hourtime.get(2).click();
        waitTime.timeout(2000);
        AddEmployeeLocator.hourtimeselect3.click();
        waitTime.timeout(3000);
        AddEmployeeLocator.minutetime.get(4).click();
        waitTime.timeout(2000);
        AddEmployeeLocator.minutetimeselect3.click();
        waitTime.timeout(4000);

        AddEmployeeLocator.sundayy.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.hourtime.get(3).click();
        waitTime.timeout(2000);
        AddEmployeeLocator.hourtimeselect4.click();
        waitTime.timeout(3000);
        AddEmployeeLocator.minutetime.get(6).click();
        waitTime.timeout(2000);
        AddEmployeeLocator.minutetimeselect4.click();
        waitTime.timeout(4000);

        AddEmployeeLocator.leavetype01.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.leavetype02.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.nextbutton1.click();
        waitTime.timeout(5000);




        AddEmployeeLocator.ewopharmaAdmin.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.selecthradmin.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.directorselect.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.polandAdmin.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.cmpolandselect.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.nextbutton1.click();
        waitTime.timeout(5000);



        AddEmployeeLocator.defaultcurrency.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.selectcurrency.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.fixedsalarygross.sendKeys("1000");
        waitTime.timeout(1000);
        AddEmployeeLocator.yearlyy.sendKeys("12000");
        waitTime.timeout(1000);
        AddEmployeeLocator.monthlysalary.sendKeys("1000");
        waitTime.timeout(2000);
        AddEmployeeLocator.bonus1.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.bonus2.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.ahvno.sendKeys("777");
        waitTime.timeout(1000);
        AddEmployeeLocator.sourcetax.sendKeys("12000");
        waitTime.timeout(1000);
        AddEmployeeLocator.childbenefit.click();
        waitTime.timeout(1000);
        AddEmployeeLocator.childeducationfee.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.banknam.sendKeys("Jani na");
        waitTime.timeout(1000);
        AddEmployeeLocator.bankaddress.sendKeys("777");
        waitTime.timeout(1000);
        AddEmployeeLocator.bankaccnumber.sendKeys("777");
        waitTime.timeout(3000);

        AddEmployeeLocator.finishedaddemployeebutton.click();
        waitTime.timeout(15000);
        System.out.println("End Employee");

    }


    public void doLoginaccountactive()throws InterruptedException{
        System.out.println("Start Login");

        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://yopmail.com/en/");
        waitTime.timeout(5000);
        AddEmployeeLocator.selectyopmailinput.sendKeys("a00001@yopmail.com");
        waitTime.timeout(2000);
        AddEmployeeLocator.clickarrow.click();
        waitTime.timeout(3000);

        String yopmailTab = driver.getWindowHandle();
        waitTime.timeout(2000);
        driver.switchTo().frame("ifmail");
        AddEmployeeLocator.accessewolution.click();
        waitTime.timeout(20000);

        driver.switchTo().parentFrame();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        String passTab = driver.getWindowHandle();
        driver.switchTo().window(yopmailTab);
        driver.close();
        driver.switchTo().window(passTab);
        waitTime.timeout(3000);
        AddEmployeeLocator.setpassword.sendKeys("1qazZAQ!12");
        waitTime.timeout(2000);
        AddEmployeeLocator.setconfirmPassword.sendKeys("1qazZAQ!12");
        waitTime.timeout(2000);
        AddEmployeeLocator.activebuttonclick.click();
        waitTime.timeout(10000);
        AddEmployeeLocator.loginbuttonclick.click();
        waitTime.timeout(10000);
        AddEmployeeLocator.emailname1.sendKeys("a00001@yopmail.com");
        waitTime.timeout(2000);
        AddEmployeeLocator.passwordname1.sendKeys("1qazZAQ!12");
        waitTime.timeout(2000);
        AddEmployeeLocator.iconvisible1.click();
        waitTime.timeout(2000);
        AddEmployeeLocator.loginclick1.click();
        waitTime.timeout(10000);
        driver.close();
        driver.switchTo().window(tabs.get(0));
        System.out.println("End Login");

    }

}
