package Stream;

import java.util.*;

public class PracticeInt {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15, 18);
        System.out.println("Find numbers starting with 1 using stream api");
        myList.stream().map(String::valueOf).filter(s -> s.startsWith("1")).forEach(System.out::println);
        System.out.println("Find even numbers starting with 1 using stream api");
        myList.stream().filter(x -> x % 2 == 0).map(String::valueOf).filter(s -> s.startsWith("1")).forEach(System.out::println);
        System.out.println("Print duplicates using stream functions");
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
        System.out.println("Find the first element of the list using Stream functions");
        myList.stream().findFirst().ifPresent(System.out::println);
        System.out.println("Find the total number of elements present in the list using Stream functions");
        System.out.println(myList.stream().count());
        System.out.println("find the maximum value element present in it using Stream functions");
        System.out.println(myList.stream().max(Integer::compare).get());
        System.out.println("sort all the values present in it using Stream functions");
        myList.stream().sorted(Comparator.naturalOrder()).toList().forEach(System.out::println); // reverseOrder for descending
        System.out.println("Return true if any value appears at least twice in the array, and return false if every element is distinct");
        Set<Integer> uniqueInts = new HashSet<>(myList);
        System.out.println(uniqueInts.size() == myList.size());
    }

}
