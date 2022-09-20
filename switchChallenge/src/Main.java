public class Main {

    enum Seasons {SPRING, SUMMER, AUTUMN, WINTER}

    public static void main(String[] args) {

        int monthNum = 6;

        switch (monthNum) {
            case 3:
            case 4:
            case 5:
                System.out.println(Seasons.SPRING);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(Seasons.SUMMER);
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(Seasons.AUTUMN);
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(Seasons.WINTER);
                break;
            default:
                System.out.println("blad");
        }

        String season = "";

        switch (monthNum) {
            case 3:
            case 4:
            case 5:
                season = "wiosna";
                break;
            case 6:
            case 7:
            case 8:
                season = "lato";
                break;
            case 9:
            case 10:
            case 11:
                season = "jesien";
                break;
            case 12:
            case 1:
            case 2:
                season = "zima";
                break;
            default:
                season = "brak danych";
        }

                System.out.println("numer miesiaca:"+ monthNum + " to pora roku:" + season);
    }
}
