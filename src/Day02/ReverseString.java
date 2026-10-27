package Day02;

public class ReverseString {
    public static void main(String[] args) {
        String text = "Hariharan";
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.println(reversed);
    }
}