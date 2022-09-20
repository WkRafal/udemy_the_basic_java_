public class Main3 {
    public static void main(String[] args) {

        boolean rainning = false;
        boolean haveAmbrella = false;
        int temperature = 13;

         if (temperature > -28 && temperature < 40) {
             if (temperature > -18 && temperature < 18 && rainning && haveAmbrella) {
                 System.out.println("mozesz wyjsc");
             } else if (temperature > 12 && !rainning) {
                 System.out.println("mozesz wyjsc");
             } else {
                 System.out.println("zostan w domu");
             }
         } else {
             System.out.println("zostan w domu");
         }

         if (temperature > 48 || temperature < -28) {
             System.out.println("zostan w domu");
         } else if (temperature > -10 && temperature < 10 && rainning && haveAmbrella) {
             System.out.println("mozesz wyjsc pada i ma parasolke");
         } else  if (!rainning && temperature > 12) {
             System.out.println(" nie pada mozesz isc");
         } else {
             System.out.println("zostan w domu");
         }
    }
}
