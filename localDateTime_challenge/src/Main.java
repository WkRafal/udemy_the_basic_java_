import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str1 = localDateTime.format(dateTimeFormatter);
        LocalDateTime localDateTimeFuture = LocalDateTime.of(2022,11,5,6,7);
        String str2 = localDateTimeFuture.format(dateTimeFormatter);

        System.out.println("Czy " + str2 + " jest po " + str1);
        System.out.println((localDateTime.isAfter(localDateTimeFuture)) ? "tak" : "nie");
    }
}
