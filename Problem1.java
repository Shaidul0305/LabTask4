import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take first number input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Take second number input
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculate sum
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
