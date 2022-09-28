public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Jan";
        student1.surname = "Kowalski";
        student1.city = "Warszawa";
        student1.age = 23;
        student1.printBasicData();

        Student student2 = new Student("Piotr", "Marek", "Kraków", 25);
        student2.printBasicData();

        Student student3 = new Student();
        student3.printBasicData();
    }
}
