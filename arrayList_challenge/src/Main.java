import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");
        System.out.println(names.get(0));
        System.out.println("---------------");
        names.set(2,"Olek");
        for (String name : names){
            System.out.println(name);
        }
        System.out.println("-----------------");
        names.add(1,"Karol");
        for (String name : names){
            System.out.println(name);
        }
        System.out.println("-------------------");
        names.remove(0);
        for (String name : names){
            System.out.println(name);
        }
    }
}
