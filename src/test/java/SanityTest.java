import Pages.GuidesPage;
import Pages.HotelsPage;
import Pages.MainPage;
import Utilities.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SanityTest extends UseCaseBase{
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
    }
    @Test
    public void hotelsPageLoadTest() {
        HotelsPage hotelsPage = mainPage.openHotelsPage();
        boolean success = hotelsPage.headingIsVisible();
        assertTrue(success);
    }

    @Test
    public void guidesPageLoadTest() {
        GuidesPage guidesPage = mainPage.openGuidesPage();
        boolean success = guidesPage.isHeadingVisible();
        assertTrue(success);
    }
}
