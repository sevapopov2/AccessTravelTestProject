import Pages.MainPage;
import Pages.ToursPage;
import Utilities.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class ToursPageTest extends UseCaseBase {
    private MainPage mainPage;
    private ToursPage toursPage;

    @BeforeAll
    public void classSetup() {
        MainPage mainPage = new MainPage();
        ToursPage toursPage = new ToursPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
        mainPage.openToursPage();
    }
}
