package Pages;

public class GuidesPage extends BasePage {
    private static final String GUIDES_HEADING = "//h2[contains(text(), 'and Guides')]";
    private static final String COUNTRY_SELECTION_LIST = "//select[@id='Filter_CountryId']";

    public boolean isHeadingVisible() {
        return elementExists(GUIDES_HEADING);
    }

    public boolean countrySelectorVisible() {
        return elementExists(COUNTRY_SELECTION_LIST);
    }
}
