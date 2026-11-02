package Day06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {

    public static void main(String[] args) {

        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

    }
}
