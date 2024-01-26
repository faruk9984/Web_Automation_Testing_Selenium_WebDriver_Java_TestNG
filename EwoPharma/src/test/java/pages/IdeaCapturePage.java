package pages;

import model.AddEmployeeLocator;
import model.IdeaCaptureLocator;
import model.LoginLocator;
import model.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.LoginCredential;

import java.io.File;

public class IdeaCapturePage extends IdeaCaptureLocator {
    WebDriver driver;
    Timeout waitTime=new Timeout();

    public IdeaCapturePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void ideacapture()throws InterruptedException{
        System.out.println("Start idea capture");
        IdeaCaptureLocator.ideacapture.click();
        waitTime.timeout(1000);
        IdeaCaptureLocator.myidea.click();
        waitTime.timeout(3000);
        IdeaCaptureLocator.create.click();
        waitTime.timeout(3000);
        IdeaCaptureLocator.ideatitle.sendKeys("Idea - 7");
        waitTime.timeout(2000);
        IdeaCaptureLocator.ideatype.click();
        waitTime.timeout(2000);
        IdeaCaptureLocator.ideatitleclick.click();
        waitTime.timeout(2000);
        IdeaCaptureLocator.countryofemployee.click();
        waitTime.timeout(2000);
        IdeaCaptureLocator.countryofemployeepoland.click();
        waitTime.timeout(2000);
        IdeaCaptureLocator.selectdepartment.click();
        waitTime.timeout(2000);
        IdeaCaptureLocator.selectdepartmentclick.click();
        waitTime.timeout(2000);
        IdeaCaptureLocator.descriptiondetails.sendKeys("Hello Selise, Dhaka");
        waitTime.timeout(2000);
        File fileToUpload = new File("src/test/resources/"+"0000.pdf");
        IdeaCaptureLocator.dragandrop.sendKeys(fileToUpload.getAbsolutePath());
        waitTime.timeout(5000);
        IdeaCaptureLocator.clicksubmitbutton.click();
        waitTime.timeout(5000);
        System.out.println("End idea capture");

    }

    public void ideacapture2()throws InterruptedException{
//        IdeaCaptureLocator.ideacapture.click();
//        waitTime.timeout(2000);
        IdeaCaptureLocator.idealist.click();
        waitTime.timeout(4000);
        IdeaCaptureLocator.selectregion.click();
        waitTime.timeout(2000);
        IdeaCaptureLocator.selectpoland.click();
        waitTime.timeout(2000);
        IdeaCaptureLocator.selectdepasrtment.click();
        waitTime.timeout(2000);
        IdeaCaptureLocator.selectbs.click();
        waitTime.timeout(3000);

        Actions action=new Actions(driver);
        WebElement drag=IdeaCaptureLocator.selectdrag.get(0);
        WebElement drop=IdeaCaptureLocator.selectdrop.get(1);
        action.dragAndDrop(drag,drop).build().perform();
        waitTime.timeout(5000);
        WebElement drag1=IdeaCaptureLocator.selectdrag.get(1);
        WebElement drop1=IdeaCaptureLocator.selectdroplasr.get(3);
        action.dragAndDrop(drag1,drop1).build().perform();
        waitTime.timeout(5000);

    }
}
