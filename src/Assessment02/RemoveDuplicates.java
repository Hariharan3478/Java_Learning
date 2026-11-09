package Assessment02;

//Coding 2: Remove duplicates from a list while preserving encounter order.

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
        List<Integer> elements=Arrays.asList(10,20,20,30,40,40,40,50,60,70);

        Set<Integer> set=new LinkedHashSet<>(elements);

        List<Integer> result=new LinkedList<>(set);

        System.out.println(result);
    }
}
