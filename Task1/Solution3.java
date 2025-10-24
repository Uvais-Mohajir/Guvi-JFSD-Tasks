package Task1;
import java.util.Scanner;

// Write a program that find a given number is negative or positive
public class Solution3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = obj.nextInt();

        // Positive or Negative or Zero
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}

/*
Output
Enter a Number: 1234
Positive

Enter a Number: -987
Negative
*/