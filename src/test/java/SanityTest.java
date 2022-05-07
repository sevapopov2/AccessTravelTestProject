import Pages.*;
import Utilities.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SanityTest extends UseCaseBase {
    private static MainPage mainPage;

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void mainPageLoadTest() {
        boolean success = mainPage.isLogoVisible();
        assertTrue(success);
        //mainPage.takeScreenshot("mainPageTestResult");
    }

    @Test
    public void hotelsPageLoadTest() {
        HotelsPage hotelsPage = mainPage.openHotelsPage();
        boolean success = hotelsPage.headingIsVisible();
        assertTrue(success);
        hotelsPage.takeScreenshot("hotelsPageLoadTest");
    }

    @Test
    public void guidesPageLoadTest() {
        GuidesPage guidesPage = mainPage.openGuidesPage();
        boolean success = guidesPage.isHeadingVisible();
        assertTrue(success);
        guidesPage.takeScreenshot("guidesPageLoadTest");
    }

    @Test
    public void toursPageLoadTest() {
        ToursPage toursPage = mainPage.openToursPage();
        boolean success = toursPage.isHeadingVisible();
        assertTrue(success);
        toursPage.takeScreenshot("toursPageLoadTest");
    }

    @Test
    public void thingsToDoLoadTest() {
        ThingsToDoPage thingsToDoPage = mainPage.openThingsToDoPage();
        boolean success = thingsToDoPage.isHeadingVisible();
        assertTrue(success);
        thingsToDoPage.takeScreenshot("thingsToDoLoadTest");
    }
}
