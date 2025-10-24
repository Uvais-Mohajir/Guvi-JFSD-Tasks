package Task1;
import java.util.Scanner;

// Write down the program to reverse the given number using loops
public class Solution2 {
    public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.print("Original Number: ");
            int num = obj.nextInt();
            int r = 0;
            int sign = 1;

            if (num < 0) {
                sign = -1;
                num = -num;
            }
            for (int i = num; i != 0; i /= 10) {
                int digit = i % 10;
                r = r * 10 + digit;
            }
            //Reverse Number
            int rev = r* sign;
            System.out.println("Reverse Number: " +rev);
    }
}

/*
Output
Original Number: 0987654
Reverse Number: 456789

Original Number: -12345
Reverse Number: -54321
*/