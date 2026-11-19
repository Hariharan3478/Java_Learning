package Day17;

public class PatternMatching {

    public static void display(Object obj) {

        if (obj instanceof String name) {
            System.out.println("Employee Name: " + name);
        }

        else if (obj instanceof Integer id) {
            System.out.println("Employee ID: " + id);
        }

        else if (obj instanceof Double salary) {
            System.out.println("Employee Salary: " + salary);
        }

        else {
            System.out.println("Unknown Data Type");
        }
    }

    public static void main(String[] args) {

        display("Hari");
        display(101);
        display(30000.50);
        display(true);
    }
}
