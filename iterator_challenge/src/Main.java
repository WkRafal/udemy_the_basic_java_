import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            products.add(new Product("Produkt #" + (i + 1)));
        }

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }
    }
}
