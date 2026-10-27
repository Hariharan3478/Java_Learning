package Day02;

public class Palindrome {
    public static void main(String[] args) {
        String text = "malayalam";

        int left = 0;
        int right = text.length() - 1;

        boolean palindrome = true;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
