package Day17.Sealed_Classes;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager(101, "Hari");
        Developer developer = new Developer(102, "Arun");
        Tester tester = new Tester(103, "Rahul");

        manager.displayDetails();
        manager.displayRole();


        developer.displayDetails();
        developer.displayRole();


        tester.displayDetails();
        tester.displayRole();
    }
}
