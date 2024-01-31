package ie.atu.Productv5;

import java.util.Scanner;

public class ProductApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Product Viewer");
        System.out.println();

        // perform 1 or more selections
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();  // read the product code

            Product yourProduct = ProductDB.getProduct(productCode);

            System.out.println();
            if (yourProduct != null) {
                System.out.println("Description: " + yourProduct.toString());
                System.out.println("Price:       " + yourProduct.getPriceFormatted());
            } else {
                System.out.println("No product matches this product code.");
            }

            System.out.println();
            System.out.println("Product count: " + Product.getCount() + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();

        }
    }
}
