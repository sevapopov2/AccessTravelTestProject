package Pages;

public class ToursPage extends BasePage{
    private static final String TOURS_PAGE_HEADING = "//h2[contains(text(), 'tours and services')]";
    public boolean isHeadingVisible() {
        boolean isVisible = elementExists(TOURS_PAGE_HEADING);
        return isVisible;
    }
}
