package Day03;

class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}

public class ClassAndObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.speed = 60;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.speed = 80;

        car1.drive();
        car2.drive();
    }
}