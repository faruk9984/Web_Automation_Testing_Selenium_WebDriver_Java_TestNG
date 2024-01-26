package pages;

import model.LoginLocator;
import model.SearchFilterLocator;
import model.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.LoginCredential;

public class SearchFilterPage extends SearchFilterLocator {
    WebDriver driver;
    Timeout waitTime = new Timeout();

    public SearchFilterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void filtersearch() throws InterruptedException {
        System.out.println("Start filter data");
        waitTime.timeout(2000);
        SearchFilterLocator.clickfilterlist.click();
        waitTime.timeout(1000);
        SearchFilterLocator.selectregion.click();
        waitTime.timeout(1000);
        SearchFilterLocator.selectregionpoland.click();
        waitTime.timeout(1000);
        SearchFilterLocator.selectaffilitedrole.click();
        waitTime.timeout(1000);
        SearchFilterLocator.selectaffilitedrolecmpoland.click();
        waitTime.timeout(1000);
        SearchFilterLocator.applyfilter.click();
        waitTime.timeout(4000);
        System.out.println("End filter data");

    }

}
