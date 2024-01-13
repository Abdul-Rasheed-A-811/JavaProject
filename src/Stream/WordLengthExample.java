package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordLengthExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        List<Integer> wordLengths = words.stream()
                .map(String::length)  // Map each word to its length
                .toList();  // Collect the lengths into a list

        System.out.println("Word lengths: " + wordLengths);
    }
}

