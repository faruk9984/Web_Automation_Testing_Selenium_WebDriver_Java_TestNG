package testrunner;

import base.Setup;
import model.Timeout;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.LoginCredential;

public class LoginTestRunner extends Setup {
    LoginCredential loginCredential=new LoginCredential();
    Timeout waitTime=new Timeout();

    @Test(priority = 1)
    public void userLogin() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        driver.get(loginCredential.base_url);
        waitTime.timeout(2000);
        loginPage.doLogin();
    }
}
