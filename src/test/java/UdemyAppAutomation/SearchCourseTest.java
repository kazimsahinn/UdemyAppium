package UdemyAppAutomation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.searchPages;
import setup.BaseTest;




public class SearchCourseTest extends BaseTest {


    public searchPages searchPages;

    @BeforeTest
    public void beforeTest(){

        setup();
        searchPages = new searchPages(driver);

    }


    @Test
    public void test(){
        searchPages.clickStayEnglish();
        searchPages.clickBrowseButton();
        searchPages.clickSearchButton();
        searchPages.clickSearchIcon();
        searchPages.enterSearchText("Appium");
        searchPages.clickSelectFirstSearch();
        searchPages.clickAppiumMobilTestCourse();
        searchPages.displayedCourseTitle();
        searchPages.displayedBuyNowButton();

    }

    @AfterTest
    public void afterTest(){
        tearDown();

    }
}
