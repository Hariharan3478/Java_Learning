package Day02;

public class CharFrequency {

    public static void main(String[] args) {

        String text = "banana";
        String visited = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (visited.indexOf(ch) != -1) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (ch == text.charAt(j)) {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);

            visited += ch;
        }
    }
}