package UdemyAppAutomation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.searchPages;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class SearchCourseTest {

    private AppiumDriver driver;
    public WebDriverWait wait;
    public searchPages searchPages;




    @BeforeTest
    public void beforeTest(){


        DesiredCapabilities capabilities = new DesiredCapabilities();
        try {
            capabilities.setCapability("deviceName","Pixel 4 API 29");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("platformVersion","10.0");
            capabilities.setCapability("appPackage", "com.udemy.android");
            capabilities.setCapability("appActivity", "com.udemy.android.SplashActivity");
            capabilities.setCapability("skipUnlock","true");
            capabilities.setCapability("noReset","false");
            capabilities.setCapability("automationName","UiAutomator2");


            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            searchPages = new searchPages(driver);


        }

        catch (MalformedURLException mx){
            System.out.println("Hatalı Olusturulmus URL");
        }

    }


    @Test
    public void test() {
        searchPages.clickStayEnglish();
        searchPages.clickBrowseButton();
        searchPages.clickSearchButton();
        searchPages.clickSearchIcon();
        searchPages.enterSearchText("Appium");
        searchPages.clickSelectFirstSearch();
        searchPages.clickSıfırdanAppiumMobilTest();
        searchPages.displayedBuyNowButton();

    }


    @AfterTest
    public void tearDown(){
        driver.quit();

    }
}
