package Day19;

public class ScopedValuesDemo {

    static final ScopedValue<String> USER =
            ScopedValue.newInstance();

    public static void main(String[] args) {

        ScopedValue.where(USER, "Hari")
                .run(() -> {
                    displayUser();
                    processRequest();
                });
    }

    static void displayUser() {
        System.out.println("User: " + USER.get());
    }

    static void processRequest() {
        System.out.println(
                "Processing request for: " + USER.get()
        );
    }
}