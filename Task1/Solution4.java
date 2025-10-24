package Task1;
import java.util.Scanner;

// Write a java program to Find the smallest number among three numbers .
public class Solution4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = obj.nextInt();
        System.out.print("Enter second number: ");
        int num2 = obj.nextInt();
        System.out.print("Enter third number: ");
        int num3 = obj.nextInt();

        //Smallest number among three numbers
        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1 + " is the smallest");
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2 + " is the smallest");
        } else {
            System.out.println(num3 + " is the smallest");
        }
    }
}

/*
Output
Enter first number: 6
Enter second number: 9
Enter third number: 3
3 is the smallest
*/