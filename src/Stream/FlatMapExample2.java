package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample2 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java streams are powerful",
                "FlatMap is a useful operation",
                "Stream processing is concise and expressive"
        );

        List<String> distinctWords = sentences.stream()
                .map(sentence -> sentence.split("\\s+")) // Split each sentence into words
                .flatMap(Arrays::stream) // Flatten the stream of arrays into a single stream of words
                .distinct()
                .collect(Collectors.toList());

        List<String> alternateWay = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .distinct()
                .toList();

        System.out.println(distinctWords);
        System.out.println("Other ways to do:" + alternateWay);
    }
}

