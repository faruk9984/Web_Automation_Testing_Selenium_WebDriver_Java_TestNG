package testrunner;

import base.Setup;
import model.Timeout;
import org.testng.annotations.Test;
import pages.LeaveBuilderPage;
import pages.SearchFilterPage;

public class LeaveBuilderTestRunner extends LoginTestRunner {
    Timeout waitTime=new Timeout();

    @Test(priority = 4, enabled = false)
    public void Leavebuilderrun() throws InterruptedException {
        LeaveBuilderPage leaveBuilderPage=new LeaveBuilderPage(driver);
        leaveBuilderPage.leavebuilder();
    }
}
