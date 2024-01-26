package testrunner;

import model.Timeout;
import org.testng.annotations.Test;
import pages.AddEmployeePage;
import pages.PmPage;

public class PmTestRunner extends LoginTestRunner{
    Timeout waitTime=new Timeout();

    @Test(priority = 2,enabled = false)
    public void performancemanagementt() throws InterruptedException {
        PmPage pmPage=new PmPage(driver);
        pmPage.performancemanager();

    }
}
