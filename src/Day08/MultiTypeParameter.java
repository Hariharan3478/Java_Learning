package Day08;

class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void display() {
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
}

public class MultiTypeParameter {

    public static void main(String[] args) {

        Pair<Integer, String> student = new Pair<>(101, "Hari");

        Pair<String, Double> product = new Pair<>("Laptop", 55000.0);

        Pair<Integer, Double> employee = new Pair<>(1001, 45000.0);

        student.display();
        product.display();
        employee.display();
    }
}