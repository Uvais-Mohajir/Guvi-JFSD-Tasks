package Task1;
import java.util.Scanner;

// Write a java program to print bellowed pattern ->i and j and k=>5
/*
55555
54444
54333
54322
54321
 */

public class Solution6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = obj.nextInt();
        System.out.println();

        //Pattern Print

        for (int i = 1; i <= n; i++) {          // loop for rows
            for (int j = 1; j <= n; j++) {      // loop for columns
                int m = n;                    // start from 5 each time

                for (int k = 1; k < i && k < j; k++) {
                    m--; // decrease number based on row and column position
                }
                System.out.print(m);
            }
            System.out.println();
        }
    }
}

/*
Output
Enter a Number: 5

55555
54444
54333
54322
54321
*/