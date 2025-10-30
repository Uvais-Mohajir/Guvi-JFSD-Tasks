package Task2.Solution2;
import java.util.Scanner;


public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // a) Accept 5 product information from user
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Enter Product ID: ");
            int pid = sc.nextInt();
            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Product Quantity: ");
            int quantity = sc.nextInt();
            System.out.println();

            products[i] = new Product(pid, price, quantity);
        }
        double maxPrice = products[0].price;
        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
            }
        }

        // Display all products with that highest price
        System.out.println("\nProducts with highest price: " + maxPrice);
        for (Product p : products) {
            if (p.price == maxPrice) {
                System.out.println("Product ID for highest price: " + p.pid);
            }
        }

        // c) Calculate total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("\nTotal amount spent on all products: " + totalAmount);

        sc.close();
    }
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }
}