package pages;

import model.LoginLocator;
import model.PmLocator;
import model.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.LoginCredential;

public class PmPage extends PmLocator {
    WebDriver driver;
    Timeout waitTime=new Timeout();

    public PmPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void performancemanager()throws InterruptedException{
        System.out.println("Start");
        PmLocator.clickpm.click();
        waitTime.timeout(1000);
        PmLocator.clickfunctionmanager.click();
        waitTime.timeout(2000);
        PmLocator.roleselect.click();
        waitTime.timeout(1000);
        PmLocator.clickpoland.click();
        waitTime.timeout(1000);
        PmLocator.edit.click();
        waitTime.timeout(2000);
        PmLocator.description.sendKeys("Hello Good People -. Dhaka Bangladesh");
        waitTime.timeout(1000);
        PmLocator.clickdone.click();
        waitTime.timeout(3000);

        PmLocator.assessment.click();
        waitTime.timeout(2000);
        PmLocator.create.click();
        waitTime.timeout(5000);
        PmLocator.titlename.sendKeys("AAAAAA");
        waitTime.timeout(1000);
        PmLocator.clickdateline.click();
        waitTime.timeout(1000);
        PmLocator.clickdateline1.click();
        waitTime.timeout(1000);
        PmLocator.clickdateline2.click();
        waitTime.timeout(1000);
        PmLocator.clickdateline3.click();
        waitTime.timeout(1000);
        PmLocator.clickdateline4.click();
        waitTime.timeout(1000);
        PmLocator.selectregion.get(0).click();
        waitTime.timeout(1000);
        PmLocator.selectpoland.click();
        waitTime.timeout(1000);
        PmLocator.clcikcmpoland.click();
        waitTime.timeout(1000);

        PmLocator.selectregion1.get(0).click();
        waitTime.timeout(1000);
        PmLocator.clcikcslovakia.click();
        waitTime.timeout(1000);
        PmLocator.clcikcslovakias.click();
        waitTime.timeout(2000);
        PmLocator.clicksubmitbutton.click();
        waitTime.timeout(5000);





        System.out.println("End");

    }
}
