package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfSquaresOfEvenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)   // Filter even numbers
                .mapToInt(evenNumber -> evenNumber * evenNumber)  // Square each even number
                .sum();  // Sum the squared even numbers

        System.out.println("Sum of squares of even numbers: " + sumOfSquaresOfEvenNumbers);
    }
}

