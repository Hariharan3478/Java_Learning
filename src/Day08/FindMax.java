package Day08;

public class FindMax {

    public static <T extends Comparable<T>> T findMaximum(
            T a, T b, T c) {

        T maximum = a;

        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }

        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }

        return maximum;
    }

    public static void main(String[] args) {

        System.out.println(findMaximum(10, 50, 30));

        System.out.println(findMaximum(5.5, 8.5, 2.5));

        System.out.println(
                findMaximum("Apple", "Mango", "Banana")
        );
    }
}
