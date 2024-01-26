package testrunner;

import model.Timeout;
import org.testng.annotations.Test;
import pages.AddEmployeePage;
import pages.SearchFilterPage;

public class SearchFilterTestRunner extends LoginTestRunner{
    Timeout waitTime=new Timeout();

    @Test(priority = 3,enabled = false)
    public void applyfilter() throws InterruptedException {
        SearchFilterPage searchFilterPage=new SearchFilterPage(driver);
        searchFilterPage.filtersearch();
    }

}
