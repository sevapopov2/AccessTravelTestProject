import Pages.HotelsPage;
import Pages.MainPage;
import Utilities.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SanityTest extends UseCaseBase{
    private static MainPage mainPage;
    private static HotelsPage hotelsPage;

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
        mainPage.openHotelsPage();
        boolean success = hotelsPage.headingIsVisible();
        assertTrue(success);
    }
}
