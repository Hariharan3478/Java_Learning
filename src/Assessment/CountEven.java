package Assessment;

//Write a Java method named countEven that accepts an integer array
// and returns how many numbers in the array are even.
// For example, for {2, 5, 8, 3}, it should return 2. Assume the array is not null.

public class CountEven {
    public static void main(String[] args){
        int[] arr={2,4,3,1,7,4,6,8,2,2};
        System.out.println(count(arr));
    }

    static int count(int[] arr){
        int count=0;
         for (int i=0;i<arr.length;i++){
             if(arr[i]%2==0){
                 count++;
             }
         }
         return count;
    }
}
