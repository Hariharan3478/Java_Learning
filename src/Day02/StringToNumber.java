package Day02;

public class StringToNumber {
    public static void main(String[] args) {

        String number = "100";
        String decimal = "45.5";
        String status = "true";


        int num = Integer.parseInt(number);
        double value = Double.parseDouble(decimal);
        boolean active = Boolean.parseBoolean(status);
        System.out.println("Integer: " + num);
        System.out.println("Double: " + value);
        System.out.println("Boolean: " + active);

        System.out.println("Sum: " + (num + value));

    }
}