package Task4.Solution5;
import java.util.*;

public class Solution5 {
    public static void main(String[] args) {
        IntStack s = new IntStack();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStack Operations Menu");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Display Stack Elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to push: ");
                    int element = sc.nextInt();
                    s.pushElement(element);
                    break;

                case 2:
                    s.popElement();
                    break;

                case 3:
                    s.checkEmpty();
                    break;

                case 4:
                    s.displayStack();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
