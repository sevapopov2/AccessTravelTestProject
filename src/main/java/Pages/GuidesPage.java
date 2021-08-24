package Pages;

public class GuidesPage extends BasePage{
    private static final String GUIDES_HEADING = "//h2[contains(text(), 'and Guides')]";
    public boolean isHeadingVisible() {
        return elementExists(GUIDES_HEADING);
    }
}
