import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Calculator {

    public void greet() {
        System.out.println("Hello from greet() method");
    }

    public int add(int a, int b) {
        return a + b;
    }
}

public class ReflectionDemo {

    public static void main(String[] args) {

        try {

            // Load class dynamically
            Class<?> cls = Class.forName("Calculator");

            // Create object dynamically
            Object obj = cls.getDeclaredConstructor().newInstance();

            // Print all methods and parameters
            System.out.println("Methods in Calculator class:");

            Method[] methods = cls.getDeclaredMethods();

            for (Method method : methods) {

                System.out.print("Method: " + method.getName());

                Parameter[] params = method.getParameters();

                System.out.print(" (Parameters: ");

                for (int i = 0; i < params.length; i++) {
                    System.out.print(params[i].getType().getSimpleName());

                    if (i < params.length - 1) {
                        System.out.print(", ");
                    }
                }

                System.out.println(")");
            }

            // Invoke method dynamically
            Method greetMethod = cls.getDeclaredMethod("greet");

            System.out.println("\nInvoking greet() dynamically:");

            greetMethod.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
