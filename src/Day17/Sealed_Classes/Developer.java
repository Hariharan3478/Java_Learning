package Day17.Sealed_Classes;

public final class Developer extends Employee {

    public Developer(int id, String name) {
        super(id, name);
    }

    public void displayRole() {
        System.out.println("Role: Developer");
    }
}