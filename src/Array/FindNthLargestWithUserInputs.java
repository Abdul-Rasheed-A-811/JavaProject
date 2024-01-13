package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindNthLargestWithUserInputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the values of array a (space-separated): ");
        int[] a = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.print("Enter the values of array b (space-separated): ");
        int[] b = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Nth Largest for array a: " + getNthLargest(a, n));
        System.out.println("Nth Largest for array b: " + getNthLargest(b, n));

        scanner.close();
    }

    public static int getNthLargest(int[] a, int n) {
        return Arrays.stream(a)
                .distinct()
                .sorted()
                .skip(a.length - n)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Array should contain at least two distinct elements"));
    }
}
