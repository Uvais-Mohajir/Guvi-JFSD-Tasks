package Task4.Solution2;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Voter ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            // Create Voter Object
            Voter v = new Voter(id, name, age);
            v.display();
        } catch (InvalidVoterAgeException e) {
            System.out.println("\nError: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nUnexpected Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}