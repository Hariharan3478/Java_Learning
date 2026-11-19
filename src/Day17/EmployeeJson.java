package Day17;

public class EmployeeJson {

    public static void main(String[] args) {

        var employee = """
                {
                    "id": 101,
                    "name": "Hari",
                    "role": "Java Developer",
                    "salary": 30000.50 
                }
                """;

        System.out.println(employee);
    }
}
