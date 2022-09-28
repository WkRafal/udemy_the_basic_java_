package com.exemple.oop.basic.inheritance.polymorfizm_casting;

class Employee {
    private String name;
    private String jobtitle;
    private int salary;

    public Employee() {
        name = "unknown";
        jobtitle = "unknown";
        salary = 4000;
    }

    public Employee(String name, String jobtitle, int salary) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }

    public void doWork() {
        System.out.println("doing work");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Employee: " + name);
    }
}

class Manager extends Employee {
    private String departmentName;

    public Manager() {
        departmentName = "unknown";
    }

    public Manager(String name, String jobtitle, int salary, String departmentName) {
        super(name, jobtitle, salary);
        this.departmentName = departmentName;
    }

    public void hireEmployee() {
        System.out.println("Employee hired");
    }

    public void giveRise(Employee employee) {
        System.out.println("Employee got rise");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void printInfo() {
        System.out.println("Manager: " + getName());
    }

}

class CEO extends Manager {
    private int sharesNumber;

    public CEO() {
        sharesNumber = 100;
    }

    public CEO(String name, String jobtitle, int salary, String departmentName, int sharesNumber) {
        super(name, jobtitle, salary, departmentName);
        this.sharesNumber = sharesNumber;
    }

    public void signContract() {
        System.out.println("Contract signed");
    }

    public int getSharesNumber() {
        return sharesNumber;
    }

    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }

    public void printInfo() {
        System.out.println("CEO: " + getName());
    }
}

public class CompanyCastingExample {
    public static void main(String[] args) {

        Employee employee = new Employee("adam", "programmer",
                10000);
        Manager manager = new Manager("piotr", "team leader",
                10000, "R&D");
        CEO ceo = new CEO("rafal", "prezes", 20000,
                "board", 100);

        Employee employeeCEO = ceo;

        //employeeCEO.signContract(); blad

        if (employeeCEO instanceof CEO) {
            CEO ceo1 = (CEO) employeeCEO;
            ceo1.signContract();
        }

    }
}
