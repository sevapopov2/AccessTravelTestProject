import Pages.MainPage;
import Pages.ToursPage;
import Utilities.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToursPageTest extends UseCaseBase {
    private static MainPage mainPage;
    private static ToursPage toursPage;

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        toursPage = new ToursPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
        mainPage.openToursPage();
    }

    @Test
    public void countryListVisibilityTest() {
        boolean success = toursPage.countrySelectorVisible();
        assertTrue(success);
    }

    @Test
    public void russiaPiterSelectionTest() {
        toursPage.russiaPiterSelection();
    }

    @Test
    public void tourSearchTest() {
        toursPage.countrySelectorVisible();
        toursPage.russiaPiterSelection();
        toursPage.searchButtonPress();
        toursPage.clickTourLink();
        boolean isTourHeadingVisible = toursPage.findTourHeading();
        assertTrue(isTourHeadingVisible);
    }
}
