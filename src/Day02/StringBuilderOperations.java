package Day02;

public class StringBuilderOperations {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original: " + sb);

        sb.append(" Developer");
        System.out.println("Append: " + sb);

        sb.insert(5, "Senior ");
        System.out.println("Insert: " + sb);

        sb.replace(5, 11, "Lead");
        System.out.println("Replace: " + sb);

        sb.delete(5, 10);
        System.out.println("Delete: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);

        String result = sb.toString();
        System.out.println("String: " + result);
    }
}
