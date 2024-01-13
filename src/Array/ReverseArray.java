package Array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {
    public static <T> T[] reverse(T[] array) {
        return IntStream.rangeClosed(1, array.length)
                .mapToObj(i -> array[array.length - i])
                .toArray(size -> Arrays.copyOf(array, size));
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(arr)));

        String[] strArr = {"Hello", "World", "Java", "8"};
        System.out.println(Arrays.toString(reverse(strArr)));

    }
}
