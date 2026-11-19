package Day17.Sealed_Classes;

non-sealed class Tester extends Employee {

    public Tester(int id, String name) {
        super(id, name);
    }

    public void displayRole() {
        System.out.println("Role: Tester");
    }
}