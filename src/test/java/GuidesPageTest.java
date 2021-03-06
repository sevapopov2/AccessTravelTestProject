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
    public void israelTelAvivSelectionTest() {
        guidesPage.israelTelAvivSelection();
    }

    @ParameterizedTest
    @ValueSource(ints = { 2, 3, 4, 5 })
    public void guideTypeSelectionTest(int number) {
        String currentType = guidesPage.guideTypeSelection(number);
        assertNotNull(currentType);
    }

    @Test
    public void professionalGuideTypeSelectionTest() {
        String guideTypeValue = guidesPage.professionalGuideTypeSelection();
        assertEquals("Professional Guide", guideTypeValue);
    }

    @Test
    public void telAvivGuidesSearchTest() {
        guidesPage.israelTelAvivSelection();
        guidesPage.professionalGuideTypeSelection();
        guidesPage.searchButtonPress();
        String selectedState = guidesPage.professionalGuideSelectedState();
        assertNotNull(selectedState);
        assertEquals("true", selectedState);
        boolean isGuideLinkVisible = guidesPage.isGuideVisible();
        assertTrue(isGuideLinkVisible);
    }

    @Test
    public void openGuideInfo() {
        guidesPage.israelTelAvivSelection();
        guidesPage.professionalGuideTypeSelection();
        guidesPage.searchButtonPress();
        String selectedState = guidesPage.professionalGuideSelectedState();
        assertNotNull(selectedState);
        assertEquals("true", selectedState);
        boolean isGuideLinkVisible = guidesPage.isGuideVisible();
        assertTrue(isGuideLinkVisible);
        guidesPage.guideLinkClick();
        boolean isGuideHeadingVisible = guidesPage.isGuideHeadingVisible();
        assertTrue(isGuideHeadingVisible);
    }
}
