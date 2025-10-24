package Task1;

// Write a program to print the numbers from 10 to 50 using for loop/while loop.
public class Solution1 {
    public static void main(String[] args) {

        //ForLoop
        System.out.println("Numbers from 10 to 50 using for loop:");
        for (int i = 10; i <= 50; i++) {
            System.out.print(i+ " ");
        }
        System.out.println("\n");

        // WhileLoop
        System.out.println("Numbers from 10 to 50 using while loop:");
        int i = 10;
        while (i <= 50) {
            System.out.print(i+ " ");
            i++;
        }
    }
}

/*
Output
Numbers from 10 to 50 using for loop:
10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50

Numbers from 10 to 50 using while loop:
10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50
*/