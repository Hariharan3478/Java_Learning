package Day17;

public class PatternMatchingWithSwitch {

    public static void checkNumber(Object obj) {

        String result = switch (obj) {

            case Integer i when i > 0 ->
                    "Positive number";

            case Integer i when i < 0 ->
                    "Negative number";

            case Integer i ->
                    "Zero";

            default ->
                    "Not an integer";
        };

        System.out.println(result);
    }

    public static void main(String[] args) {

        checkNumber(10);
        checkNumber(-5);
        checkNumber(0);
        checkNumber("Hari");
        checkNumber(25.5);
    }
}
