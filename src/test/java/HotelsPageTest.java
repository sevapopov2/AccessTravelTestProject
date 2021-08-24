import Pages.HotelsPage;
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
    public void destinationsFindTest() {
        boolean success = hotelsPage.destinationsListFind();
        assertTrue(success);
    }
    @Test
    public void destinationsSelectionTest() {
        hotelsPage.destinationsListSelection();
    }
}
