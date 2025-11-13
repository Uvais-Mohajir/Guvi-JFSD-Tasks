package Task5.Solution3;
import java.util.*;
import java.util.stream.Collectors;

public class Solution3 {
    public static void main(String[] args) {
        // Create a list of student names
        List<String> students = Arrays.asList(
                "Amit", "Riya", "Arjun", "Neha", "Anjali",
                "Rahul", "Ayesha", "Vikram", "Aman", "Sneha"
        );

        // Filter students whose names start with 'A' using Stream and Lambda
        List<String> studentsStartsWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Filter students whose names start with 'A' using Stream and Lambda
        List<String> studentsEndsWithA = students.stream()
                .filter(name -> name.endsWith("a"))
                .collect(Collectors.toList());

        // Display results
        System.out.println("All Students: " + students);
        System.out.println("\nStudents receiving special gifts (start with 'A'): " + studentsStartsWithA);
        System.out.println("\nStudents receiving special gifts (end with 'A'): " + studentsEndsWithA);
    }
}