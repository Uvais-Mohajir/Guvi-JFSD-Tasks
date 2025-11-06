package Task4.Solution4;
import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        StudentGrade sg = new StudentGrade();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nStudent Grades Menu");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    int grade = sc.nextInt();
                    sg.addStudent(name, grade);
                    break;

                case 2:
                    System.out.print("Enter Student Name to Remove: ");
                    String removeName = sc.nextLine();
                    sg.removeStudent(removeName);
                    break;

                case 3:
                    System.out.print("Enter Student Name to Display Grade: ");
                    String searchName = sc.nextLine();
                    sg.displayGrade(searchName);
                    break;

                case 4:
                    sg.displayAll();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
