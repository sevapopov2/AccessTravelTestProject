package Pages;

import Consts.Consts;

public class MainPage extends BasePage {
    private static final String LOGO = "//*[@alt='Alt']";
    private static final String HOTELS_LINK = "//a[@class='hotels']";
    private static final String GUIDES_LINK = "//a[@class='guides js-list-guides']";
    private static final String TOURS_LINK = "//a[@class='tours js-list-tours']";
    private static final String THINGS_TO_DO_LINK = "//a[@class='tours attraction-link']";
    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);
    }

    public boolean isLogoVisible() {
        boolean isVisible = elementExists(LOGO);
        return isVisible;
    }
    public HotelsPage openHotelsPage() {
        clickElementByXpath(HOTELS_LINK);
        return new HotelsPage();
    }
    public GuidesPage openGuidesPage() {
        clickElementByXpath(GUIDES_LINK);
        return new GuidesPage();
    }
}
