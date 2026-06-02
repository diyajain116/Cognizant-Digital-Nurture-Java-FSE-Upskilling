public class TypeCastingExample {

    public static void main(String[] args) {

        // Double to int casting
        double decimalNumber = 45.67;
        int intValue = (int) decimalNumber;

        // Int to double casting
        int wholeNumber = 25;
        double doubleValue = (double) wholeNumber;

        // Display results
        System.out.println("Original double value: " + decimalNumber);
        System.out.println("After casting to int: " + intValue);

        System.out.println("Original int value: " + wholeNumber);
        System.out.println("After casting to double: " + doubleValue);
    }
}