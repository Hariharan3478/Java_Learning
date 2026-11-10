package Day11;

import java.io.*;

class Employee implements Serializable {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationAndDeserialization{

    public static void main(String[] args) throws Exception {

        Employee emp = new Employee(101, "Hari");

        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("employee.ser")
        );

        out.writeObject(emp);
        out.close();

        System.out.println("Object serialized!");

        // Deserialization
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("employee.ser")
        );

        Employee e = (Employee) in.readObject();
        in.close();

        System.out.println(e.id);
        System.out.println(e.name);
    }
}
