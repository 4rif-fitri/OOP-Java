import java.util.Scanner;

public class AgeAccessCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        try {
            checkAge(age);
            System.out.println("Access granted - You are old enough!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Access denied - You must be at least 18 years old.");
        }
    }
}
