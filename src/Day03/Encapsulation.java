package Day03;

class Employee {
    private String name;
    private int age;

    Employee(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException(
                    "Employee age must be at least 18."
            );
        }

        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee employee = new Employee("Hariharan", 22);

        System.out.println(employee.getName());
        System.out.println(employee.getAge());

        employee.setAge(23);
        System.out.println(employee.getAge());


        try {
            employee.setAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(employee.getAge());
    }
}