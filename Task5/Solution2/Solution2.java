package Task5.Solution2;


import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        // Given List
        List<String> strings = Arrays.asList("abe", "", "be", "efg", "abcd", "", "ikl");

        // Create a new list to store non-empty strings
        List<String> nonEmptyStrings = new ArrayList<>();

        // Iterate through the list and add only non-empty strings
        for (String str : strings) {
            if (!str.isEmpty()) {
                nonEmptyStrings.add(str);
            }
        }

        // Print the list of non-empty strings
        System.out.println("List with non-empty strings: " + nonEmptyStrings);
    }
}