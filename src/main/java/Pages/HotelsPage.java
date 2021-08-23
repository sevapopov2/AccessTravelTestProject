package Pages;

public class HotelsPage extends BasePage{
    private static final String HOTELS_HEADING = "//h3[@class='sub-heading']";
    public boolean headingIsVisible() {
        boolean isVisible = elementExists(HOTELS_HEADING);
        return isVisible;
    }
}
