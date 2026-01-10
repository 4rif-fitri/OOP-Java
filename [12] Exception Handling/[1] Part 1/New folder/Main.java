
import java.util.Scanner;


class Main{
	// public static void main(String[] args) {
	// 	Scanner input = new Scanner(System.in);
	// 	System.out.println("input Number : ");
	// 	int num = input.nextInt();
	// 	System.out.println(" > " + num);
	// }

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		System.out.println("Number > ");
		 try {
			  int num = input.nextInt();
			  System.out.println("> " + num);
		 } catch (Exception e) {
			System.out.println("Invalid Input");
		 }
	}
}