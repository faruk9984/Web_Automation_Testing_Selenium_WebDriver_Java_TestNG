package testrunner;

import model.Timeout;
import org.testng.annotations.Test;
import pages.IdeaCapturePage;
import pages.PmPage;

public class IdeaCaptureTestRunner extends LoginTestRunner{
    Timeout waitTime=new Timeout();

    @Test(priority = 2)
    public void ideacapturee() throws InterruptedException {
        IdeaCapturePage ideaCapturePage=new IdeaCapturePage(driver);
        ideaCapturePage.ideacapture();
        ideaCapturePage.ideacapture2();

    }
}
