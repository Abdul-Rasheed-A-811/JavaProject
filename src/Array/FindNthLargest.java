package Array;

import java.util.Arrays;

public class FindNthLargest {

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 3, 2};
        int[] b = {44, 66, 99, 77, 33, 22, 55};
        int n = 5;
        System.out.println("Second Largest: " + getSecondLargest(a, n));
        System.out.println("Second Largest: " + getSecondLargest(b, n));
    }

    public static int getSecondLargest(int[] a, int n) {
        return Arrays.stream(a)
                .distinct()
                .sorted()
                .skip(a.length - n)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Array should contain at least two distinct elements"));
    }
}
