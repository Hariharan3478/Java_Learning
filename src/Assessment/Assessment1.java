package Assessment;
//Write a Java method named square that accepts an integer and returns
// its square. For example, square(4) should return 16.

public class Assessment1 {
    public static void main(String[] args) {

        int result = square(-4);
        System.out.println(result);
    }
    static int square(int number){
        return number * number;
    }
}
