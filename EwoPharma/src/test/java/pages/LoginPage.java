package pages;

import model.AddEmployeeLocator;
import model.LoginLocator;
import model.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.LoginCredential;

public class LoginPage extends LoginLocator {
    WebDriver driver;
    LoginCredential loginCredential=new LoginCredential();
    Timeout waitTime=new Timeout();

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void doLogin()throws InterruptedException{
        System.out.println("Start Login");
        waitTime.timeout(2000);
        LoginLocator.emailname.sendKeys(loginCredential.loginemail);
        waitTime.timeout(2000);
        LoginLocator.passwordname.sendKeys(loginCredential.loginpassword);
        waitTime.timeout(2000);
        LoginLocator.iconvisible.click();
        waitTime.timeout(2000);
        LoginLocator.loginclick.click();
        waitTime.timeout(2000);
        LoginLocator.clickthehrdirectory.click();
        waitTime.timeout(5000);
        System.out.println("End Login");

    }

}
