import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date dateNow = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(dateNow);
        System.out.println(dateNow);

        calendar.add(Calendar.YEAR,10);
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        calendar.add(Calendar.HOUR,10);
        calendar.add(Calendar.MINUTE,25);
        calendar.add(Calendar.SECOND,6);

        Date dateInFuture = calendar.getTime();
        System.out.println(dateInFuture);

    }
}
