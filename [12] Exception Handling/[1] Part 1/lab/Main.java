
import java.io.IOException;
import java.util.Scanner;

class Main{

	public static void one() throws Exception {
		int age;
		Scanner input = new Scanner(System.in);
		System.out.print("Age : ");
		age = input.nextInt();

		if(age < 18) 
			throw new Exception("Access denied - You must be at least 18 years old"); 
		else 
			System.out.println("Access granted - You are old enough!");
			 
		input.close();
	}

	public static void two(String fileName) throws IOException{
		        if (!fileName.endsWith(".txt")) {
            throw new IOException("Invalid file type. Only .txt files are allowed.");
        }
        System.out.println("File accepted: " + fileName);
	}

	public static void main(String[] args) {
		try {
			one();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			two("data.txt");
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
};
