public class Administrator extends Employee{
    String certificates;

    Administrator(String name, String surname, String certificates) {
        this.name = name;
        this.surname = surname;
        this.certificates = certificates;
    }

    public void printInfo() {
        System.out.println("Employee: " + name +
                " " + surname +
                ", certificates: " + certificates);
    }
}
