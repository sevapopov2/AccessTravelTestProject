package Pages;

public class ToursPage extends BasePage {
    private static final String TOURS_PAGE_HEADING = "//h2[contains(text(), 'tours and services')]";
    // Saint-petersburg selection
    private static final String COUNTRY_SELECTION_LIST = "//select[@id='Filter_CountryId']";
    private static final String COUNTRY_RUSSIA_OPTION = "//select[@id='Filter_CountryId']/option[9]";
    private static final String DESTINATION_SELECTION_LIST = "//select[@id='Filter_DestinationId']";
    private static final String PITER_OPTION = "//select[@id='Filter_DestinationId']/option[3]";
    private static final String SEARCH_BUTTON = "//button[@type='submit']";
    private static final String SEVEN_DAYS_TOUR = "//a[contains(@href, '/en-US/Tour/Index/60')]";
    private static final String SEVEN_DAYS_TOUR_HEADING = "//h2[contains(text(), '7 days tour')]";

    public boolean isHeadingVisible() {
        boolean isVisible = elementExists(TOURS_PAGE_HEADING);
        return isVisible;
    }

    public boolean countrySelectorVisible() {
        return elementExists(COUNTRY_SELECTION_LIST);
    }

    public void clickCountrySelector() {
        clickElementByXpath(COUNTRY_SELECTION_LIST);
    }

    public boolean russiaIsAvailable() {
        return elementExists(COUNTRY_RUSSIA_OPTION);
    }

    public void russiaPiterSelection() {
        sendEnterKeyByXpath(COUNTRY_SELECTION_LIST);
        clickElementByXpath(COUNTRY_RUSSIA_OPTION);
        clickElementByXpath(PITER_OPTION);
    }

    public void searchButtonPress() {
        sendEnterKeyByXpath(SEARCH_BUTTON);
    }

    public void clickTourLink() {
        sendEnterKeyByXpath(SEVEN_DAYS_TOUR);
    }

    public boolean findTourHeading() {
        return elementExists(SEVEN_DAYS_TOUR_HEADING);
    }
}
