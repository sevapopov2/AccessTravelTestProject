package Pages;

import Consts.Consts;

public class MainPage extends BasePage {
    private static final String LOGO = "//*[@alt='Alt']";
    private static final String HOTELS_LINK = "//a[text() = ' Hotels']";
    private static final String GUIDES_LINK = "//a[contains(text(), 'Guides')]";
    private static final String TOURS_LINK = "//a[contains(text(), 'Tours')]";
    private static final String THINGS_TO_DO_LINK = "//a[contains(text(), 'Things to do')]"
    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);
    }

    public boolean isLogoVisible() {
        boolean isVisible = elementExists(LOGO);
        return isVisible;
    }
}
