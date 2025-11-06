package Task4.Solution3;
import java.util.Scanner;

public class Solution3_WeekdayArray {
    public static void main(String[] args) {
    // Weekday array with Sunday at index 0
    String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    Scanner sc = new Scanner(System.in);
    try {
        System.out.print("Enter day index (0–6): ");
        int index = sc.nextInt();
        // Try to access the day
        System.out.println("Day: " + weekdays[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error: Please enter a valid index between 0 and 6.");
    } catch (Exception e) {
        System.out.println("Unexpected Error: " + e.getMessage());
    } finally {
        sc.close();
    }
}
}