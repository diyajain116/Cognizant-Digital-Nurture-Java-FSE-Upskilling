import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        /*Reversing using a loop
        
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        sc.close();
        
        */

        // Reverse using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        // Display result
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}