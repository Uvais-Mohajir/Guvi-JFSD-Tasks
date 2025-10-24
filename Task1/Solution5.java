package Task1;
import java.util.Scanner;

//Write a Java program that takes the purchase amount as input and calculates the final payable amount after applying the discount.
//1. If the purchase amount is less than 500, no discount is applied.
//2. If the purchase amount is between 500 and 1000, a 10% discount is applied.
//3. If the purchase amount is greater than 1000 a 20% discount is applied.

public class Solution5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Purchase Amount: ");
        double pAmount = obj.nextDouble();

        if (pAmount <= 0) {
            System.out.println("Invaild Amount or Zero");
        }
        else {
            double dis = 0.0;
            if (pAmount < 500) {
                dis = 0.0;  // 0% discount
            } else if (pAmount <= 1000) {
                dis = 0.10 * pAmount;  // 10% discount
            } else {
                dis = 0.20 * pAmount;  // 20% discount
            }
            double fAmount = pAmount - dis;
            double disPercent = (dis/pAmount)*100;
            System.out.println("Discount: " +disPercent+ "%");
            System.out.println("Final payable amount after applying the discount");
            System.out.println("Final Amount: " +fAmount);
        }
    }
}

/*
Output
Purchase Amount: 5000
Discount: 20.0%
Final payable amount after applying the discount
Final Amount: 4000.0

Purchase Amount: 0
Invaild Amount or Zero
*/