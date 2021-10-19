import Pages.GuidesPage;
import Pages.MainPage;
import Utilities.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class GuidesPageTest extends UseCaseBase {
    private static MainPage mainPage;
    private static GuidesPage guidesPage;
    private static final String ACCOMPANY_GUIDE = "//select[@id='Filter_GuideType']/option[2]";
    private static final String VOLUNTEER_GUIDE = "//select[@id='Filter_GuideType']/option[3]";
    private static final String ONLINE_ADVISOR_GUIDE = "//select[@id='Filter_GuideType']/option[4]";
    private static final String PROFESSIONAL_GUIDE = "//select[@id='Filter_GuideType']/option[5]";

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

    @Test
    public void russiaPiterSelectionTest() {
        guidesPage.russiaPiterSelection();
    }

    @ParameterizedTest
    @ValueSource(strings = {ACCOMPANY_GUIDE, VOLUNTEER_GUIDE})
    public void guideTypeSelectionTest(String name) {
        String currentGuideType = guidesPage.guideTypeSelection(name);
        assertEquals("Accompany", currentGuideType);
        assertEquals("Volunteer", currentGuideType);
    }
}
