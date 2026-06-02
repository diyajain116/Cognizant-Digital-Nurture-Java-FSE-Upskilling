import java.util.Scanner;

public class RecursiveFibonacci {

    // Recursive method to calculate Fibonacci number
    static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input value of n
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check valid input
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } 
        else {
            int result = fibonacci(n);

            // Display result
            System.out.println("Fibonacci number at position " + n + " is: " + result);
        }

        sc.close();
    }
}

