package Day17;

public class POJOToRecord {

    public static void main(String[] args) {

//        Employee emp = new Employee(101, "Hari", 30000);
//
//        System.out.println(emp.getId());
//        System.out.println(emp.getName());
//        System.out.println(emp.getSalary());
//
//        emp.setSalary(40000);
//
//        System.out.println("Updated Salary: " + emp.getSalary());

        Employee emp = new Employee(101, "Hari", 30000);

        System.out.println(emp.id());
        System.out.println(emp.name());
        System.out.println(emp.salary());

        System.out.println(emp);

        Employee updatedEmp = new Employee(emp.id(), emp.name(), 40000);

        System.out.println(updatedEmp);
    }
}
