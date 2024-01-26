package testrunner;

import model.Timeout;
import org.testng.annotations.Test;
import pages.AddEmployeePage;
import pages.LoginPage;

public class AddEmployeeTestRunner extends LoginTestRunner{
    Timeout waitTime=new Timeout();

    @Test(priority = 2, enabled = false)
    public void createemployee() throws InterruptedException {
        AddEmployeePage addEmployeePage=new AddEmployeePage(driver);
        addEmployeePage.CreateEmployee();
//        addEmployeePage.doLoginaccountactive();
    }
}
