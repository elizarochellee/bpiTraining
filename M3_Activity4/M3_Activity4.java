package m3_activity4;

import java.util.LinkedList;
import java.util.Scanner;

public class M3_Activity41 {

    // -------------------------
    // Product CLASS
    // -------------------------
    public static class Product {
        private final String name;
        private final double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String toString() {
            return name + " - " + String.format("%.2f", price);
        }
    }

    // -------------------------
    // MAIN PROGRAM
    // -------------------------
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<Product> queue = new LinkedList<>();

        // 5 INITIAL PRODUCTS
        queue.add(new Product("Laptop", 45000.00));
        queue.add(new Product("Mouse", 500.00));
        queue.add(new Product("Keyboard", 1200.00));
        queue.add(new Product("Monitor", 8000.00));
        queue.add(new Product("Printer", 6500.00));

        double totalBill = 0.0;
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Enter option: ");
            String option = input.nextLine().trim();

            switch (option) {

                // -------------------------
                // OPTION 1: ADD PRODUCT
                // -------------------------
                case "1": {
                    System.out.print("Enter product name: ");
                    String name = input.nextLine().trim();

                    Double price = readPrice(input, "Enter product price: ");
                    if (price == null) {
                        System.out.println("Invalid price. Product NOT added.\n");
                        break;
                    }

                    queue.add(new Product(name, price));
                    System.out.println("Product added: " + name + " - " + String.format("%.2f", price) + "\n");
                    break;
                }

                // -------------------------
                // OPTION 2: PROCESS NEXT PRODUCT (FIFO)
                // -------------------------
                case "2": {
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty. No product to process.\n");
                        break;
                    }

                    Product next = queue.removeFirst();
                    totalBill += next.getPrice();

                    System.out.println("Processed: " + next);
                    System.out.println("Updated total bill: " + String.format("%.2f", totalBill) + "\n");
                    break;
                }

                // -------------------------
                // OPTION 3: COUNT PRODUCTS
                // -------------------------
                case "3":
                    System.out.println("Products currently in queue: " + queue.size() + "\n");
                    break;

                // -------------------------
                // OPTION 4: VIEW TOTAL BILL
                // -------------------------
                case "4":
                    System.out.println("Total bill so far: " + String.format("%.2f", totalBill) + "\n");
                    break;

                // -------------------------
                // OPTION 5: EXIT
                // -------------------------
                case "5":
                    System.out.println("Final total bill: " + String.format("%.2f", totalBill));
                    System.out.println("Closing cashier line...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1–5.\n");
            }
        }

        input.close();
    }

    private static void printMenu() {
        System.out.println("Select an option:");
        System.out.println("1 - Add a product");
        System.out.println("2 - Process next product");
        System.out.println("3 - Check number of products");
        System.out.println("4 - View total bill");
        System.out.println("5 - Exit");
    }

    private static Double readPrice(Scanner input, String prompt) {
        System.out.print(prompt);
        String text = input.nextLine().trim();

        try {
            double value = Double.parseDouble(text);
            if (value < 0) return null;
            return value;
        } catch (Exception e) {
            return null;
        }
    }
}
