package Day08;


import java.util.*;

public class CollectionUtilities {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(10, 30, 20, 50, 40, 20)
        );

        System.out.println("Original: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        System.out.println("Maximum: " + Collections.max(numbers));

        System.out.println("Minimum: " + Collections.min(numbers));

        System.out.println("Frequency of 20: " + Collections.frequency(numbers, 20));

        Collections.swap(numbers, 0, 1);
        System.out.println("After swap: " + numbers);

        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 30);
        System.out.println("Index of 30: " + index);

        List<Integer> values = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );

        Collections.fill(values, 100);
        System.out.println("After fill: " + values);

        List<Integer> source = Arrays.asList(10, 20, 30);
        List<Integer> destination = new ArrayList<>(Arrays.asList(0, 0, 0));

        Collections.copy(destination, source);
        System.out.println("After copy: " + destination);

        List<Integer> rotateList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );

        Collections.rotate(rotateList, 2);
        System.out.println("After rotate: " + rotateList);

        List<Integer> replaceList = new ArrayList<>(
                Arrays.asList(10, 20, 10, 30)
        );

        Collections.replaceAll(replaceList, 10, 99);
        System.out.println("After replace: " + replaceList);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        System.out.println("Disjoint: " + Collections.disjoint(list1, list2));
    }
}

