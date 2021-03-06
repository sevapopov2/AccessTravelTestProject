package Pages;

public class GuidesPage extends BasePage {
    private static final String GUIDES_HEADING = "//h2[contains(text(), 'and Guides')]";
    private static final String COUNTRY_SELECTION_LIST = "//select[@id='Filter_CountryId']";
    private static final String COUNTRY_ISRAEL_OPTION = "//select[@id='Filter_CountryId']/option[2]";
    private static final String DESTINATION_SELECTION_LIST = "//select[@id='Filter_DestinationId']";
    private static final String TEL_AVIV_OPTION = "//select[@id='Filter_DestinationId']/option[2]";
    // guide types
    private static final String GUIDE_TYPE_LIST = "//select[@id='Filter_GuideType']";
    private static final int ACCOMPANY_GUIDE = 2;
    private static final int VOLUNTEER_GUIDE = 3;
    private static final int ONLINE_ADVISOR_GUIDE = 4;
    private static final int PROFESSIONAL_GUIDE = 5;
    private static final String SEARCH_BUTTON = "//button[@type='submit']";
    private static final String ACCESSIBLE_TEL_AVIV_GUIDE = "//a[@href='/en-US/Guide/Index/31']";
    private static final String ACCESSIBLE_GUIDE_HEADING = "//h2[contains(text(), 'Mobility Scooters')]";

    public boolean isHeadingVisible() {
        return elementExists(GUIDES_HEADING);
    }

    public boolean countrySelectorVisible() {
        return elementExists(COUNTRY_SELECTION_LIST);
    }

    public void israelTelAvivSelection() {
        sendEnterKeyByXpath(COUNTRY_SELECTION_LIST);
        clickElementByXpath(COUNTRY_ISRAEL_OPTION);
        clickElementByXpath(TEL_AVIV_OPTION);
    }

    public String guideTypeSelection(int number) {
        sendEnterKeyByXpath(GUIDE_TYPE_LIST);
        String guideType = GUIDE_TYPE_LIST + "/option[" + number + "]";
        String guideTypeValue = findElementByXpath(guideType).getText();
        clickElementByXpath(guideType);
        return guideTypeValue;
    }

    public String professionalGuideTypeSelection() {
        String professionalGuideType = GUIDE_TYPE_LIST + "/option[" + PROFESSIONAL_GUIDE + "]";
        clickElementByXpath(professionalGuideType);
        return findElementByXpath(professionalGuideType).getText();
    }

    public void searchButtonPress() {
        sendEnterKeyByXpath(SEARCH_BUTTON);
    }

    public String professionalGuideSelectedState() {
        String professionalGuideType = GUIDE_TYPE_LIST + "/option[" + PROFESSIONAL_GUIDE + "]";
        String optionSelectedState = findElementByXpath(professionalGuideType).getAttribute("selected");
        return optionSelectedState;
    }

    public boolean isGuideVisible() {
        return elementExists(ACCESSIBLE_TEL_AVIV_GUIDE);
    }

    public void guideLinkClick() {
        clickElementByXpath(ACCESSIBLE_TEL_AVIV_GUIDE);
    }

    public boolean isGuideHeadingVisible() {
        return elementExists(ACCESSIBLE_GUIDE_HEADING);
    }
}
