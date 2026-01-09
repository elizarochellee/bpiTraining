package m3_activity1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M3_Activity1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Printer");

        System.out.println("Initial Products:");
        
        for(int i=0; i < products.size(); i++) {
        	System.out.println(products.get(i));	    	
        }
        
        products.add("Webcam");
        products.remove("Mouse");

        System.out.println("\nAfter adding and removing products:");
        printList(products);

        // Search
        System.out.print("\nEnter product name to search: ");
        String search = input.nextLine();

        // Search using contains()
        if (products.contains(search)) {
        	System.out.println("Product found: " + search);
        } else {
        	System.out.println("Product not found.");
        	}
        input.close();
	}

	private static void printList(List<String> list) {
    	for (int i = 0; i < list.size(); i++) {
                      System.out.println((i + 1) + ". " + list.get(i));
    	}
	}
}
