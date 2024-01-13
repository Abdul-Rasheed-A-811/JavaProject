package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWordsExample {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java streams are powerful",
                "Stream operations are expressive",
                "Powerful streams simplify coding"
        );

        List<String> uniqueWords = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .distinct()
                .toList();

        System.out.println("Unique words: " + uniqueWords);
    }
}

