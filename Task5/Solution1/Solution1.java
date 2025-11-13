package Task5.Solution1;

import java.util.List;
import java.util.stream.*;

public class Solution1 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "cf");

        // Convert all strings to uppercase and collect into a list
        List<String> upperNames = names.map(String::toUpperCase)
                .toList();

        // Print the result
        System.out.println("Uppercase strings: " + upperNames);
    }
}