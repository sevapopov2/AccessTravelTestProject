import Pages.HotelsPage;
import Pages.MainPage;
import Utilities.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

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
}
