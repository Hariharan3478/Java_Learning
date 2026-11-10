package Day11;

import java.nio.file.*;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class AppendData {
    public static void main(String[] args) {

        Path path = Paths.get("employees.txt");

        try {
            Files.write(
                    path,
                    "\n103, Rahul, Finance".getBytes(),
                    StandardOpenOption.APPEND
            );

            System.out.println("Data appended!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
