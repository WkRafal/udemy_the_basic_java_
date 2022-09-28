public interface Browser {
    static final String ENGINE = "WebKit";

    default String getEngine() {
        return Browser.ENGINE;
    }

    void goToPage(String url);

    void refreshPage();

    void bookmarkPage();
}
