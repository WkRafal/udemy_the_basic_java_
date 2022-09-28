public class Student {

    String name;
    String surname;
    String city;
    int age;

    public Student(){
        this.name = "unknown";
        this.surname = "unknown";
        this.city = "unknown";
        this.age = 0;
    }

    public Student(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    public void printBasicData() {
        System.out.println(this.name +
                " " + this.surname +
                " " + this.city +
                " wiek:" + this.age);
    }
}
