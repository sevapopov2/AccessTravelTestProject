package Pages;

public class HotelsPage extends BasePage{
    private static final String HOTELS_HEADING = "//h3[@class='sub-heading']";
    private static final String DESTINATIONS_LIST = "//select[@id='Filter_DestinationId']";
    private static final String PITER_OPTION = "//select[@id='Filter_DestinationId']/option[5]";
    public boolean headingIsVisible() {
        boolean isVisible = elementExists(HOTELS_HEADING);
        return isVisible;
    }
    public boolean destinationsListFind() {
        return elementExists(DESTINATIONS_LIST);
    }
    public void destinationsListSelection() {
        clickElementByXpath(DESTINATIONS_LIST);
    }
    public String piterOptionFind() {
        return findElementByXpath(PITER_OPTION).getText();
    }
}
