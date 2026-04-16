import java.util.*;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

public class example13 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("A", 30),
                new Person("B", 20)
        );

        list.stream()
                .sorted(Comparator.comparing(p -> p.age))
                .forEach(p -> System.out.println(p.name));
    }
}