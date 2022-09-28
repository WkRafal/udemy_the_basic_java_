public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("jan","kowalski");
        Administrator administrator = new Administrator("michal", "bak", "high");
        Programmer programmer = new Programmer("tom","mac","angielski");
        employee.printInfo();
        administrator.printInfo();
        programmer.printInfo();
    }
}
