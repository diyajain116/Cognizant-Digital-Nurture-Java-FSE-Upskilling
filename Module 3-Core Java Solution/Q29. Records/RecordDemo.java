import java.util.List;
import java.util.stream.Collectors;

// Record definition
record Person(String name, int age) {}

public class RecordDemo {

    public static void main(String[] args) {

        // Create record instances
        Person p1 = new Person("Diya", 20);
        Person p2 = new Person("Rahul", 17);
        Person p3 = new Person("Priya", 22);

        // Print records
        System.out.println("Individual Records:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Store records in a List
        List<Person> people = List.of(p1, p2, p3);

        // Filter persons whose age is 18 or above
        List<Person> adults = people.stream()
                                    .filter(person -> person.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("\nAdults (Age >= 18):");
        adults.forEach(System.out::println);
    }
}
