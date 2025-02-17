package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class searchPages {
   private AppiumDriver driver;
   private WebDriverWait wait;



     By stayEnglish = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.udemy.android:id/com_braze_inappmessage_modal_button_dual_two\")");
     By browseButton = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.udemy.android:id/browse_button\")");
     By searchButton = AppiumBy.androidUIAutomator("new UiSelector().text(\"Search\")");
     By searchText = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.udemy.android:id/search_bar_text\")");
     By selectFirstSearch = AppiumBy.androidUIAutomator("new UiSelector().text(\"Top searches\")");
     By sıfırdanAppiumMobilTest = AppiumBy.androidUIAutomator("new UiSelector().text(\"Sıfırdan Appium & Java İle Mobil Test Otomasyonu Öğrenin\")");
     By buyNowButton = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.udemy.android:id/btnBuyNow\")");
     By searchIcon = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.udemy.android:id/left_action\")");




    public searchPages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    public void waitForElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public void clickStayEnglish() {
        waitForElement(stayEnglish);
        driver.findElement(stayEnglish).click();
    }

    public void clickBrowseButton() {
        waitForElement(browseButton);
        driver.findElement(browseButton).click();
    }

    public void clickSearchButton() {
        waitForElement(searchButton);
        driver.findElement(searchButton).click();
    }

    public void enterSearchText(String text) {
        waitForElement(searchText);
        driver.findElement(searchText).sendKeys(text);
    }

    public void clickSearchIcon(){
        waitForElement(searchIcon);
        driver.findElement(searchIcon).click();
    }

    public void clickSelectFirstSearch() {
        waitForElement(selectFirstSearch);
        driver.findElement(selectFirstSearch).click();
    }

    public void clickSıfırdanAppiumMobilTest() {
        waitForElement(sıfırdanAppiumMobilTest);
        driver.findElement(sıfırdanAppiumMobilTest).click();
    }

    public void displayedBuyNowButton() {
        waitForElement(buyNowButton);
        driver.findElement(buyNowButton).isDisplayed();
    }


}


