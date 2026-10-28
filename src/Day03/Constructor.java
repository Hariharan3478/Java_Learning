package Day03;

class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Hariharan", 22);

        student1.display();
        student2.display();
    }
}
