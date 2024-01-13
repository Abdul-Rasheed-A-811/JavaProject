import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        System.out.println("Enter the string :");
        String input = new Scanner(System.in).next();
        String inputString = "aabaaasd";

        // Count occurrences of each character using Stream API
        Map<Character, Long> charCountMap = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Display the character count
        System.out.println("Character count in the string '" + input + "':");
        charCountMap.forEach((character, count) -> System.out.println(character + ": " + count));
        S s = new S();
        System.out.println(s.b);
    }
}

class B extends CharacterCount {
    String b = "ABD";
}

class S extends B {
    String b = "ARB";
}