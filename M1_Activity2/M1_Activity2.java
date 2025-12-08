package M1_Activity;
import java.util.Scanner;

public class M1_Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		String input = scanner.next();
		int intAge= Integer.parseInt(input);
		double doubleAge = Double.parseDouble(String.valueOf(intAge));
		
		System.out.println("Your age in int: " + intAge);
		System.out.println("Your age in double: "+ doubleAge);

		scanner.close();
	}

}
