package Day17.Sealed_Classes;

public final class Manager extends Employee {

    public Manager(int id, String name) {
        super(id, name);
    }

    public void displayRole() {
        System.out.println("Role: Manager");
    }
}
