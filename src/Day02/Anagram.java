package Day02;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";

        char[] a = first.toLowerCase().toCharArray();
        char[] b = second.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
