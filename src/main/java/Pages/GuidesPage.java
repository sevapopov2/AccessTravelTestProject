package Pages;

import org.openqa.selenium.Keys;

public class GuidesPage extends BasePage {
    private static final String GUIDES_HEADING = "//h2[contains(text(), 'and Guides')]";
    private static final String COUNTRY_SELECTION_LIST = "//select[@id='Filter_CountryId']";
    private static final String COUNTRY_RUSSIA_OPTION = "//select[@id='Filter_CountryId']/option[9]";
    private static final String DESTINATION_SELECTION_LIST = "//select[@id='Filter_DestinationId']";
    private static final String PITER_OPTION = "//select[@id='Filter_DestinationId']/option[3]";

    public boolean isHeadingVisible() {
        return elementExists(GUIDES_HEADING);
    }

    public boolean countrySelectorVisible() {
        return elementExists(COUNTRY_SELECTION_LIST);
    }
    public void russiaPiterSelection() {
        sendKeypressesByXpath(COUNTRY_SELECTION_LIST, Keys.ENTER);
        clickElementByXpath(COUNTRY_RUSSIA_OPTION);
        clickElementByXpath(PITER_OPTION);
    }
}
