package Pages;

public class HotelsPage extends BasePage{
    private static final String HOTELS_HEADING = "//h3[@class='sub-heading']";
    private static final String DESTINATIONS_LIST = "//select[@id='Filter_DestinationId']";
    private static final String PITER_OPTION = "//select[@id='Filter_DestinationId']/option[5]";
    private static final String CHECKIN_DATE = "//input[@name='Filter.CheckIn']";
    private static final String CHECKOUT_DATE = "//input[@name='Filter.CheckOut']";
    private static final String ADULTS_COUNT_EDITOR = "//input[@id='Filter_AdultNum";
    private static final String CHILDREN_COUNT_EDITOR = "//input[@id='Filter_ChildrenNum]";
    private static final String SEARCH_BUTTON = "//button[@type='submit']";
    public boolean headingIsVisible() {
        boolean isVisible = elementExists(HOTELS_HEADING);
        return isVisible;
    }
    public void destinationsListSelection() {
        clickElementByXpath(DESTINATIONS_LIST);
    }
    public String piterOptionFind() {
        return findElementByXpath(PITER_OPTION).getText();
    }
    public void checkinDateChanging(String checkinDate) {
        sendKeysToElementByXpath(CHECKIN_DATE, checkinDate);
    }
}
