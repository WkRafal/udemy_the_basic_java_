import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        long timestamp = date.getTime();

        System.out.println(timestamp);

        int days = 3;
        int houres = 18;
        int minutes = 25;

        long milisekund = days * 1000 * 60 * 60 * 24+
                houres * 1000 * 60 * 60 +
                minutes * 1000 * 60;

        timestamp += milisekund;
        date = new Date(timestamp);
        System.out.println(date);

    }
}
