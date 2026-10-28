package Day03;

class Employe {
    String name;

    Employe(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Employee: " + name);
    }
}

class Developer extends Employe {
    Developer(String name) {
        super(name);
    }

    void writeCode() {
        System.out.println(name + " writes code.");
    }
}

class Manager extends Employe{
    Manager(String name) {
        super(name);
    }

    void manageTeam() {
        System.out.println(name + " manages the team.");
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Developer developer = new Developer("Hariharan");
        developer.displayName();
        developer.writeCode();

        Manager manager = new Manager("Sukish");
        manager.displayName();
        manager.manageTeam();
    }
}