package Pages;

import org.openqa.selenium.Keys;

public class GuidesPage extends BasePage {
    private static final String GUIDES_HEADING = "//h2[contains(text(), 'and Guides')]";
    private static final String COUNTRY_SELECTION_LIST = "//select[@id='Filter_CountryId']";
    private static final String COUNTRY_RUSSIA_OPTION = "//select[@id='Filter_CountryId']/option[9]";
    private static final String DESTINATION_SELECTION_LIST = "//select[@id='Filter_DestinationId']";
    private static final String PITER_OPTION = "//select[@id='Filter_DestinationId']/option[3]";
    //    guide types
    private static final String GUIDE_TYPE_LIST = "//select[@id='Filter_GuideType']";
    private static final String ACCOMPANY_GUIDE = "//select[@id='Filter_GuideType']/option[2]";
    private static final String VOLUNTEER_GUIDE = "//select[@id='Filter_GuideType']/option[3]";
    private static final String ONLINE_ADVISOR_GUIDE = "//select[@id='Filter_GuideType']/option[4]";
    private static final String PROFESSIONAL_GUIDE = "//select[@id='Filter_GuideType']/option[5]";

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

    public String guideTypeSelection(String name) {
        sendKeypressesByXpath(GUIDE_TYPE_LIST, Keys.ENTER);
        clickElementByXpath(name);
        return findElementByXpath(name).getText();
    }

    public String accompanyguideSelection() {
        clickElementByXpath(ACCOMPANY_GUIDE);
        return findElementByXpath(ACCOMPANY_GUIDE).getText();
    }
}
