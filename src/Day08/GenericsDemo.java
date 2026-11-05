package Day08;

class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

//    Void set(T value) {
//        this.value = value;
//    }

    T get() {
        return value;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
//        stringBox.set("Hello");
        System.out.println("Value: " + stringBox.get());

        Box<Integer> intBox = new Box<>(23);
//        intBox.set(50);
        System.out.println("Value: " + intBox.get());
    }
}

