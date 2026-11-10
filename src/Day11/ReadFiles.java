package Day11;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class ReadFiles {
    public static void main(String[] args) {

        Path path = Paths.get("employees.txt");

        try {
            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
