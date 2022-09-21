public class Main {
    public static void main(String[] args) {

        String text = "Ola ma kota. ".repeat(3);
        text = text.replace("Ola","Kasia");
        text = text.replaceFirst("Kasia", "Monika");
        System.out.println(text);

        int firstIndex = text.indexOf("Kasia");
        System.out.println("pierwsze wystapienie kasia: " + firstIndex);

        int lastIndex = text.lastIndexOf("Kasia");
        System.out.println("ostatnie wystapienie kasia: " + lastIndex);

        text = text.substring(firstIndex, lastIndex);
        System.out.println(text);
    }
}
