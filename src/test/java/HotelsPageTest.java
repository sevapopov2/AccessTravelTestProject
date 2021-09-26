import Pages.HotelsPage;
import Pages.HotelsResultsPage;
import Pages.MainPage;
import Utilities.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelsPageTest extends UseCaseBase {
    private static MainPage mainPage;
    private static HotelsPage hotelsPage;

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        hotelsPage = new HotelsPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
        mainPage.openHotelsPage();
    }

    @Test
    public void destinationsSelectionTest() {
        hotelsPage.destinationsListSelection();
        hotelsPage.piterOptionFind();
    }

    @Test
    public void checkinDateFindTest() {
        boolean editorExists = hotelsPage.checkinDateFind();
        assertTrue(editorExists);
    }

    @Test
    public void checkinSelectionTest() {
        String checkinDate = hotelsPage.checkinDateSelection("2021-09-25");
        assertEquals("2021-09-25", checkinDate);
    }

    @Test
    public void checkoutSelectionTest() {
        String checkOutDate = hotelsPage.checkoutDateSelection("2021-10-01");
        assertEquals("2021-10-01", checkOutDate);
    }

    @Test
    public void adultsCountSelectionTest() {
        String adultsCount = hotelsPage.adultsCountSelection("4");
        assertEquals("4", adultsCount);
    }

    @Test
    public void childrenCountSelectionTest() {
        String childrenCount = hotelsPage.childrenCountSelection("2");
        assertEquals("2", childrenCount);
    }
    @Test
    public void openResultsPageTest() {
        HotelsResultsPage hotelsResultsPage = hotelsPage.openResultsPage();
        boolean resultsAreAvailable = hotelsResultsPage.resultsAreAvailable();
        assertTrue(resultsAreAvailable);

    }
    @Test
    public void findPiterHotelsTest() {
        hotelsPage.piterOptionClick();
        String checkinDate = hotelsPage.checkinDateSelection("2021-10-01");
        assertEquals("2021-10-01", checkinDate);
        String checkoutDate = hotelsPage.checkoutDateSelection("2021-10-10");
        assertEquals("2021-10-10", checkoutDate);
        String adultsCount = hotelsPage.adultsCountSelection("4");
        assertEquals("4", adultsCount);
        String childrenCount = hotelsPage.childrenCountSelection("0");
        assertEquals("0", childrenCount);
        HotelsResultsPage hotelsResultsPage = hotelsPage.openResultsPage();
        boolean resultsAreLoaded = hotelsResultsPage.resultsAreAvailable();
        assertTrue(resultsAreLoaded);
    }
}
