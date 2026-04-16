import java.util.*;

class Student {
    String name;
    int age;
    double grade;

    Student(String n, int a, double g) {
        name = n;
        age = a;
        grade = g;
    }
}

public class example14 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ali", 20, 85),
                new Student("Dana", 22, 70),
                new Student("Oleg", 19, 90)
        );

        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(s -> System.out.println(s.name));
    }
}