package Pages;

public class ThingsToDoPage extends BasePage{
    private static final String THINGS_TO_DO_HEADING = "//h1[contains(text(), 'inclusive cities')]";
    public boolean isHeadingVisible() {
        boolean isVisible = elementExists(THINGS_TO_DO_HEADING);
        return isVisible;
    }
}
