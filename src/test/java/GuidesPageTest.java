import Pages.GuidesPage;
import Pages.MainPage;
import Utilities.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuidesPageTest extends UseCaseBase {
    private static MainPage mainPage;
    private static GuidesPage guidesPage;

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        guidesPage = new GuidesPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
        mainPage.openGuidesPage();
    }

    @Test
    public void countryListVisibilityTest() {
        boolean success = guidesPage.countrySelectorVisible();
        assertTrue(success);
    }
}
