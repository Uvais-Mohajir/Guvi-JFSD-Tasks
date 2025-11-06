package Task4.Solution4;
import java.util.*;

public class StudentGrade {
    // HashMap to store student names and grades
    HashMap<String, Integer> g = new HashMap<>();

    // Method to add a student
    public void addStudent(String name, int grade) {
        g.put(name, grade);
        System.out.println("Student '" + name + "' added with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (g.containsKey(name)) {
            g.remove(name);
            System.out.println("Student '" + name + "' removed successfully.");
        } else {
            System.out.println("Student '" + name + "' not found.");
        }
    }

    // Method to display a student's grade
    public void displayGrade(String name) {
        if (g.containsKey(name)) {
            System.out.println(name + "'s Grade: " + g.get(name));
        } else {
            System.out.println("Student '" + name + "' not found.");
        }
    }

    // Method to display all students
    public void displayAll() {
        if (g.isEmpty()) {
            System.out.println("No student records available.");
        } else {
            System.out.println("\nAll Student Grades:");
            for (String name : g.keySet()) {
                System.out.println(name + " : " + g.get(name));
            }
        }
    }
}