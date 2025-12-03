/**
 * 
 */
package M1_Activity;
import java.util.Scanner;

/**
 * 
 */
public class M1_Activity3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int int1 = scanner.nextInt();
		System.out.print("Enter second integer: ");
		int int2 = scanner.nextInt();
		
		int sum = sum(int1,int2);
		int difference = subtract(int1,int2);
		int product = multiply(int1,int2);
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		scanner.close();
		}
		
		public static int sum(int a,int b) {
			return a + b;
		}
		public static int subtract(int a,int b) {
			return a - b;
		}
		public static int multiply(int a,int b) {
			return a * b;
		}
	}

