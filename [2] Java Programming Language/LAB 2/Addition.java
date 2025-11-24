import java.util.Scanner; // program uses class Scanner

public class Addition {
	public static void main(String[] args) {
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		int number1; // first number to add
		int number2; // second number to add
		int sum; // sum of number1 and number2
		// read first number from user
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();

		// read second number from user
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		input.close();

		sum = number1 + number2; // sum up numbers
		System.out.printf("Sum is %d\n", sum);
	} // main
} // Addition