package pages;

import model.LeaveBuilderLocator;
import model.LoginLocator;
import model.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.LoginCredential;

public class LeaveBuilderPage extends LeaveBuilderLocator {
    WebDriver driver;
    Timeout waitTime=new Timeout();

    public LeaveBuilderPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void leavebuilder()throws InterruptedException{
        System.out.println("Start builder page");
        LeaveBuilderLocator.clickleavemanagement.click();
        waitTime.timeout(1000);
        LeaveBuilderLocator.clickleavebuilder.click();
        waitTime.timeout(4000);
        LeaveBuilderLocator.clickpoland.click();
        waitTime.timeout(2000);
        LeaveBuilderLocator.creatrleave.click();
        waitTime.timeout(3000);
        LeaveBuilderLocator.titleleave.sendKeys("AAAAAAA");
        waitTime.timeout(1000);
        LeaveBuilderLocator.defaukltsamount.sendKeys("23");
        waitTime.timeout(2000);
        LeaveBuilderLocator.selectcolour.click();
        waitTime.timeout(1000);
        LeaveBuilderLocator.selectcolourBlueberry.click();
        waitTime.timeout(1000);
        LeaveBuilderLocator.selecticon.click();
        waitTime.timeout(1000);
        LeaveBuilderLocator.selecticonstudyleave.click();
        waitTime.timeout(2000);
        LeaveBuilderLocator.clickcreatebutton.click();
        waitTime.timeout(5000);
        System.out.println("End builder page");

    }
}
