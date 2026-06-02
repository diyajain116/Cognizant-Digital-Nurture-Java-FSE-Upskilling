import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();

        long factorial = 1;

        // Check for negative number
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
        else {

            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            // Display result
            System.out.println("Factorial of " + number + " = " + factorial);
        }

        sc.close();
    }
}
