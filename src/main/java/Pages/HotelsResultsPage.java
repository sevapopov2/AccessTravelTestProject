package Pages;

public class HotelsResultsPage extends BasePage{
    private static final String VIEW_HOTEL_LINK = "//a[contains(text(), 'View Hotel')]";
    public boolean resultsAreAvailable() {
        return elementExists(VIEW_HOTEL_LINK);
    }
}
