package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {
    public WebDriver driver;
    @BeforeTest
    public void openDriver(){
//        For Chrome
//        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
//        ChromeOptions ops=new ChromeOptions();
//        ops.addArguments("--headed");
//        driver=new ChromeDriver(ops);

//        WebDriverManager.chromedriver().setup();
//        ChromeOptions option=new ChromeOptions();
//        option.addArguments("--remote-allow-origins=*");
//        driver=new ChromeDriver();

// For Firefox
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void closeDriver(){
//        driver.close();
//       driver.quit();
    }
}
