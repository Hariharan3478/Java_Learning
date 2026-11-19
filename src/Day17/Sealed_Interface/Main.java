package Day17.Sealed_Interface;

public class Main {

    public static void main(String[] args) {

        Payment p1 = new Cash(500);
        Payment p2 = new Card(1000);
        Payment p3 = new UPI(1500);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
