package Assessment;
//Create a simple student marks program. Ask for a student's name and marks in three subjects.
// Display the student's name, total marks, and average marks. Assume each subject mark is between 0 and 100.
// Use simple variables, input, arithmetic, and output.

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Maths mark: ");
        int maths=sc.nextInt();
        System.out.print("Enter Physics mark: ");
        int physics=sc.nextInt();
        System.out.print("Enter Chemistry mark: ");
        int chemistry=sc.nextInt();

        int total=maths+physics+chemistry;
        float avg=total/3;

        System.out.println("Student Name : " + name);
        System.out.println("Total Marks: "+ total);
        System.out.println("Average :" + avg);
    }
}
