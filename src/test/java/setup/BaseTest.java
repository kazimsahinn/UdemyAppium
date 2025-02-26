package setup;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected static AndroidDriver driver;
    protected static WebDriverWait wait;

    public void setup() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        try {
            capabilities.setCapability("deviceName", "Pixel 4 API 29");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("platformVersion", "10.0");
            capabilities.setCapability("appPackage", "com.udemy.android");
            capabilities.setCapability("appActivity", "com.udemy.android.SplashActivity");
            capabilities.setCapability("skipUnlock", "true");
            capabilities.setCapability("noReset", "false");
            capabilities.setCapability("automationName", "UiAutomator2");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        } catch (MalformedURLException e) {
            System.out.println("Hatalı URL: " + e.getMessage());
        }
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
