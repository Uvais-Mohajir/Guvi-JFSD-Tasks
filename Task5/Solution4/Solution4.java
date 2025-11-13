package Task5.Solution4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for birthdate
        System.out.print("Enter your Birth Date (YYYY-MM-DD): ");
        String inputDate = sc.nextLine();

        // Parse input string to LocalDate
        LocalDate birthDate = LocalDate.parse(inputDate);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate total days between dates
        long totalDays = ChronoUnit.DAYS.between(birthDate, currentDate);

        // Convert total days into years, months, and days (approximate)
        long years = totalDays / 365;
        long remainDays = totalDays % 365;
        long months = remainDays / 30;
        long days = remainDays % 30;

        // Display the result
        System.out.println("\nYour Age is: " +years+ " Years,"  +months+ " months, and " +days+ " days.");

        sc.close();
    }
}
