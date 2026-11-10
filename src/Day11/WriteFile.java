package Day11;

import java.nio.file.*;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        Path path = Paths.get("employees.txt");

        try {
            Files.write(path, "101, Hari, IT\n102, Arun, HR".getBytes());

            System.out.println("File created and data written!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
