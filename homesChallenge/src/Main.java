public class Main {
    public static void main(String[] args) {

        Flat homes[] = new Flat[10];

        for (int i = 0; i < homes.length; i++) {
            int random = (int) Math.floor(Math.random() * 3);
            switch (random) {
                case 0:
                    homes[i] = new Flat("Bielsko","kolorowa");
                    break;
                case 1:
                    homes[i] = new House("Mierzecice", "wolnosci", 12000);
                    break;
                case 2:
                    homes[i] = new Residence("Szczyrk","jrzebinowa", 5000, 200);
                    break;
            }
        }

        int flatNum = 0;
        int houseNum = 0;
        int residenceNum = 0;

        for (int i = 0; i < homes.length; i++) {
            System.out.println("Home: " + (i + 1));
            if (homes[i] instanceof Residence) {
                Residence residence = (Residence) homes[i];
                System.out.println("Residence garageSize: " + residence.getGarageSize());
                System.out.println(residence.toString());
                residenceNum++;
            } else if (homes[i] instanceof House) {
                House house = (House) homes[i];
                System.out.println("House parcelSize: " + house.getParcelSize());
                System.out.println(house.toString());
                houseNum++;
            } else {
                System.out.println(homes[i].toString());
                flatNum++;
            }
        }

        System.out.println("Flat: " + flatNum);
        System.out.println("House: " + houseNum);
        System.out.println("Residence: " + residenceNum);
    }
}
