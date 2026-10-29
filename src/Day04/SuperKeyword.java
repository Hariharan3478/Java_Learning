package Day04;

class Vehicle {
    Vehicle(String brand) {
        System.out.println("Brand: " + brand);
    }

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    Car() {
        super("Toyota");
    }

    @Override
    void start() {
        super.start();
        System.out.println("Car engine is ready");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
