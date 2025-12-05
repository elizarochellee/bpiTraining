/**
 * 
 */
package M1_Activity;
import java.util.Scanner;

/**
 * 
 */
public class M1_Activity1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = scanner.next();
		
		System.out.println("Hello, " + name + "!");
		scanner.close();
	}

}
