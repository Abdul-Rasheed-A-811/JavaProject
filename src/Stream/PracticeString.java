package Stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeString {
    public static void main(String[] args) {
        String input = "Java articles are Awesome and Java is the best";
        System.out.println("find the first non-repeated character in it using Stream functions");
        input.chars() //Convert the string to an IntStream of characters
                .mapToObj(s -> Character.toLowerCase((char) s)) //Convert each character to lowercase
                .collect(Collectors.groupingBy(
                        Function.identity(), //Group the characters by their identity (character itself)
                        LinkedHashMap::new, //Use a LinkedHashMap to preserve the order of insertion
                        Collectors.counting())) //Count the occurrences of each character
                .entrySet() //Convert the map entries to a set of entries
                .stream()  //Convert the set to a stream of entries
                .filter(entry -> entry.getValue() == 1)  //Filter out entries with count != 1
                .map(Map.Entry::getKey)  //Map the entries to their keys (characters)
                .findFirst()  //Find the first non-repeated character
                .ifPresent(System.out::println);  //Print the result if it is present

        System.out.println("Print all the repeated characters in it using Stream functions");
        input.chars()
                .mapToObj(s -> Character.toLowerCase((char) s))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .toList()
                .forEach(obj -> System.out.println(obj.getKey() + ":" + obj.getValue()));
    }
}
