package Pages;

import Consts.Consts;

public class MainPage extends BasePage{
    private static final String LOGO = "//a[class='logo']";

    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);
    }

    public boolean isLogoVisible() {
        boolean isVisible = elementExists(LOGO);
        return isVisible;
    }
}
