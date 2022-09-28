public class Main {
    public static void main(String[] args) {

        Browser chrome = new Chrome();
        Browser firefox = new FireFox();

        chrome.goToPage("interia.pl");
        firefox.goToPage("wp.pl");
    }
}
