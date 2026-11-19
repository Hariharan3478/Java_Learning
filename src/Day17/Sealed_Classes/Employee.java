package Day17.Sealed_Classes;

public sealed class Employee
        permits Manager, Developer, Tester {

    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
