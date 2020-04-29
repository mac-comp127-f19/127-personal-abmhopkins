package streamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StringDemo {
    public static void main(String args[]){
        List<String> names = new ArrayList<String>();

        names.add("Alex");
        names.add("Gabi");
        names.add("Bill");
        names.add("Caroline");
        names.add("Quince");
        names.add("Chris");
        names.add("Carole");
        names.add("Josh");
        names.add("Sophia");
        names.add("Annabel");

        Stream<String> s = names.stream();
        s.forEach(System.out::println);
        System.out.println("===================");

        long numElements = names.stream()
                        .count();
        System.out.println("The size of the list is " + numElements);
        System.out.println("===================");

        List<String> sortedNames = names.stream()
                .sorted()
                .collect(toList());
        System.out.println(sortedNames);
        System.out.println("===================");

        List<String> longNames = names.stream()
                .filter(n -> n.length() > 5)
                .collect(toList());
        System.out.println(longNames);
        System.out.println("===================");

        List<String> longestName = names.stream()
                .sorted(comparing(n -> -n.length()))
                .limit(1)
                .collect(toList());
        s = longestName.stream();
        s.forEach(System.out::println);
        System.out.println("===================");
    }
}
