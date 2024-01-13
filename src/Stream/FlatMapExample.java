package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "stream");

        List<Character> uniqueCharacters = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueCharacters);
    }
}
